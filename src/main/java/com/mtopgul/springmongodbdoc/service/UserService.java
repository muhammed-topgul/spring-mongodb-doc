package com.mtopgul.springmongodbdoc.service;

import com.mtopgul.springmongodbdoc.model.UserModel;
import com.mtopgul.springmongodbdoc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 16:14
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserModel> findAll01() {
        Sort sorted = Sort.by("first_name")
                .descending()
                .and(Sort.by("last_name"))
                .ascending();
        return userRepository.findAll(sorted);
    }

    public List<UserModel> findAll02() {
        Sort.TypedSort<UserModel> user = Sort.sort(UserModel.class);
        Sort sorted = user.by(UserModel::getFirstName)
                .ascending()
                .and(user.by(UserModel::getLastName))
                .descending();
        return userRepository.findAll(sorted);
    }

    public void searchByFirstName(String firstName) {
        Streamable<UserModel> streamable = userRepository.findUserModelByFirstNameContaining(firstName);
        System.out.println(streamable);
    }
}

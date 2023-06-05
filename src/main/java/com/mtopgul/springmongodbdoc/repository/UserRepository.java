package com.mtopgul.springmongodbdoc.repository;

import com.mtopgul.springmongodbdoc.model.UserModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:42
 */
@Repository
public interface UserRepository extends BaseRepository<UserModel, String> {
    UserModel findUserModelByEmail(String email, Sort sort);

    Streamable<UserModel> findUserModelByFirstNameContaining(String firstName);
}

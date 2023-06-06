package com.mtopgul.springmongodbdoc.repository;

import com.mtopgul.springmongodbdoc.model.UserModel;
import com.mtopgul.springmongodbdoc.model.UserStreamable;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:42
 */
@Repository
public interface UserRepository extends BaseRepository<UserModel, String>,
        CustomizedUserRepository,
        CustomizedSaveRepository<UserModel> {
    UserModel findUserModelByEmail(String email, Sort sort);

    Streamable<UserModel> findUserModelByFirstNameContaining(String firstName);

    UserStreamable findAllByEmailContaining(String text);

    UserModel getByEmail(String email);

    @Nullable
    UserModel findByEmail(@Nullable String email);

    Optional<UserModel> findOptionalByEmail(String emailAddress);
}

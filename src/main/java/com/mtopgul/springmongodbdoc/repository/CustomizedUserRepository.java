package com.mtopgul.springmongodbdoc.repository;

import com.mtopgul.springmongodbdoc.model.UserModel;

/**
 * @author muhammed-topgul
 * @since 06/06/2023 10:49
 */
public interface CustomizedUserRepository {
    void doSomethingOnUser(UserModel userModel);
}

package com.mtopgul.springmongodbdoc.repository;

import com.mtopgul.springmongodbdoc.model.UserModel;

/**
 * @author muhammed-topgul
 * @since 06/06/2023 10:49
 */
public class CustomizedUserRepositoryImpl implements CustomizedUserRepository {
    @Override
    public void doSomethingOnUser(UserModel userModel) {
        System.out.printf("Hello, I am %s %s%n", userModel.getFirstName(), userModel.getLastName());
    }
}

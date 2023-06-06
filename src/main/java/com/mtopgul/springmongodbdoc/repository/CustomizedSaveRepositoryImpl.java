package com.mtopgul.springmongodbdoc.repository;

import com.mtopgul.springmongodbdoc.model.UserModel;

/**
 * @author muhammed-topgul
 * @since 06/06/2023 10:59
 */
public class CustomizedSaveRepositoryImpl<T extends UserModel> implements CustomizedSaveRepository<T> {
    @Override
    public <S extends T> S saveData(S userModel) {
        System.out.println(userModel.getFirstName() + " is saved.");
        return userModel;
    }
}

package com.mtopgul.springmongodbdoc.repository;

/**
 * @author muhammed-topgul
 * @since 06/06/2023 10:58
 */
public interface CustomizedSaveRepository<T> {
    <S extends T> S saveData(S entity);
}

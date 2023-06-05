package com.mtopgul.springmongodbdoc.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:42
 */
@NoRepositoryBean
public interface BaseRepository<T, ID> extends CrudRepository<T, ID> {
    Optional<T> findById(ID id);

    <S extends T> S save(S entity);

    List<T> findAll(Sort sort);
}

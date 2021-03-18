package com.heo.todo.repository;

import java.util.Optional;

import com.heo.todo.entity.MainEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository {
    MainEntity save(MainEntity main);
    MainEntity replace(MainEntity main);
    MainEntity update(MainEntity main);
    Optional<MainEntity> findById(Long id);

}

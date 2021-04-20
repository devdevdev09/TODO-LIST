package com.heo.todo.repository;

import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;

public interface TodoRepository {
    Todo save(Todo todo);
    Optional<Todo> findById(Long id);
    Optional<Todo> findByName(String name);
    List<Todo> findAll();
}

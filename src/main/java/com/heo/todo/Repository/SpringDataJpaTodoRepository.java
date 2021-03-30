package com.heo.todo.repository;

import java.util.Optional;

import com.heo.todo.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaTodoRepository extends JpaRepository<Todo, Long>, TodoRepository {
    
    // @Override
    // Optional<Todo> findByName(String name);
    
}

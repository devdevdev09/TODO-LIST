package com.heo.todo.repository;

import com.heo.todo.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaTodoRepository extends JpaRepository<Todo, Long> {
    
    // @Override
    // Optional<Todo> findByName(String name);
    
}

package com.heo.todo.repository;

import java.util.List;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaTodoRepository extends JpaRepository<Todo, Long> {
    
    List<Todo> findByName(String name);

    List<Todo> findByType(Type type);

    List<Todo> findByTitle(Title title);

    List<Todo> findByIspublic(Boolean ispublic);

    List<Todo> findByStatus(Status status);
    
}

package com.heo.todo.service;

import java.util.Optional;

import com.heo.todo.entity.Todo;
import com.heo.todo.repository.JpaTodoRepository;
import com.heo.todo.repository.SpringDataJpaTodoRepository;
import com.heo.todo.repository.TodoRepository;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{

    SpringDataJpaTodoRepository todoRepository;

    public TodoServiceImpl(SpringDataJpaTodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @Override
    public Optional<Todo> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo update(Todo todo) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

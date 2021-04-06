package com.heo.todo.service;

import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;
import com.heo.todo.repository.SpringDataJpaTodoRepository;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{

    SpringDataJpaTodoRepository todoRepository;

    public TodoServiceImpl(SpringDataJpaTodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> saveList(List<Todo> todoList) {
        return todoRepository.saveAll(todoList);
    }
    
}

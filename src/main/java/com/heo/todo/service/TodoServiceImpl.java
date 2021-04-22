package com.heo.todo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.enums.Type;
import com.heo.todo.repository.SpringDataJpaTodoRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final SpringDataJpaTodoRepository todoRepository;

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
        todo.setRegdt(LocalDateTime.now());

        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> saveList(List<Todo> todoList) {
        return todoRepository.saveAll(todoList);
    }

    @Override
    public Todo updateStatus(Long id, Status status) {
        Todo todo = todoRepository.findById(id).orElseGet(Todo::new);
        
        todo.setId(id);
        todo.setModdt(LocalDateTime.now());
        todo.setStatus(status);
        
        return todoRepository.save(todo);
    }

    @Override
    public Todo copy(Long id) {
        // id를 받아서 일감을 복사한다음 
        // 새로운 id로 일감 추가

        // localdate time 되는지 with. jpa
        Todo copy = todoRepository.findById(id).orElse(null);
        copy.setId(null);

        copy.setRegdt(LocalDateTime.now());
        Todo todo = todoRepository.save(copy);

        return todo;
    }

    @Override
    public Todo finish(Long id) {
        Todo finish = findById(id).orElse(null);
        finish.setFinishdt(LocalDateTime.now());
        finish.setStatus(Status.COMPLETE_FINISH);

        Todo todo = todoRepository.save(finish);

        return todo;
    }

    @Override
    public List<Todo> findByName(String name) {
        return todoRepository.findByName(name);
    }

    @Override
    public List<Todo> findByType(Type type) {
        return todoRepository.findByType(type);
    }
    
}

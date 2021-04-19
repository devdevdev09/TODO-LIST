package com.heo.todo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.repository.SpringDataJpaTodoRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    SpringDataJpaTodoRepository todoRepository;

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

    @Override
    public Todo updateStatus(Long id, Status status) {
        Todo todo = new Todo();
        todo.setId(id);
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

        copy.setRegDt(LocalDateTime.now());
        Todo todo = todoRepository.save(copy);

        return todo;
    }

    @Override
    public Todo finish(Long id) {
        Todo finish = findById(id).orElse(null);
        finish.setFinishDt(LocalDateTime.now());
        finish.setStatus(Status.COMPLETE_FINISH);

        Todo todo = todoRepository.save(finish);

        return todo;
    }
    
}

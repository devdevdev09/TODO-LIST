package com.heo.todo.service;

import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.enums.Type;

public interface TodoService {

    public Optional<Todo> findById(Long id);

    public List<Todo> findByName(String name);

    public List<Todo> findByType(Type type);

    public List<Todo> findAll();

    public Todo save(Todo todo);

    public List<Todo> saveList(List<Todo> todoList);

    public Todo updateStatus(Long id, Status status);

    public Todo copy(Long id);

    public Todo finish(Long id);

    // ~ 03.31

    // 3. 완료 처리

    // ~ 04.04
    // 알림관리 > 메시지 봇으로 전송하기
    // 1. 지연알림
    // 2. 지속알림(remind)
    // 3. 완성알림X

    // ~ 04.11
    // 아주 뒤로..........일단 개인용
    // 회원관리
    // 1. OAuth 2.0
}

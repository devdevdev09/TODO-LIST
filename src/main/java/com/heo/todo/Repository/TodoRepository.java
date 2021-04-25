package com.heo.todo.repository;

import java.util.List;
import java.util.Optional;

import com.heo.todo.entity.Todo;

public interface TodoRepository {
    public boolean insertHistory(String log);
}

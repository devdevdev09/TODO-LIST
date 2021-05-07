package com.heo.todo.serviceimpl.action;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.service.ActionSerivce;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReadingAction implements ActionSerivce{

    private final Todo todo;

    @Override
    public Status updateAction() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

package com.heo.todo.serviceimpl.action;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.service.ActionSerivce;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CodingAction implements ActionSerivce{

    private final Todo todo;

    @Override
    public Status updateAction() {
        // if check ->
        // update status
        // return status
        // todo.setStatus(Status.COMPLETE_FINISH);
        return null;
    }
}

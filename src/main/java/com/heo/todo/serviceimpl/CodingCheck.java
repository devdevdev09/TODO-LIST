package com.heo.todo.serviceimpl;

import com.heo.todo.enums.Status;
import com.heo.todo.service.CheckService;

public class CodingCheck implements CheckService{

    private Status status;
    private boolean result;

    public CodingCheck(Status status){
        this.status = status;
    }

    @Override
    public boolean actionCheck() {
        // call commit counter;
        // check => result
        return false;
    }

    @Override
    public Status changeStatus() {
        // TODO Auto-generated method stub
        // action -> change status
        return null;
    }
}

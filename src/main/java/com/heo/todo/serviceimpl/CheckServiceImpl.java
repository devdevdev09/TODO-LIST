package com.heo.todo.serviceimpl;

import com.heo.todo.enums.Status;
import com.heo.todo.service.ActionSerivce;
import com.heo.todo.service.CheckService;

import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {

    @Override
    public boolean actionCheck(ActionSerivce actionSerivce) {
        Status status = actionSerivce.updateAction();
        // return status or boolean?
        return false;
    }

    @Override
    public Status changeStatus() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

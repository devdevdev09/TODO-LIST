package com.heo.todo.serviceimpl;

import com.heo.todo.enums.Status;
import com.heo.todo.service.ActionSerivce;
import com.heo.todo.service.CheckService;

import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {

    @Override
    public boolean actionCheck(ActionSerivce actionSerivce) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Status changeStatus() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

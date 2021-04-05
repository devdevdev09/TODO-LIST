package com.heo.todo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    @Override
    public boolean send(String msg) {
        // restutil > call local msg bot 
        return false;
    }
    
}

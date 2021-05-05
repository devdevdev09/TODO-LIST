package com.heo.todo.service;

import com.heo.todo.enums.Status;

public interface CheckService {
    
    public boolean actionCheck(ActionSerivce actionSerivce);

    public Status changeStatus();
}

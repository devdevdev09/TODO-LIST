package com.heo.todo.entity;

import java.util.Date;

import com.heo.todo.enums.Status;

public class Todo {
    Long id;
    Date date;
    String title;
    String subject;
    
    Status status;
}

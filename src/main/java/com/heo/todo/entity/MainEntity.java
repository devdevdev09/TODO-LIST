package com.heo.todo.entity;

import lombok.Data;

@Data
public class MainEntity {
    Long id;
    String date;
    String name;
    String subject;
    String desc;
}

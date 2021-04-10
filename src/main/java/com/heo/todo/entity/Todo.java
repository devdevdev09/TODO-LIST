package com.heo.todo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name; // user
    String title;
    String subject;
    
    String status;

    LocalDateTime finishDt;
    LocalDateTime regDt;
    LocalDateTime modDt;
}

package com.heo.todo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.heo.todo.enums.Status;

import lombok.Data;

@Entity
@Data
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    // Date date;

    String name; // user
    String title;
    String subject;
    
    String status;
}

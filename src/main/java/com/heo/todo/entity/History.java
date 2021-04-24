package com.heo.todo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.heo.todo.enums.Status;
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;

import lombok.Data;

@Entity
@Data
public class History {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    Long todoid; // ref

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime regdt;

    Status status;
    Title title;
    Type type;
}

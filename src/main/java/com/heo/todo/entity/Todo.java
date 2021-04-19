package com.heo.todo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

    String name; // user
    String title;
    String subject;
    
    @Enumerated(EnumType.STRING)
    private Status status;

    boolean isPublic; // 공개/비공개

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime finishDt;

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime regDt;

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime modDt;
}

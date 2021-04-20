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

import org.hibernate.annotations.CreationTimestamp;

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

    boolean ispublic; // 공개/비공개

    // https://www.baeldung.com/jpa-java-time
    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime finishdt;

    @Column(name="regdt", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    LocalDateTime regdt;

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime moddt;
}

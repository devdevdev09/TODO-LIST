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
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;

import lombok.Data;

@Entity
@Data
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name; // user
    @Enumerated(EnumType.STRING)
    Title title;
    @Enumerated(EnumType.STRING)
    Type type;
    @Enumerated(EnumType.STRING)
    private Status status;

    Boolean ispublic; // 공개/비공개

    // https://www.baeldung.com/jpa-java-time
    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime finishdt;
    
    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime regdt;

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime moddt;

    // 기타 잡담 및 설명
    String desc;

    
}

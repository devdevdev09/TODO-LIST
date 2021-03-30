package com.heo.todo.repository;

import javax.persistence.EntityManager;

import com.heo.todo.entity.Todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@Transactional
public class JpaTodoRepositoryTest {


    @Autowired
    SpringDataJpaTodoRepository repository;

    @Test
    public void save(){
        Todo todo = new Todo();
        todo.setId(1L);
        todo.setName("tesssssss");
        todo.setTitle("tetet");
        todo.setSubject("ddddddddd");
        todo.setStatus("22222");
     
        repository.save(todo);

        Todo result = repository.findById(1L).get();
        assertThat(todo).isEqualTo(result);
    }
        
}

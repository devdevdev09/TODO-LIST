package com.heo.todo.repository;

import javax.persistence.EntityManager;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;
import com.heo.todo.service.TodoService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
public class JpaTodoRepositoryTest {

    @Autowired SpringDataJpaTodoRepository todoRepository;

    @Test
    public void save(){
        Todo todo = new Todo();
        Long id = 1L;

        todo.setId(id);
        todo.setName("testuser");
        todo.setType(Type.DAILY);
        todo.setTitle(Title.ETC);
        todo.setStatus(Status.TODO);
        todo.setIspublic(true);
        
        Todo save = todoRepository.save(todo);
        Todo result = todoRepository.findById(id).get();

        assertThat(save).isEqualTo(result);
    }
        
}

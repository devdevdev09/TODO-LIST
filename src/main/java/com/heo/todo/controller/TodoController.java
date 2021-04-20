package com.heo.todo.controller;

import java.time.LocalDateTime;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.service.MessageService;
import com.heo.todo.service.TodoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {
    
    private final TodoService todoService;
    private final MessageService messageService;

    @PostMapping("/todo")
    public Todo insertTodo(Todo todo){
        Todo result = todoService.save(todo);
        return result;
    }

    @GetMapping("/todo")
    public Todo getTodo(Long id){
        Todo todo = todoService.findById(id).get();
        return todo;
    }

    Long id = 10L;
    @GetMapping("/testinsert")
    public Todo testTodo(){
        Todo test = new Todo();
        test.setName("testname");
        test.setName("dae");
        test.setTitle("cote");
        test.setSubject("coding");
        test.setStatus(Status.TODO);
        test.setFinishdt(LocalDateTime.of(2021, 5, 20,22,10,00));
        
        Todo result = todoService.save(test);

        return result;
    }

    @GetMapping("/send")
    public boolean getSend(String msg){
        boolean result = messageService.send(msg);

        return result;
    }

    @GetMapping("/test/insert")
    public void getTest(){
        Todo todo = new Todo();
        todo.setName("test");

        Todo result = todoService.save(todo);

        System.out.println(todo);
        System.out.println(result);
    }


    // @GetMapping("/test/select")
    // public void getTest2(){
    //     Todo result = todoService.findById(1L).get();

    //     System.out.println(result);
    // }

    // @GetMapping("/test/update")
    // public void getTest3(){

    //     Todo todo = new Todo();
    //     todo.setId(33L);
    //     todo.setName("testUPDATE");
    //     Todo result = todoService.save(todo);

    //     System.out.println(result);
    // }
}

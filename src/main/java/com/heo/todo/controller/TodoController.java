package com.heo.todo.controller;

import com.heo.todo.entity.Todo;
import com.heo.todo.service.TodoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/testtodo")
    public void getTest(){
        Todo todo = new Todo();
        todo.setName("test");

        Todo result = todoService.save(todo);

        System.out.println(todo);
        System.out.println(result);
    }
}

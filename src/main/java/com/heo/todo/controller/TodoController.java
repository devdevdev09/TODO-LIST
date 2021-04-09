package com.heo.todo.controller;

import com.heo.todo.entity.Todo;
import com.heo.todo.service.TodoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

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

    // @GetMapping("/test/insert")
    // public void getTest(){
    //     Todo todo = new Todo();
    //     todo.setName("test");

    //     Todo result = todoService.save(todo);

    //     System.out.println(todo);
    //     System.out.println(result);
    // }


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

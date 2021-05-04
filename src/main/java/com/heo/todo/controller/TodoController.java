package com.heo.todo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Status;
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;
import com.heo.todo.service.CheckService;
import com.heo.todo.service.MessageService;
import com.heo.todo.service.TodoService;
import com.heo.todo.serviceimpl.CodingCheck;
import com.heo.todo.serviceimpl.ReadingCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {
    
    private final TodoService todoService;
    private final MessageService messageService;

    @GetMapping("/todo")
    public Todo getTodoById(Long id){
        Todo todo = todoService.findById(id).get();
        return todo;
    }

    @GetMapping("/todo/{name}/name")
    public List<Todo> getTodoByName(@PathVariable String name){
        List<Todo> todo = todoService.findByName(name);
        return todo;
    }

    @GetMapping("/todo/{type}/type")
    public List<Todo> getTodoByType(@PathVariable Type type){
        List<Todo> todo = todoService.findByType(type);
        return todo;
    }

    @PostMapping("/todo")
    public Todo insertTodo(Todo todo){
        Todo result = todoService.save(todo);
        return result;
    }

    @GetMapping("/testinsert")
    public Todo testTodo(String name){
        Todo test = new Todo();

        test.setName(name);
        test.setTitle(Title.CODING);
        test.setType(Type.DAILY);
        test.setStatus(Status.TODO);
        test.setFinishdt(LocalDateTime.of(2021, 5, 20,22,10,00));
        
        Todo result = todoService.save(test);

        return result;
    }

    @GetMapping("/testupdate")
    public Todo testUpdate(Long id, Status status){
        Todo result = todoService.updateStatus(id, status);

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
    
    
    CheckService titleCheck;

    public void getDailyCheck(){
        

        List<Todo> todoList = todoService.findByType(Type.DAILY);

        for(Todo todo : todoList){
            if(todo.getTitle() == Title.CODING) titleCheck = new CodingCheck();
            if(todo.getTitle() == Title.READING) titleCheck = new ReadingCheck();

            titleCheck.actionCheck();
            titleCheck.changeStatus();
        }
        
    }
}

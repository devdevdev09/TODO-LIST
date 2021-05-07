package com.heo.todo.controller;

import java.util.List;

import com.heo.todo.entity.Todo;
import com.heo.todo.enums.Title;
import com.heo.todo.enums.Type;
import com.heo.todo.service.ActionSerivce;
import com.heo.todo.service.CheckService;
import com.heo.todo.service.TodoService;
import com.heo.todo.serviceimpl.action.CodingAction;
import com.heo.todo.serviceimpl.action.ReadingAction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CheckController {
    private final TodoService todoService;
    private final CheckService checkService;
    
    @GetMapping("/check/{type}")
    public void getTodoByType(Type type){
        List<Todo> todoList = todoService.findByType(type);

        for(Todo todo : todoList){
            ActionSerivce actionSerivce = getActionSerive(todo);
            

            checkService.actionCheck(actionSerivce);
        }
    }

    public ActionSerivce getActionSerive(Todo todo){
        ActionSerivce actionSerivce = null;
        Title title = todo.getTitle();

        if(title == Title.CODING) {
            actionSerivce = new CodingAction(todo);
        }else if(title == Title.READING) {
            actionSerivce = new ReadingAction(todo);
        }

        return actionSerivce;
    }
}

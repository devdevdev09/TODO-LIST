package com.heo.todo.controller;

import java.util.Optional;

import com.heo.todo.entity.MainEntity;
import com.heo.todo.service.MainService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    MainService mainService;

    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public MainEntity getMain(Long id){
        Optional<MainEntity> result = mainService.findById(id);
        
        return result.get();
    }

    @PostMapping("/main")
    public Long save(){
        MainEntity main = new MainEntity();

        MainEntity result = mainService.save(main);
        
        return result.getId();
    }
    
}

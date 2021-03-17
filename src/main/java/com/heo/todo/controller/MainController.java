package com.heo.todo.controller;

import java.util.Optional;

import com.heo.todo.entity.MainEntity;
import com.heo.todo.service.MainService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    MainService mainService;

    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public MainEntity getMain(Long id){
        Optional<MainEntity> result = mainService.findById(id);

        MainEntity main = new MainEntity();
        // main.setId(0L);
        
        return result.orElse(main);
    }

    @PostMapping("/main")
    public Long save(@RequestBody MainEntity entity){
        MainEntity result = mainService.save(entity);
        
        // return result.getId();
        return 0L;
    }
    
}

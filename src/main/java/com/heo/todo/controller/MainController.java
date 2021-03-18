package com.heo.todo.controller;

import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Optional;

import com.heo.todo.entity.MainEntity;
import com.heo.todo.service.MainService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class MainController {

    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public MainEntity getMain(Long id) {
        Optional<MainEntity> result = mainService.findById(id);

        MainEntity main = new MainEntity();
        main.setId(0L);

        return result.orElse(main);
    }

    @PostMapping("/main")
    public ResponseEntity<MainEntity> save(@RequestBody MainEntity entity) {
        MainEntity result = mainService.save(entity);

        URI location = UriComponentsBuilder.fromPath("/main/{id}").buildAndExpand(result.getId()).toUri();

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(location);
        responseHeaders.set("headerName", "headerValue");

        return new ResponseEntity<MainEntity>(result, responseHeaders, HttpStatus.OK);
    }

    @PutMapping("/main")
    public Long put(@RequestBody MainEntity entity) {
        MainEntity result = mainService.replace(entity);

        return result.getId();
    }

    @PatchMapping("/main")
    public Long patch(@RequestBody MainEntity entity) {
        MainEntity result = mainService.replace(entity);

        return result.getId();
    }

}

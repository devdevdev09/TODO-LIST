package com.heo.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageServiceImpl implements MessageService{

    // @Autowired
    // private RestTemplate restTemplate;

    // public MessageServiceImpl(RestTemplate restTemplate){
    //     this.restTemplate = restTemplate;
    // }

    @Override
    public boolean send(String msg) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity("http://localhost:20010/send?msg="+msg, boolean.class);
        
        return responseEntity.getBody();
    }
    
}

package com.heo.todo.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.heo.todo.entity.MainEntity;

import org.springframework.stereotype.Repository;

@Repository
public class DbMainRepository implements MainRepository{
    private static Map<Long, MainEntity> list = new HashMap<>();
    
    @Override
    public MainEntity save(MainEntity main) {
        
        return null;
    }    

    @Override
    public MainEntity replace(MainEntity main) {

        return null;
    }    

    @Override
    public MainEntity update(MainEntity main) {
        
        return null;
    }    

    @Override
    public Optional<MainEntity> findById(Long id) {
        return Optional.ofNullable(list.get(id));
    }
    
}

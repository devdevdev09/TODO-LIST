package com.heo.todo.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.heo.todo.entity.MainEntity;

import org.springframework.stereotype.Repository;

@Repository
public class MemoryMainRepository implements MainRepository{
    private static Map<Long, MainEntity> list = new HashMap<>();
    private static long sequence = 0L;
    
    @Override
    public MainEntity save(MainEntity main) {
        main.setId(++sequence);
        list.put(main.getId(), main);
        return main;
    }    

    @Override
    public Optional<MainEntity> findById(Long id) {
        return Optional.ofNullable(list.get(id));
    }
    
}

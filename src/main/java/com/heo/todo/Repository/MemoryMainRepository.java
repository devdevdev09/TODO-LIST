package com.heo.todo.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.heo.todo.entity.MainEntity;

import org.springframework.stereotype.Repository;

@Repository
public class MemoryMainRepository implements MainRepository{
    private static Map<Long, MainEntity> list = new HashMap<>();
    private static Long sequence = 0L;
    
    @Override
    public MainEntity save(MainEntity main) {
        main.setId(++sequence);
        list.put(main.getId(), main);
        
        return main;
    }    

    @Override
    public MainEntity replace(MainEntity main) {
        Long seq = main.getId();
        list.replace(seq, main);

        return main;
    }    

    // @todo...
    // update 처리
    @Override
    public MainEntity update(MainEntity main) {
        main.setId(++sequence);
        list.put(main.getId(), main);
        
        return main;
    }    

    @Override
    public Optional<MainEntity> findById(Long id) {
        return Optional.ofNullable(list.get(id));
    }
    
}

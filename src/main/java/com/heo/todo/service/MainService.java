package com.heo.todo.service;

import java.util.Optional;

import com.heo.todo.entity.MainEntity;
import com.heo.todo.repository.MainRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    private MainRepository mainRepository;

    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public Optional<MainEntity> findById(Long id) {
        return mainRepository.findById(id);
    }

    public MainEntity save(MainEntity main) {
        return mainRepository.save(main);
    }

    public MainEntity replace(MainEntity main) {
        return mainRepository.replace(main);
    }

    public MainEntity update(MainEntity main) {
        return mainRepository.update(main);
    }

}

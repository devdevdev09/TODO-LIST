package com.heo.todo.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.heo.todo.entity.Todo;

public class JpaTodoRepository implements TodoRepository {

    // private final EntityManager em;

    // public JpaTodoRepository(EntityManager em) { this.em = em;}

    // @Override
    // public Todo save(Todo todo) {
    //     em.persist(todo);
    //     return todo;
    // }

    // @Override
    // public Optional<Todo> findById(Long id) {
    //     Todo todo = em.find(Todo.class, id);
    //     return Optional.ofNullable(todo);
    // }

    // @Override
    // public Optional<Todo> findByName(String name) {
    //     List<Todo> result = em.createQuery("select t from Todo t where t.name = :name" ,Todo.class)
    //                         .setParameter("name", name)
    //                         .getResultList();

    //     return result.stream().findAny();
    // }

    // @Override
    // public List<Todo> findAll() {
    //     return em.createQuery("select t from Todo t", Todo.class).getResultList();
    // }
}

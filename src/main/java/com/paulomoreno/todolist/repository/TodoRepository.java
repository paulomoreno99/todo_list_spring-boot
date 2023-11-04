package com.paulomoreno.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomoreno.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}

package com.paulomoreno.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulomoreno.todolist.entity.Todo;
import com.paulomoreno.todolist.service.TodoService;

import jakarta.persistence.PostUpdate;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoservice;

    public TodoController(TodoService todoservice) {
        this.todoservice = todoservice;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoservice.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return list();
    }

    @PutMapping
    List<Todo> update(Todo todo) {
        return todoservice.create(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoservice.delete(id);
    }
    
}

    
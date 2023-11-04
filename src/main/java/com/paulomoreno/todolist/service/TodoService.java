package com.paulomoreno.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.paulomoreno.todolist.entity.Todo;
import com.paulomoreno.todolist.repository.TodoRepository;

public class TodoService {
    private TodoRepository todorepository;

    //Esta sendo usado o construtor abaixo como injeção de dependencia
    // mas também poderia ser usado a anotação @Autowired.] ou um metodo.
    public TodoService(TodoRepository todorepository) {
        this.todorepository = todorepository;
    }
    public List<Todo> create(Todo todo) {
        todorepository.save(todo);
        return list();
        
    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
        return todorepository.findAll(sort);
        
    }
    public List<Todo> update(Todo todo) {
        todorepository.save(todo);
        return list();
        
    }
    public List<Todo> delete(Long id) {
        todorepository.deleteById(id);
        return list();
        
    }
    
}

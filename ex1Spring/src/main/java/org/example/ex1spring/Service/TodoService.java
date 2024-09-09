package org.example.ex1spring.Service;

import org.example.ex1spring.Entity.Todo;

import java.util.List;

public interface TodoService {
    Todo getOneTodo();
    List<Todo> getAllTodos();
}


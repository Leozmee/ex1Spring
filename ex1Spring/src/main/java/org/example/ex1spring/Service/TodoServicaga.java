package org.example.ex1spring.Service;

import org.example.ex1spring.Entity.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("Todos")
public class TodoServicaga implements TodoService{
    private List<Todo> todos;

    public TodoServicaga() {
        todos = new ArrayList<>();
        todos.add(new Todo("faire cake", "recette", false));
        todos.add(new Todo("Faire sport", "basic", false));
        todos.add(new Todo("faire course", "go monop", true));
    }

    @Override
    public Todo getOneTodo() {
        if (!todos.isEmpty()) {
            return todos.get(0);
        }
        return null;
    }

    @Override
    public List<Todo> getAllTodos() {
        return todos;
    }
}

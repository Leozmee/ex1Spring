package org.example.ex1spring.Controller;

import org.example.ex1spring.Entity.Todo;
import org.example.ex1spring.Service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/one")
    public String getOneTodo(Model model) {
        Todo todo = todoService.getOneTodo();
        model.addAttribute("todo", todo);
        return "todo-details";
    }

    @GetMapping("/all")
    public String getAllTodos(Model model) {
        List<Todo> todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);
        return "todo-all";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
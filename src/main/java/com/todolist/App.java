package com.todolist;

import com.todolist.service.TaskService;
import com.todolist.entity.User;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to ToDoList!");
        
        User user = new User(1L, "john_doe", "password123");
        TaskService taskService = new TaskService();

        taskService.createTask("Buy groceries", com.todolist.entity.Status.PENDING, com.todolist.entity.Priority.MEDIUM, com.todolist.entity.Category.PERSONAL, user);
        taskService.getTasksByUser(user).forEach(task -> {
            System.out.println(task);
        });
        taskService.updateTaskStatus(user, 1L, com.todolist.entity.Status.COMPLETED);
        taskService.getTasksByUser(user).forEach(task -> {
            System.out.println(task);
        });
        taskService.updateTaskPriority(user, 1L, com.todolist.entity.Priority.HIGH);
        taskService.getTasksByUser(user).forEach(task -> {
            System.out.println(task);
        });
        taskService.deleteTask(user, 1L);
        taskService.getTasksByUser(user).forEach(task -> {
            System.out.println(task);
        });
    }
}

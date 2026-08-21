package com.todolist.service;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import com.todolist.entity.Status;
import com.todolist.entity.Category;
import com.todolist.entity.Priority;
import com.todolist.entity.User;
import com.todolist.entity.Task;

public class TaskService {
    private final Map<Long, List<Task>> taskMap = new HashMap<>();
    private Long taskIdCounter = 1L;

    public void createTask(String title, Status status, Priority priority, Category category, User user) {
        if (!taskMap.containsKey(user.getId())) {
            taskMap.put(user.getId(), new ArrayList<>());
        }
        taskMap.get(user.getId()).add(new Task(taskIdCounter++, title, status, priority, category, LocalDateTime.now(), user));
    }

    public List<Task> getTasksByUser(User user) {
        return taskMap.getOrDefault(user.getId(), new ArrayList<>());
    }

    public Task getTaskById(User user, Long taskId) {
        return findTaskById(user, taskId);
    }

    private Task findTaskById(User user, Long taskId) {
        List<Task> tasks = taskMap.get(user.getId());
        if (tasks != null) {
            for (Task task : tasks) {
                if (task.getId().equals(taskId)) {
                    return task;
                }
            }
        }
        return null;
    }

    public void updateTaskStatus(User user, Long taskId, Status newStatus) {
        Task task = findTaskById(user, taskId);
        if (task != null) {
            task.setStatus(newStatus);
        }
    }

    public void updateTaskPriority(User user, Long taskId, Priority newPriority) {
        Task task = findTaskById(user, taskId);
        if (task != null) {
            task.setPriority(newPriority);
        }
    }

    public void updateTaskCategory(User user, Long taskId, Category newCategory) {
        Task task = findTaskById(user, taskId);
        if (task != null) {
            task.setCategory(newCategory);
        }
    }

    public void updateTaskTitle(User user, Long taskId, String newTitle) {
        Task task = findTaskById(user, taskId);
        if (task != null) {
            task.setTitle(newTitle);
        }
    }

    public void deleteTask(User user, Long taskId) {
        List<Task> tasks = taskMap.get(user.getId());
        if (tasks != null) {
            tasks.removeIf(task -> task.getId().equals(taskId));
        }
    }
}

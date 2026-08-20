package com.todolist.entity;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private Status status;
    private Priority priority;
    private Category category;
    private User user;
    private LocalDateTime createdAt;

    public Task() {
    }

    public Task(Long id, String title, Status status, Priority priority, Category category, LocalDateTime createdAt, User user) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.createdAt = createdAt;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        if (priority == null) {
            throw new IllegalArgumentException("Priority cannot be null");
        }
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}

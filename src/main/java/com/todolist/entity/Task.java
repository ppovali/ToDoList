package com.todolist.entity;

public class Task {
    private Long id;
    private String title;
    private Status status;
    private Priority priority;
    private Category category;
    private User user;

    public Task() {
    }

    public Task(Long id, String title, Status status, Priority priority, Category category, User user) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }
}

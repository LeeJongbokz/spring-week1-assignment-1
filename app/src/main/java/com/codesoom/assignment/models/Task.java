package com.codesoom.assignment.models;

public class Task {

    private static Long count = 0L;
    private Long id;
    private String title;

    public Task(){
        this.id = ++count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "Task - title: " + title;
    }

}

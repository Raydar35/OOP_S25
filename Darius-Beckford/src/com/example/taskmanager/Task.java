package com.example.taskmanager;

public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public void toggleStatus() {
        isComplete = !isComplete;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return (isComplete ? "[X] " : "[ ] ") + description;
    }
}

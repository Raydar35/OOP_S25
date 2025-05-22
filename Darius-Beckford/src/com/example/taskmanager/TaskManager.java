package com.example.taskmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager implements Storable {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).toggleStatus();
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    @Override
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Task task : tasks) {
                writer.println(task.isComplete() + ";" + task.getDescription());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadFromFile(String filename) {
        tasks.clear();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(";");
                Task task = new Task(parts[1]);
                if (Boolean.parseBoolean(parts[0])) {
                    task.toggleStatus();
                }
                tasks.add(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

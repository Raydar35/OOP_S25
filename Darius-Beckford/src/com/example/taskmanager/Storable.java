package com.example.taskmanager;

public interface Storable {
    void saveToFile(String filename);
    void loadFromFile(String filename);
}

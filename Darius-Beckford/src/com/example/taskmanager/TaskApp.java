package com.example.taskmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TaskApp extends Application {
    private TaskManager taskManager = new TaskManager();
    private ListView<String> listView = new ListView<>();
    private TextField inputField = new TextField();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("com.example.taskmanager.Task Manager");

        Button addButton = new Button("Add");
        Button completeButton = new Button("Complete");
        Button removeButton = new Button("Remove");

        addButton.setOnAction(e -> {
            String text = inputField.getText();
            if (!text.isEmpty()) {
                taskManager.addTask(text);
                updateListView();
                inputField.clear();
            }
        });

        completeButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            taskManager.completeTask(selectedIndex);
            updateListView();
        });

        removeButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            taskManager.removeTask(selectedIndex);
            updateListView();
        });

        HBox controls = new HBox(10, inputField, addButton, completeButton, removeButton);
        VBox layout = new VBox(10, controls, listView);
        layout.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(layout, 500, 400));
        primaryStage.show();
    }

    private void updateListView() {
        listView.getItems().clear();
        for (Task task : taskManager.getTasks()) {
            listView.getItems().add(task.toString());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

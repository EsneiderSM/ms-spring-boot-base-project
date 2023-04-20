package com.redduck.msuser.controller;

import com.redduck.msuser.entity.Task;
import com.redduck.msuser.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/tasks")
public class TaskController {

    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task savedTask = taskService.createTask(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") Long taskId){
        Task task = taskService.getTaskById(taskId);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") Long taskId,
                                           @RequestBody Task task){
        task.setId(taskId);
        Task updatedTask = taskService.updateTask(task);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long taskId){
        taskService.deleteTask(taskId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}

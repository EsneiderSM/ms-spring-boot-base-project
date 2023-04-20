package com.redduck.msuser.service;

import com.redduck.msuser.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    Task getTaskById(Long taskId);
    List<Task> getAllTasks();
    Task updateTask(Task task);
    void deleteTask(Long taskId);
}

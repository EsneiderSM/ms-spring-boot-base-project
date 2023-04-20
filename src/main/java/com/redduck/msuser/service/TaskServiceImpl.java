package com.redduck.msuser.service;

import com.redduck.msuser.entity.Task;
import com.redduck.msuser.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long taskId) {
        Optional<Task> optionalUser = taskRepository.findById(taskId);
        return optionalUser.get();
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task) {
        Task existingTask = taskRepository.findById(task.getId()).get();
        existingTask.setName(task.getName());
        Task updatedTask = taskRepository.save(existingTask);
        return updatedTask;
    }

    @Override
    public void deleteTask(Long userId) {
        taskRepository.deleteById(userId);
    }
}

package com.redduck.msuser.service;

import com.redduck.msuser.entity.Task;
import com.redduck.msuser.entity.TasksXUser;
import com.redduck.msuser.entity.User;
import com.redduck.msuser.model.TaskXUserModel;
import com.redduck.msuser.repository.TaskRepository;
import com.redduck.msuser.repository.TaskXUserRepository;
import com.redduck.msuser.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskXUserServiceImpl implements TaskXUserService{

    private TaskXUserRepository taskXUserRepository;
    private TaskService taskService;
    private UserService userService;

    @Override
    public TasksXUser createTask(TaskXUserModel tasksXUserModel) {
        Task task = taskService.getTaskById(tasksXUserModel.getTaskId());
        User user = userService.getUserById(tasksXUserModel.getUserId());
        TasksXUser entity = new TasksXUser();
        entity.setTask(task);
        entity.setUser(user);
        entity.setTime(tasksXUserModel.getTime());
        return taskXUserRepository.save(entity);
    }
}

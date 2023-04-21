package com.redduck.msuser.controller;

import com.redduck.msuser.entity.Task;
import com.redduck.msuser.entity.TasksXUser;
import com.redduck.msuser.model.TaskXUserModel;
import com.redduck.msuser.service.TaskXUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/tasksxuser")
public class TaskXUserController {

    private TaskXUserService taskXUserService;
    @PostMapping
    public ResponseEntity<TasksXUser> createTask(@RequestBody TaskXUserModel tasksXUser){
        TasksXUser savedTask = taskXUserService.createTask(tasksXUser);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

}

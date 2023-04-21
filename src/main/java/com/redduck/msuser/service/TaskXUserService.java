package com.redduck.msuser.service;

import com.redduck.msuser.entity.TasksXUser;
import com.redduck.msuser.model.TaskXUserModel;

public interface TaskXUserService {
    TasksXUser createTask(TaskXUserModel tasksXUserModel);
}

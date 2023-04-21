package com.redduck.msuser.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskXUserModel {
    long id;
    long userId;
    long taskId;
    int time;
}

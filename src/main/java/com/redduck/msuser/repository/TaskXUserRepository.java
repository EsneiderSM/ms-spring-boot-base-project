package com.redduck.msuser.repository;

import com.redduck.msuser.entity.TasksXUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskXUserRepository extends JpaRepository<TasksXUser, Long> {
}

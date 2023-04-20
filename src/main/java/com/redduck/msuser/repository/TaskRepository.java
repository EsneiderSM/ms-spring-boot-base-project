package com.redduck.msuser.repository;

import com.redduck.msuser.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

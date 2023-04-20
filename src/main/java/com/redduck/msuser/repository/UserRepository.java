package com.redduck.msuser.repository;

import com.redduck.msuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

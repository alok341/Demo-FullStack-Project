package com.alok.Demo_Project.repository;

import com.alok.Demo_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.changhr.datasync.repository;

import com.changhr.datasync.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
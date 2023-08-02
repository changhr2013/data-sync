package com.changhr.datasync.service.to.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.changhr.datasync.entity.User;
import com.changhr.datasync.repository.UserRepo;
import com.changhr.datasync.service.impl.BaseServiceImpl;
import com.changhr.datasync.service.to.ToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@DS("ds1")
public class ToUserServiceImpl extends BaseServiceImpl<User, Integer> implements ToUserService {
    ToUserServiceImpl(@Autowired UserRepo userRepo) {
        super(userRepo);
    }
}
package com.changhr.datasync.service.from.impl;

import com.baomidou.dynamic.datasource.annotation.DS;

import com.changhr.datasync.entity.User;
import com.changhr.datasync.repository.UserRepo;
import com.changhr.datasync.service.from.FromUserService;
import com.changhr.datasync.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@DS("ds0") // 此类的操作使用ds0数据源
public class FromUserServiceImpl extends BaseServiceImpl<User, Integer> implements FromUserService {
    FromUserServiceImpl(@Autowired UserRepo userRepo) {
        super(userRepo);
    }
}
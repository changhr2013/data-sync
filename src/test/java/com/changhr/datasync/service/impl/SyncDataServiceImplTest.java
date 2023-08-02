package com.changhr.datasync.service.impl;

import com.changhr.datasync.entity.User;
import com.changhr.datasync.service.SyncDataService;
import com.changhr.datasync.service.from.FromUserService;
import com.changhr.datasync.service.to.ToUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SyncDataServiceImplTest {

    @Autowired
    private SyncDataService syncDataService;

    @Autowired
    private FromUserService fromUserService;

    @Autowired
    private ToUserService toUserService;

    @Test
    void syncUserTableData() throws Exception{
//        List<User> all = fromUserService.findAll();
//        toUserService.saveAll(all);

        syncDataService.syncUserTableData();
    }

    @Test
    void insertData() {

        User user = new User(10, "wangwu", "123456");

        fromUserService.save(user);

        toUserService.save(user);
    }
}
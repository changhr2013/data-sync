package com.changhr.datasync.service.impl;

import com.changhr.datasync.entity.User;
import com.changhr.datasync.service.SyncDataService;
import com.changhr.datasync.service.from.FromUserService;
import com.changhr.datasync.service.to.ToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SyncDataServiceImpl implements SyncDataService {

    @Autowired
    private FromUserService fromUserService;

    @Autowired
    private ToUserService toUserService;

    public void syncUserTableData() {
        List<User> allUserList = fromUserService.findAll();
        toUserService.saveAll(allUserList);
    }

}

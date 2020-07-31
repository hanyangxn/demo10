package com.xn.service.impl;

import com.xn.dao.UserDao;
import com.xn.pojo.User;
import com.xn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2018/1/2.
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao dao;

    @Override
    public List<User> getList() {
        return dao.findAll();
    }

}

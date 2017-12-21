package com.zmh.ppp.service.impl;

import com.zmh.ppp.domain.AppUser;
import com.zmh.ppp.mapper.UserMapper;
import com.zmh.ppp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public List<AppUser> queryAll() {
        return userMapper.selectAll();
    }

    public void save(AppUser user) {
        userMapper.insert(user);
    }
}

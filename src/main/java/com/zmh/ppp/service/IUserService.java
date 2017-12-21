package com.zmh.ppp.service;

import com.zmh.ppp.domain.AppUser;

import java.util.List;

public interface IUserService {
    List<AppUser> queryAll();

    void save(AppUser user);
}

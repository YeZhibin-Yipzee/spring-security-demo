package com.zmh.ppp.mapper;

import com.zmh.ppp.domain.AppUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<AppUser> selectAll();

    AppUser getUserByName(String username);

    void insert(AppUser user);
}

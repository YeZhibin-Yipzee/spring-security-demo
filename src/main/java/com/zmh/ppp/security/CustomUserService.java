package com.zmh.ppp.security;

import com.zmh.ppp.domain.AppUser;
import com.zmh.ppp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userMapper.getUserByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}

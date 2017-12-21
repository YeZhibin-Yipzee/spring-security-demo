package com.zmh.ppp;

import com.zmh.ppp.domain.AppUser;
import com.zmh.ppp.mapper.UserMapper;
import com.zmh.ppp.security.CustomUserService;
import com.zmh.ppp.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PppApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService userService;
    @Autowired
    private CustomUserService customUserService;

    @Test
    public void test1() throws Exception {
        System.out.println(customUserService.loadUserByUsername("zzzz"));
    }

    @Test
	public void contextLoads() {
        AppUser appUser = new AppUser();
        appUser.setUsername("zzzz");
        appUser.setPassword("1");
        userService.save(appUser);
    }

}

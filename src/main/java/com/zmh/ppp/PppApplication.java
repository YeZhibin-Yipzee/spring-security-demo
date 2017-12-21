package com.zmh.ppp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zmh.ppp.mapper")
public class PppApplication {

    public static void main(String[] args) {
		SpringApplication.run(PppApplication.class, args);
	}
}

package com.zhuzimo.myownapi;

import com.zhuzimo.myownapi.entity.UserEntity;
import com.zhuzimo.myownapi.mapper.UserEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
@Slf4j
public class MyOwnApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyOwnApiApplication.class, args);
    }

    @Resource
    private UserEntityMapper userEntityMapper;

    @Override
    public void run(String... args) throws Exception {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(1l);
        log.info(userEntity.toString());

        UserEntity userEntity1 = new UserEntity();
        userEntity1.setEmail("2");
        userEntityMapper.insertSelective(userEntity1);
    }
}

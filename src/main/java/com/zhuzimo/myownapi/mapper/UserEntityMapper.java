package com.zhuzimo.myownapi.mapper;

import com.zhuzimo.myownapi.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
* @author zhuzhibin
* @description 针对表【t_user(用户表)】的数据库操作Mapper
* @createDate 2023-07-25 22:15:43
* @Entity com.zhuzimo.myownapi.entity.UserEntity
*/
public interface UserEntityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    void addAmount(@Param("id") Long id, @Param("amount") int i);
}

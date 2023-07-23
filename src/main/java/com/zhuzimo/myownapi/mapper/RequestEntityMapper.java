package com.zhuzimo.myownapi.mapper;

import com.zhuzimo.myownapi.entity.RequestEntity;

/**
* @author zhuzhibin
* @description 针对表【t_request(API请求表)】的数据库操作Mapper
* @createDate 2023-07-23 23:17:59
* @Entity com.zhuzimo.myownapi.entity.RequestEntity
*/
public interface RequestEntityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RequestEntity record);

    int insertSelective(RequestEntity record);

    RequestEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RequestEntity record);

    int updateByPrimaryKey(RequestEntity record);

}

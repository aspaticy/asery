package com.example.user.dao;

import com.example.user.entity.UserInfo;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 蒋声强
 * @since 2019-12-20
 */
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {

}

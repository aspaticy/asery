package com.example.user.service;

import com.example.user.entity.UserInfo;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 蒋声强
 * @since 2019-12-20
 */
public interface UserInfoService extends IService<UserInfo> {

	List<UserInfo> selectUserInfoList();

}

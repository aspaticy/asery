package com.example.user.service.impl;

import com.example.user.entity.UserInfo;
import com.example.user.dao.UserInfoDao;
import com.example.user.service.UserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 蒋声强
 * @since 2019-12-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public List<UserInfo> selectUserInfoList() {
		Map<String, Object> columnMap = new HashMap<String, Object>();
		return userInfoDao.selectByMap(columnMap);
	}

}

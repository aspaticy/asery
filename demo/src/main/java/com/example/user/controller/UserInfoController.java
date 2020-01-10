package com.example.user.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.UserInfo;
import com.example.user.service.UserInfoService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 蒋声强
 * @since 2019-12-20
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/selectList")
	public List<UserInfo> selectUserInfoList() {
		return userInfoService.selectUserInfoList();
	}
}

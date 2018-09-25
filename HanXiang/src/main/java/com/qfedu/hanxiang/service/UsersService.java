package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.JS;

public interface UsersService {
	/**
	 * 根据用户用户名 或者 用户id
	 * 查询username 的全部属性
	 */
	Users selectUsername(Users user);
	
	
	/**
	 * 创建一个用户
	 */
	JS<Users> save(Users user);
	
	/**
	 * 修改资料
	 */
	String update(Users user);
	
	/**
	 * 修改token时间戳
	 */
	int updateToken(Users user);
	
	/**
	 * 用户登录接口
	 */
	Users login(Users user);
	
}

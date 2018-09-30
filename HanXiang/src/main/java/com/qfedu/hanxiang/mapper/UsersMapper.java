package com.qfedu.hanxiang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.qfedu.hanxiang.pojo.Users;
@Repository
public interface UsersMapper {
	
	/**
	 * 储存token 到数据库  /--等redis
	 */
	@Update("update users set token = #{token} ,tokentime = unix_timestamp(now()) where uuid = #{uuid} ")
	int writerToken(Users user);
	
	
	/**
	 * 跟新token时间戳/--等redis
	 */
	@Update("update users set tokentime = unix_timestamp(now()) where uuid = #{uuid} ")
	int updateToken(Users user);
	
	/**
	 * 查询token是否存在./--等redis
	 */
	@Select("select * from users where uuid=#{uuid} and token=#{token}")
	Users selectUserByToken(Users user);
	/**
	 * 根据用户账号密码登录
	 * 
	 * @param us
	 * @return
	 */
	@Select("select * from users where username = #{username} and password = #{password}")
	Users selectUser(Users us);


	/**
	 * 根据用户名/uuid 判断用户是否存在.
	 */
	Users selectUsername(Users us);

	/**
	 * 修改资料
	 */
	int updateByUser(Users user);
	/**
	 * 储存用户到数据库
	 */
	@Insert("")
	int insert(Users users);
	

}

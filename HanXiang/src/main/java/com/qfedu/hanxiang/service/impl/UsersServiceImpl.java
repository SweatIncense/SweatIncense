package com.qfedu.hanxiang.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.qfedu.hanxiang.mapper.UsersMapper;
import com.qfedu.hanxiang.pojo.JS;
import com.qfedu.hanxiang.pojo.Users;
import com.qfedu.hanxiang.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;

	@Override
	public Users selectUsername(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String register(Users users) {
        Users u = usersMapper.selectUsername(users);
        if (null != u) {
            return JSON.toJSONString(new JS<>(100));
        } else {
            // XXX 生成uuid,token,储存到数据库,抹去密码,返回到前端
            String str = UUID.randomUUID().toString();// 生成UUID,并转换为字符串
            str = str.replaceAll("-", "");// 将转换成的字符串中的"-"去除.
            users.setUuid(str);
            List<Users> data = new ArrayList<>();
            data.add(u);
            // 这里添加生成token,将用户id token 储存到redis
            usersMapper.insert(users);
            users.setPassword(null);
            return JSON.toJSONString(new JS<>(101, data));
        }
    }
	@Override
	public String update(Users user) {
		return JSON.toJSONString(new JS<>(100 + usersMapper.updateByUser(user)));
	}

	@Override
	public int updateToken(Users user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String login(Users user) {
		Users u = usersMapper.selectUsername(user);
		JS<Users> js = new JS<>();
		List<Users> data = new ArrayList<>();
		int code = 100;
		if (null != u && user.getPassword().equals(u.getPassword())) {
			u.setPassword(null);
			data.add(u);
			code = 101;

		}
		js.setCode(code);
		js.setData(data);
		return JSON.toJSONString(js);
	}

}

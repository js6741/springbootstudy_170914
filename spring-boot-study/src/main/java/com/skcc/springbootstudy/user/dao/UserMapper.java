package com.skcc.springbootstudy.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.skcc.springbootstudy.user.User;

public interface UserMapper {
	@Select("select * from users")
	List<User> selectAll();
	
	@Select("select * from user where id = #{id}")
	User selectById(int id);
	
	@Insert("insert int users(id, name, age) values #{id}, #{name}, #{age})")
	int insert(User user);
	
	@Update("update users set name = #{name}, age=#{age} where id = #{id}")
	int update(User user);
	
	@Delete("delete from users where id = #{id}")
	int delete(int id);
}

package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUserMapper {
  @Test
  public void testGetUserList() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    List<User> list = userMapper.getUserList();

    System.out.println(list);

    sqlSession.close();
  }
}

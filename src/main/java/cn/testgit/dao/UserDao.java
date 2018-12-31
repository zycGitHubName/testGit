package cn.testgit.dao;

import cn.testgit.pojo.User;

public interface UserDao {

    public User findUserByName(String name);
}

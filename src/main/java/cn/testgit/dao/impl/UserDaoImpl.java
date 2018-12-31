package cn.testgit.dao.impl;

import cn.testgit.dao.UserDao;
import cn.testgit.pojo.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByName(String name) {
        return new User("admin","admin");
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除用户");
    }
}

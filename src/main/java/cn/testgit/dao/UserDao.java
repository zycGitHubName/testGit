package cn.testgit.dao;

import cn.testgit.pojo.User;

import java.util.List;

public interface UserDao {

    public User findUserByName(String name);

    public List<User> findAll();

    public void deleteUser(Integer id);
}

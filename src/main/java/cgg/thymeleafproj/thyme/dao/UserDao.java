package cgg.thymeleafproj.thyme.dao;

import cgg.thymeleafproj.thyme.entities.User;

public interface UserDao {

    public int createTable();

    public int createUser(User user);

    // public int deleteUser();

    // public int updateUser();

    // public int getUser();

}

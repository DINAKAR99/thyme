package cgg.thymeleafproj.thyme.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cgg.thymeleafproj.thyme.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbc;

    @Override
    public int createTable() {

        int update = jdbc.update(
                "create table if not exists user_1(user_id int primary key,user_name varchar(100),user_age int,user_city varchar(100)) ");

        return update;
    }

    @Override
    public int createUser(User user) {

        String query = "insert into user_1 values(?,?,?,?)";

        int update = jdbc.update(query,
                new Object[] { user.getUserid(), user.getUserName(), user.getAge(), user.getCity() });

        return update;
    }

}

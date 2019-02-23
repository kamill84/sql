package main;

import config.Database;
import dao.UserDao;
import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main {


    public static void main(String[] args) throws SQLException {

        Database db = new Database();
        UserDao userDao = new UserDao(db);

       User user = new User ("Tomek", "Kowalski","Tomek@email.com");

       userDao.save(user);


    }

}
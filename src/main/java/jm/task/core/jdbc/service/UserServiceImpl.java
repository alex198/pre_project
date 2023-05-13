package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() throws SQLException {
        //add
        new UserDaoJDBCImpl().createUsersTable();
    }

    public void dropUsersTable() {
        //add
        new UserDaoJDBCImpl().dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        //add
        new UserDaoJDBCImpl().saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        //add
        new UserDaoJDBCImpl().removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        //add
        return new UserDaoJDBCImpl().getAllUsers();
    }

    public void cleanUsersTable() {
        new UserDaoJDBCImpl().cleanUsersTable();
    }
}

package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() throws SQLException {
        //add
        new UserDaoHibernateImpl().createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        //add
        new UserDaoHibernateImpl().dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        //add
        new UserDaoHibernateImpl().saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        //add
        new UserDaoHibernateImpl().removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        //add
        return new UserDaoHibernateImpl().getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        new UserDaoHibernateImpl().cleanUsersTable();
    }
}

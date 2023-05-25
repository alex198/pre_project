package hibernate_221.dao;

import hibernate_221.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}

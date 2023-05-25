package hibernate_221.service;

import hibernate_221.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}

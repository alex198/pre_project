package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        User user1 = new User("Иван", "Иванов", (byte) 15);
        User user2 = new User("Борис", "Борисов", (byte) 20);
        User user3 = new User("Федор", "Федоров", (byte) 25);
        User user4 = new User("Чак", "Норис", (byte) 30);
        UserServiceImpl userService = new UserServiceImpl();

        //создание таблицы
        userService.createUsersTable();

        //добавление в бд и вывод в консоль User'ов
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем – '" + user1.getName() + "' добавлен в базу данных");
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем – '" + user2.getName() + "' добавлен в базу данных");
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем – '" + user3.getName() + "' добавлен в базу данных");
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем – '" + user4.getName() + "' добавлен в базу данных");

        //получение User'ов
        List<User> usersList = userService.getAllUsers();
        for (User user : usersList) {
            System.out.println(user);
        }

        //очистка таблицы
        userService.cleanUsersTable();

        //удаление таблицы
        userService.dropUsersTable();
    }
}

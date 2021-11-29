package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Дарья", "Смирнова", (byte) 23);
        userService.saveUser("Иван", "Смирнов", (byte) 27);
        userService.saveUser("Александр", "Смирнов", (byte) 29);
        userService.saveUser("Константин", "Смирнов", (byte) 31);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

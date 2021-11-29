package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import jm.task.core.jdbc.model.User;
import java.util.Properties;

public class Util {
    private static SessionFactory sessionFactory;

    public static SessionFactory getConnection() {
        String dbURL = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow&useSSL=false";
        String login = "root";
        String password = "q1w2E3r$t!!!!";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
        Properties prop = new Properties();
        prop.setProperty("hibernate.connection.url", dbURL);
        prop.setProperty("hibernate.connection.username", login);
        prop.setProperty("hibernate.connection.password", password);
        prop.setProperty("hibernate.connection.driver", driver);
        prop.setProperty("hibernate.hbm2ddl.auto", "create");
        sessionFactory = new Configuration().addProperties(prop)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        System.out.print("Всё хорошо и ");
        } catch (Exception e) {
            System.out.print("Не всё хорошо и ");
        }
        return sessionFactory;
    }
}
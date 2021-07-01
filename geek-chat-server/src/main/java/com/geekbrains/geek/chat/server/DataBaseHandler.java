package com.geekbrains.geek.chat.server;

import java.sql.*;

public class DataBaseHandler {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        setConnection();
        createDb();
        writeDB();
        readDB();
        closeDB();
    }

    public static void setConnection() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat","root", "root");
    }

    public static void createDb() throws SQLException {
        statement = connection.createStatement();
        statement.execute(
                "CREATE TABLE `chat`.`users` (\n" +
                        "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                        "  `login` VARCHAR(45) NOT NULL,\n" +
                        "  `password` VARCHAR(45) NOT NULL,\n" +
                        "  `nickname` VARCHAR(45) NOT NULL,\n" +
                        "  PRIMARY KEY (`id`));");
    }

    public static void writeDB() throws SQLException {
//        statement.execute("INSERT INTO `chat`.`users` (`name`, `phone`) VALUES ('Petya', '111111')");
//        statement.execute("INSERT INTO `chat`.`users` (`name`, `phone`) VALUES ('Vasya', '222222')");
//        statement.execute("INSERT INTO `chat`.`users` (`name`, `phone`) VALUES ('Ivan', '333333')");
    }

    public static void readDB() throws SQLException {
//        resultSet = statement.executeQuery("SELECT * FROM users");
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            int phone = resultSet.getInt("phone");
//            System.out.println(id + " " + name + " " + phone);
//        }
    }

    public static void closeDB() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }

}


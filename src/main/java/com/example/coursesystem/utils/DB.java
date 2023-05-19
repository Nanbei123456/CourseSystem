package com.example.coursesystem.utils;
import com.example.coursesystem.bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DB {
    public static List<User> queryUser(){
        String sql = "select id, pwd, role from user";
        ArrayList<User> list = null;
        try {
            // 1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 定义连接
            String url = "jdbc:mysql://localhost:3306/webwork";
            // 3. 获取数据库连接
            Connection connection = DriverManager.getConnection(
                    url,
                    "root",
                    "123456");
            // 4. 创建Statement
            Statement statement = connection.createStatement();
            // 5. 执行Statement
            ResultSet resultSet = statement.executeQuery(sql);
            // 6. 处理结果集
            list = new ArrayList<>();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String pwd = resultSet.getString("pwd");
                String role = resultSet.getString("role");
                //System.out.println(code + ":" + name + ":" + surface);
                User user = new User();
                user.setId(id);
                user.setPwd(pwd);
                user.setRole(role);
                list.add(user);
            }
            // 7. 释放资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

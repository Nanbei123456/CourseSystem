package com.example.coursesystem.servlet;

import com.example.coursesystem.bean.User;
import com.example.coursesystem.dao.UserDao;
import com.example.coursesystem.utils.DB;
import com.example.coursesystem.utils.MyDb;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置客户端的编码格式
        //request.setCharacterEncoding("UTF-8");
        //接受客户端传递的参数
        String uid = request.getParameter("uid");
        String upwd = request.getParameter("upwd");

        try(var session = MyDb.use().openSession()) {
            //方式一：getMapper
            UserDao mapper = session.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                //判断用户名密码是否正确
                if (uid.equals(user.getId()) && upwd.equals(user.getPwd())) {
                    if (user.getRole().equals("学生")) {
                        // 登录成功，将信息存到session中
                        request.getSession().setAttribute("uid", uid);
                        request.getSession().setAttribute("upwd", upwd);
                        // 登录成功，跳转到成功页面
                        request.getRequestDispatcher("success.jsp").forward(request, response);
                    }
                    if (user.getRole().equals("老师")) {
                        request.getSession().setAttribute("uid", uid);
                        request.getSession().setAttribute("upwd", upwd);
                        request.getRequestDispatcher("success02.jsp").forward(request, response);
                    }

                } else {
                    request.getRequestDispatcher("failure.jsp").forward(request, response);
                }
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

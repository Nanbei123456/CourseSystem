<%--
  Created by IntelliJ IDEA.
  User: xia
  Date: 2023/5/18
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .login-container {
            margin-top: 150px;
        }
        .login-form {
            border: 1px solid #ddd;
            padding: 20px;
            -webkit-box-shadow: 6px 6px 15px rgba(0,0,0,0.2);
            -moz-box-shadow: 6px 6px 15px rgba(0,0,0,0.2);
            box-shadow: 6px 6px 15px rgba(0,0,0,0.2);
        }
        .form-control {
            font-size: 16px;
            margin-bottom: 10px;
            height: 44px;
        }
        .btn-primary {
            background-color: #168eea;
            border-color: #168eea;
            padding: 10px 25px;
            font-size: 18px;
        }
        .btn-primary:hover, .btn-primary:focus {
            background-color: #0d6aad;
            border-color: #0d6aad;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-6 login-container">
            <div class="card login-form">
                <h2 class="text-center mb-4">欢迎登录</h2>
                <form action="loginServlet">
                    <div class="form-group">
                        <label for="username">用户名：</label>
                        <input type="text" class="form-control" name="uid" id="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">密码：</label>
                        <input type="password" class="form-control" name="upwd" id="password" required>
                    </div>
                    <div class="form-group text-center mt-5">
                        <button class="btn btn-primary btn-block">登录</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
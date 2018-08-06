<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>
<body>
  <center>
    <h1>登陆</h1>
    <hr>
    <%
        request.setCharacterEncoding("utf-8"); //解决中文乱码问题
    %>
    <form name="regForm" action="doLogin" method="post">
        <table>
            <tr>
                <td>账号：</td>
                <td><input type="text" name="account" />
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" />
                </td>
            </tr>
            </table>
            <table>
            <tr>
                <td colspan="1"><input type="submit" value="登录" /></td>
                <td colspan="1"><input type="reset" value="重置" /></td>
            </tr>
            </table>
    </form>
    <br>还没有账号？请注册<input type="button" value="注册" onclick = "window.location.href = 'http://localhost:8080/toPage?pageName=toRegist'"/>
    </center>
</body>
</html>
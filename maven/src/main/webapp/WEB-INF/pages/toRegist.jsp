<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
	<body>
  <center>
    <h1>注册</h1>
    <hr>
    <%
        request.setCharacterEncoding("utf-8"); //解决中文乱码问题
    %>
    <form name="regForm" action="doRegis" method="post">
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
                <td colspan="1"><input type="submit" value="注册" /></td>
                <td colspan="1"><input type="reset" value="重置" /></td>
            </tr>
            </table>
    </form>
    </center>
</body>
</html>
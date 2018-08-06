<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery.js"></script>
</head>
<body>
	
	<div id = 'users'>
		<table>
			<tr>
				<td>用户</td><td>操作</td>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td><input type="checkbox"  name="names" value="${user.name }" /></td><td>${user.name }</td><td><a href="/delete?user=${user.name }">注销</a></td>
				</tr>
				
			</c:forEach>
		</table>
		<button id="deletebt">刪除</button>
	</div>
</body>
<script type="text/javascript">
	$("#deletebt").click(function(){
	    obj = document.getElementsByName("names");
	    check_val = [];
	    for(k in obj){
	        if(obj[k].checked)
	            check_val.push(obj[k].value);
	    }
	    window.location.href="/deleteAll?names="+check_val; 
	});
</script>
</html>
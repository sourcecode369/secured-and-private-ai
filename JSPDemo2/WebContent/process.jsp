<%@ page import="bean.RegisterDao" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- The jsp:useBean action tag is used to locate or instantiate a bean class. 
If bean object of the Bean class is already created, it doesn't create the bean depending on the scope. 
But if object of bean is not created, it instantiates the bean. --%>
<jsp:useBean id="obj" class="bean.User"/>

<%-- The setProperty and getProperty action tags are used for developing web application with Java Bean.
 In web devlopment, bean class is mostly used because it is a reusable software component that represents data. --%>
<jsp:setProperty property='*' name='obj'/> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
	<body>
		<%
			int status = RegisterDao.register(obj);
			if (status>0){
				out.print("You are sucessfully registererd.!");
			}
		%>
	</body>
</html>
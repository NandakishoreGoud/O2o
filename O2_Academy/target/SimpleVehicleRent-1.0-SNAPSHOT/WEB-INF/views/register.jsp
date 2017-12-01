<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

	 <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
	 
</head>
<body>

	<div class="wrapper">

<h2>Register </h2>

<form:form modelAttribute="userInfo"  action="register">
  

  <div class="container">
    <label><b>Name</b></label>
    <form:input type="text" placeholder="Enter Username" name="name" path="name" required="required"></form:input>

    <label><b>Associate Id</b></label>
    <form:input type="Tel" placeholder="Enter Id" name="Id" path="associateId" required="required"></form:input>

    <label><b>Role</b></label>
    
 <form:select name="Role" path="role">
    <form:option value="associate">Associate</form:option>
    <form:option value="mentor">Mentor</form:option>
    <form:option value="Supervisor">Supervisor</form:option>
  </form:select>

  <br>

    <label><b>Email Id</b></label>
    <form:input type="Email" placeholder="Email Id" name="Email" path="emailId" required="required"></form:input>

    <label><b>Select Username</b></label>
    <form:input type="text" placeholder="Enter name" name="uname" path="userName" required="required"></form:input>

    <label><b>Select Password</b></label>
    <form:input type="password" placeholder="Select Password" name="password" path="password" required="required" ></form:input>

    <label><b>Confirm Password</b></label>
    <form:input type="password" placeholder="Confirm Password" name="Password" path="confirmPassword" required="required" ></form:input>        
    <button type="submit">Sign Up</button>
    
  </div>

  

  
</form:form>
</div>>
</body>
</html>
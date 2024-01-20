<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leave history</title>
</head>
<body>
<div align="center">
	<h1>Product Details</h1>
<table border="2">
  <tr >
     <th>Product pid</th>
     <th>Product pname</th>
     <th>Quantity</th>
     <th>price</th>
     <th>action</th>
  </tr>
  <c:forEach var="e" items="${elist}">
     <tr>
       <td>${e.Empno}</td>
       <td>${e.Start_Date}</td>
       <td>${e.End_Date}</td>
       <td>${e.Leave_Type}</td>
       <td>${e.Leave_Reason}</td>
      
     </tr>
  </c:forEach>
</table>
</div>
</body>
</html>
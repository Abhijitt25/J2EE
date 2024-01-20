<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<div align="center">
<h1>Apply Leave Page</h1>
 <form action="insertleave" method="post">
       Empno : <input type="text" name="eid" id="eid"><br>
       Start Date : <input type="text" name="sdate" id="sdate"><br>
       End date: <input type="text" name="edate" id="edate"><br>
       Leave type : <select>
       						<option>earned leave</option>
       						<option>Loss of Pay</option>
                    </select>
      Leave Reason: <select>
       						<option>personal</option>
       						<option>Sick</option>
       						<option>Ritual</option>
                    </select>
         <button type="submit" name="btn" id="btn">Apply Leave</button>
   </form>
</div>
</body>
</html>
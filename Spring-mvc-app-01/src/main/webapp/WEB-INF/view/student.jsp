<%@ page import="java.util.List" %>
<%@ page import="com.app.Model.Student" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: swapnil farande
  Date: 22-02-2024
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<%
    List<Student> students = (List<Student>) request.getAttribute("students");
    PrintWriter printWriter = response.getWriter();
    printWriter.println("<table border: 10px solid black><tr><th>StudentId</th> <th>StudentName</th> <th>StudentCity</th> <th>StudentPhone</th> </tr>");

    for (Student student:students){

        printWriter.println("<tr>");
        printWriter.println("<td>"+student.getStudentId()+"</td>");
        printWriter.println("<td>"+student.getStudentName()+"</td>");
        printWriter.println("<td>"+student.getStudentCity()+"</td>");
        printWriter.println("<td>"+student.getStudentPhone()+"</td>");
        printWriter.println("</tr>");

        //printWriter.println(student);
    }
    printWriter.println("</table>");
%>

</body>
</html>

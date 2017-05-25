<%--
  Created by IntelliJ IDEA.
  User: jakubinyi
  Date: 2017.05.17.
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>

    <%
        Integer uid = Integer.valueOf(request.getParameter("uid"));
        System.out.println("UID: " + uid);
    %>

    <script type="text/javascript">var uid = <%=uid%>;</script>
</head>
<body>
    <script src="webjars/jquery/3.2.0/jquery.min.js"></script>
    <script src="student.js"></script>

</body>
</html>

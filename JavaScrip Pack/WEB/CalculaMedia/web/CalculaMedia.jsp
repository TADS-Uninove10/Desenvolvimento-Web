<%-- 
    Document   : CalculaMedia.jsp
    Created on : 10/09/2014, 09:09:49
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="med" scope="page" class="bean.Media" />
        <jsp:setProperty name="med" property="n1" value="<%=request.getParameter("n1")%>" />
        <jsp:setProperty name="med" property="n2" value="<%=request.getParameter("n2")%>" />
        <jsp:setProperty name="med" property="n3" value="<%=request.getParameter("n3")%>" />
        <h1>Maumau & Presidente!</h1>
        <%= med.Calcula()%>
    </body>
</html>

<%-- 
    Document   : Calculo
    Created on : 24/09/2014, 09:03:33
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
        <h1> Consulta</h1>
    </body>
    <jsp:useBean id="med" scope="page" class="CalculaFrete" />
        <jsp:setProperty name="med" property="n1" value="<%=request.getParameter("n1")%>" />
        <jsp:setProperty name="med" property="n2" value="<%=request.getParameter("n2")%>" />
        <jsp:setProperty name="med" property="n3" value="<%=request.getParameter("n3")%>" />
</html>

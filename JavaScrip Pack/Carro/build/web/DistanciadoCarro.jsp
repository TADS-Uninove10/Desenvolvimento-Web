<%-- 
    Document   : DistanciadoCarro
    Created on : 15/10/2014, 09:05:02
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
         <jsp:useBean id="med" scope="page" class="bean.Viagem" />
        <jsp:setProperty name="med" property="n1" value="<%=request.getParameter("n1")%>" />
        <jsp:setProperty name="med" property="n2" value="<%=request.getParameter("n2")%>" />
      
       
        <h1>Você faz</h1>
        <%= med.tanque()%>
        <p><a href="CalcularViagem.jsp">Veja quanto o tanque faz</a></p>
    </body>
</html>

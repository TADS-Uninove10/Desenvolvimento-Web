<%-- 
    Document   : geraCookies
    Created on : 08/10/2014, 09:04:25
    Author     : Administrador
--%>


<%@page language = "java" import = "java.util.*"%>
<% String nome = request.getParameter("nome");
    if (nome == null) {  //if (nome.iqual(""))
        nome = "";
    }
    Cookie meuCookie = new Cookie("nomeDoUsuario", nome);
    meuCookie.setMaxAge(3600);//set em segundos
    response.addCookie(meuCookie);//gravar no browser
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><a href="Exibicookies.jsp">Veja valor do Cookie...</a></p>
    </body>
</html>

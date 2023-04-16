<%-- 
    Document   : Exibicookies
    Created on : 08/10/2014, 09:15:13
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%
    String dadoscookie = "";
    String cooNome = "nomeDoUsuario";
    Cookie cookies[] = request.getCookies();//pede os cookies para o browser
    Cookie exemploCookieNome = null;
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(cooNome)) {
                dadoscookie = cookies[i].getValue();
                exemploCookieNome = cookies[i];
                break;
            }
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            if (exemploCookieNome == null) {
                out.println("Nao foi encontrado cookie com o nome: <b>"
                        + cooNome + "</b>");
            } else {
                out.println(dadoscookie);
            }
        %>
    </body>
</html>

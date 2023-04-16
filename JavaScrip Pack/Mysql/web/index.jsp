<%-- 
    Document   : index
    Created on : 29/10/2014, 09:29:44
    Author     : Administrador
--%>

<%@page import="bb.Connsql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>  </b>

        <%

            Connsql a = new Connsql();
            out.print(a.getConexaoMysQL().toString() + "<br> <br>");
            out.print (a.conexao (request.getParameter("login"),
                    request.getParameter("senha")));

        %>



    </body>
</html>

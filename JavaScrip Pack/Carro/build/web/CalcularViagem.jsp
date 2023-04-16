<%-- 
    Document   : CalcularViagem
    Created on : 15/10/2014, 10:02:36
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
         <h1>quanto seu faz</h1><br>
               <form method="post" action="CalcularViagem.jsp">     
              
              <input type="Text" name ="v1" id="v1" />
              <h1>Digita a distancia da viagem</h1><br>
              <input type="Text" name ="v2" id="v2" />
              <input type="SUBMIT" VALUES ="CALCULAR" />
              
         <jsp:useBean id="med" scope="page" class="bean2.Distancia" />
        <jsp:setProperty name="med" property="v1" value="<%=request.getParameter("v1")%>" />
        <jsp:setProperty name="med" property="v2" value="<%=request.getParameter("v2")%>" />
      <h1>Você precisa de </h1>
       <%= med.Distac()%>
        
    </body>
    
        
</html>

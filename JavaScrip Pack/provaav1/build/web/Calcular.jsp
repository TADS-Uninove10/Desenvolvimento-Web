<%-- 
    Document   : Calcular
    Created on : 22/10/2014, 16:01:15
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
          <jsp:useBean id="med" scope="page" class="bean.CalcularFrete" />
        <jsp:setProperty name="med" property="oNome" value="<%=request.getParameter("oNome")%>" />
        <jsp:setProperty name="med" property="ocpf" value="<%=request.getParameter("ocpf")%>" />
        <jsp:setProperty name="med" property="orua" value="<%=request.getParameter("orua")%>" />
        <jsp:setProperty name="med" property="ocep" value="<%=request.getParameter("ocep")%>" />
        <jsp:setProperty name="med" property="otel" value="<%=request.getParameter("otel")%>" />
        <jsp:setProperty name="med" property="dNome" value="<%=request.getParameter("dNome")%>" />
        <jsp:setProperty name="med" property="dcpf" value="<%=request.getParameter("dcpf")%>" />
        <jsp:setProperty name="med" property="drua" value="<%=request.getParameter("drua")%>" />
        <jsp:setProperty name="med" property="dcep" value="<%=request.getParameter("dcep")%>" />
        <jsp:setProperty name="med" property="dtel" value="<%=request.getParameter("dtel")%>" />
        <jsp:setProperty name="med" property="pro" value="<%=request.getParameter("pro")%>" />
        <jsp:setProperty name="med" property="alt" value="<%=request.getParameter("alt")%>" />
        <jsp:setProperty name="med" property="lar" value="<%=request.getParameter("lar")%>" />
        <jsp:setProperty name="med" property="pe" value="<%=request.getParameter("pe")%>" />
        
        
         <%= med.Calcular()%>
        
        
        
       
    </body>
</html>

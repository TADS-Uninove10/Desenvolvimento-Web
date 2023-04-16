<%-- 
    Document   : index
    Created on : 22/10/2014, 15:23:38
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
       <%--  <%response.sendRedirect("calcular.jsp?nome=+oNome");%> --%>
       
         <link rel="stylesheet" type="text/css" href="Estilo/Formatação.css">
        
        <h1>Endereço de origem</h1>
        nome:
        <input type="text" name="oNome" id="oNome"size="10"  maxlenght="20" ></input>
        cpf ou cnpj
        <input tupe="text" name="ocpf" id="ocpf"sizer="10" maxlenght="20" ></input>
        rua
        <input tupe="text" name="orua" id="orua"sizer="10" maxlenght="20" ></input>
        cep:
        <input type="text" name="ocep" id="ocep"size="10"  maxlenght="20" ></input>
        telefone
        <input tupe="text" name="otel" id="otel"sizer="10" maxlenght="20" ></input>

        

        <br>
        <br>
        <br>
        <h1>Produto1</h1><br>
        <div>
            <img src="images/Caixa.jpg"><br
        </div>
        

               profundidade:
                <input type="text" name="pro" id="pro" size="10"  maxlenght="20" ></input>
                altura:
                <input type="text" name="alt" id="alt" size="10"  maxlenght="20" ></input>
                largura: 
                <input type="text" name="lar" id="lar" size="10"  maxlenght="20" ></input>
                peso:
                <input type="text" name="pe" id="pe" size="10"  maxlenght="20" ></input>
                  



                <h1>Destinatario</h1>
                nome:
                <input type="text" name="dNome" id="dNome" size="10"  maxlenght="20" ></input>
                cpf ou cnpj
                <input tupe="text" name="dcpf" id="dcpf"sizer="10" maxlenght="20" ></input>
                rua
                <input tupe="text" name="drua" id="drua"sizer="10" maxlenght="20" ></input>
                cep:
                <input type="text" name="dcep" id="dcep"size="10"  maxlenght="20" ></input>
                telefone
                <input tupe="text" name="dtel" id="dtel"sizer="10" maxlenght="20" ></input>
                
                

                <input type="submit" value="ENVIAR"></input>
                
                
                </body>
                </html>

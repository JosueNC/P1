<%-- 
    Document   : index
    Created on : 04/10/2020, 23:46:13
    Author     : josue
--%>

<%@page import="br.sp.fatec.poo.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Índice</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <h1>Josué Nogueira Custódio</h1>
        <h3>RA: 1290481823019</h3>
        <h3>Disciplinas Matriculadas:
            <%=Disciplina.getList().size()%>
        </h3>
    </body>
</html>

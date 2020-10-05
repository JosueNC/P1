<%-- 
    Document   : disciplinas
    Created on : 04/10/2020, 23:46:05
    Author     : josue
--%>

<%@page import="br.sp.fatec.poo.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
    </head>
    <body>
        <%if(request.getParameter("salvar")!=null){
            int nota = Integer.parseInt(request.getParameter("nota"));
            int contador = Integer.parseInt(request.getParameter("indice"));
            Disciplina alterar = Disciplina.getList().get(contador);
            alterar.setNota(nota);
        }
        %>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <h1>Minhas Disciplinas</h1>
        <table border="1">
            <tr>
                <th>Disciplina</th>
                <th>Ementa</th>
                <th>Ciclo</th>
                <th>Nota</th>
            </tr>
            <%for(int i=0; i<Disciplina.getList().size();i++){
                Disciplina disc = (Disciplina) Disciplina.getList().get(i);%>
                <tr>
                    <td><%=disc.getNome()%></td>
                    <td><%=disc.getEmenta()%></td>
                    <td><%=disc.getCiclo()%></td>
                    <td>
                        <form method="get">
                            <input type="number" name="nota" value="<%=disc.getNota()%>">
                            <input type="submit" name="salvar" value="Salvar">
                            <input type="hidden" name="indice" value="<%=i%>">
                        </form>
                    </td>
                </tr>
            <%}%>
        </table>
    </body>
</html>

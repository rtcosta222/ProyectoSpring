<%-- 
    Document   : web08containerdepartamentos
    Created on : 09-mar-2021, 19:43:30
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Departamentos Container</h1>
        <form method="post">
            <label>Id dept.</label>
            <input type="text" name="id" required/>
            <button type="submit">Buscar dept</button>
        </form>
        <hr/>
        <c:if test="${DEPARTAMENTO != null}">
            <h1>
                <c:out value="${DEPARTAMENTO.dnum}"/> -
                <c:out value="${DEPARTAMENTO.dnom}"/> -
                <c:out value="${DEPARTAMENTO.dloc}"/>
            </h1>
        </c:if>
    </body>
</html>

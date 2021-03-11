<%-- 
    Document   : web011hospitales
    Created on : 10-mar-2021, 19:14:01
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
    <form method="post">
        <label> Intro hcod: </label>
        <input type="text" name="cjhcod"/>
        <button type="submit">Borrar hospital</button>
    </form>
    
    <hr/>
    <body>
        <h1>DI Hospitales</h1>
        <table>
            <thead>
                <tr>
                    <th>HCod.</th>
                    <th>HNom.</th>
                    <th>HDir.</th>
                    <th>HTel.</th>
                    <th>Hncama.</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${HOSPITALES}" var="hosp">
                    <tr>
                        <td><c:out value="${hosp.hcod}"/></td>
                        <td><c:out value="${hosp.hnom}"/></td>
                        <td><c:out value="${hosp.hdir}"/></td>
                        <td><c:out value="${hosp.htel}"/></td>
                        <td><c:out value="${hosp.hncama}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

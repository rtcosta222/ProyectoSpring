<%-- 
    Document   : web141almacenarsalarios
    Created on : 14-mar-2021, 20:00:26
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring - Adicionar Salarios - Repaso</title>
    </head>
    <body>
        <h1>Session - Adicionar empleados</h1>
        <a href="web15mostrarempleados.htm">Mostrar empleados en Session</a><hr/>
        <c:if test="${NUMALMACENADOS != null}">       
            <h1 style="color: blue">Empleados en Session: <c:out value="${NUMALMACENADOS}"/></h1>
        </c:if>
        <c:if test="${IDDUPLICADA != null}">       
            <h2 style="color: red">Empleado ya está en Session</h2>
        </c:if>

        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Apellido</th>
                    <th>Oficio</th>
                    <th>Salario</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${TABLAEMP}" var="emp">
                    <tr>
                        <td><c:out value="${emp.id}"/></td>
                        <td><c:out value="${emp.apellido}"/></td>
                        <td><c:out value="${emp.oficio}"/></td>
                        <td><c:out value="${emp.salario}"/></td>
                        <td>
                            <c:choose>
                                <c:when test="${sessionScope.listaids.contains(emp.id.toString())}">
                                    <img src="images/check-clipart.jpg" width="20px" height="20px"/>
                                </c:when>
                                <c:otherwise>
                                    <a href="web15almacenarempleados.htm?AnadirIdEmp=${emp.id}">Anadir</a>                            
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

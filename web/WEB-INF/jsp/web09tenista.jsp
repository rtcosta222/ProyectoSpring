<%-- 
    Document   : web09tenista
    Created on : 10-mar-2021, 4:32:56
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
        <h1>Objetos con contenedor Application Context</h1>
        <h2>Objeto clase Tenista</h2>
        <h1 style="color: blue"><c:out value="${TENISTA.nombre}"/></h1>
        <h1 style="color: red"><c:out value="${TENISTA.palmares}"/> títulos GRAND SLAM</h1>
        <img src="${TENISTA.imagen}" width="600" height="auto"/>
        <hr/>
        <h2>Objeto clase GrandSlam</h2>
        <h1><c:out value="${GRANDSLAM.titulo}"/></h1>
        <h1 style="color: blue"><c:out value="${GRANDSLAM.tenista.nombre}"/></h1>
        <h1 style="color: red"><c:out value="${GRANDSLAM.tenista.palmares}"/> títulos GRAND SLAM</h1>
        <img src="${GRANDSLAM.tenista.imagen}" width="600" height="auto"/>        
    </body>
</html>

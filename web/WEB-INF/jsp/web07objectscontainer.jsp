<%-- 
    Document   : newjspweb07objectscontainer
    Created on : 09-mar-2021, 17:31:24
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
        <h1>Objects Container</h1>
        <h2 style="color:blue">
            Marca: <c:out value="${CAR.marca}"/>, 
            Modelo: <c:out value="${CAR.modelo}"/>
        </h2>
        <h2 style="color:red">
            Vel. máxima: <c:out value="${CAR.velocidadMaxima}"/>
        </h2>
        <h2 style="color:green">
            Conductor: <c:out value="${DRIVER.nombre}"/>
        </h2>
        <h2 style="color:blueviolet">
            Marca coche: <c:out value="${DRIVER.coche.marca}"/>, 
            Modelo coche: <c:out value="${DRIVER.coche.modelo}"/>
        </h2>
    </body>
</html>

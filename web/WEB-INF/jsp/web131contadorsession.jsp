<%-- 
    Document   : web131contadorsession
    Created on : 14-mar-2021, 19:33:21
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Repaso web13</title>
    </head>
    <body>
        <h1>contador Session</h1>
        <form method=""post>
            <button type="submit" name="incr" value="1">Incrementar</button>
        </form>
        <h1>Valor del contador <c:out value="${CONTADOR}"></c:out></h1>
    </body>
</html>

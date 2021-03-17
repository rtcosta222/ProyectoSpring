<%-- 
    Document   : web19multihospitaldoctores
    Created on : 16-mar-2021, 18:09:25
    Author     : lscar
    Práctica   : Controller19MultiHospitalDoctores (versión 1)
                Al arrancar la página, mostraremos siempre los Hospitales.
                1) Tendremos la posibilidad de visualizar los doctores de un 
                    hospital seleccionado (GET, POST)
                2) Una caja de texto para poder incrementar el salario de los 
                    doctores de un hospital determinado.
                Versión 2:
                3) Poder eliminar con GET a uno de los doctores.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SPRING - Multi Actions</title>
    </head>
    <body>
        <h1>Multi Actions - Hospital/Doctor</h1>
        <form method="GET" action="web19multihospitaldoctores.htm">
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>HCod</th>
                        <th>Nom</th>
                        <th>Dir</th>
                        <th>Tel</th>
                        <th>Camas</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${TABLAHOSPITAL}" var="hosp">
                        <tr>
                            <td><input type="radio" name="hcod" value="${hosp.hcod}"/></td>
                            <td><c:out value="${hosp.hcod}"/></td>
                            <td><c:out value="${hosp.hnom}"/></td>
                            <td><c:out value="${hosp.hdir}"/></td>
                            <td><c:out value="${hosp.htel}"/></td>
                            <td><c:out value="${hosp.hncama}"/></td>
                            <td><input type="text" name="cjincsal" placeholder="Valor del incremento"/>    </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button type="submit" name="option" value="getDoctoresHospital">Ver doctores</button>
            <button type="submit" name="option" value="incSalDoctoresHospital">Incrementar salarios doctores</button>
        </form>
        <hr/>
        <c:if test="${DOCTORESHOSPITAL != null}">
            <table>
                <thead>
                    <tr>
                        <th>hcod</th>
                        <th>docno</th>
                        <th>ape</th>
                        <th>esp</th>
                        <th>sal</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${DOCTORESHOSPITAL}" var="doc">
                        <tr>
                            <td><c:out value="${doc.hcod}"/></td>
                            <td><c:out value="${doc.docno}"/></td>
                            <td><c:out value="${doc.ape}"/></td>
                            <td><c:out value="${doc.esp}"/></td>
                            <td><c:out value="${doc.sal}"/></td>
                        </tr>
                     </c:forEach>
                </tbody>
            </table>
        </c:if>
    </body>
</html>

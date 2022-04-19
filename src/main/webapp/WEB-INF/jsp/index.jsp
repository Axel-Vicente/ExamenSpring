<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>

    </head>
    <body>
        <div class="container">
            <br><br>
                <form:form action="/play" method="get" modelAttribute="examen">
                    <form:input class="form-control" type="text" placeholder="Escribe lo que quieres comprobar..." required="required" path="param1"/>
                    <form:input class="form-control" type="text" path="param2"/>
                    <br>
                    <input class="btn btn-primary" type="submit" value="Calcular"/>
                </form:form>
                <div class="alert alert-success" role="alert">
                    <h1>${message}</h1>
                </div>
        </div>
    </body>
</html>
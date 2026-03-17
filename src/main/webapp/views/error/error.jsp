<%-- 
    Document   : error
    Created on : 5 mar 2026, 6:23:03 p.m.
    Author     : Adrián
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Error</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="./styles/styles.css">
    </head>

    <body>

        <section class="auth-container">
            <%= exception != null && exception.getMessage() != null ? exception.getMessage() : "Ocurrio un error desconocido al cargar el recurso solicitado"%>

            <div class="auth-card">

                <div class="form-header">
                    <h3>Algo salió mal</h3>
                    <p class="form-subtitle">
                        No se pudo completar la operación.
                    </p>
                </div>

                <div class="form-group">
                    <p>
                        Ocurrió un problema al procesar tu solicitud.
                        Intenta nuevamente o vuelve al inicio.
                    </p>
                </div>

                <div class="form-group">
                    <label>Detalle del error:</label>
                    <p id="error-message">
                        Aquí aparecerá el mensaje de la excepción.
                    </p>
                </div>

                <button class="btn-primary" onclick="location.href = './iniciar-sesion.jsp'">
                    Volver a iniciar sesión
                </button>

                <button class="btn-secondary" onclick="location.href = './index.jsp'">
                    Ir al inicio
                </button>

            </div>

        </section>

    </body>
</html>


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import MODEL.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.IUsuarioService;
import service.UsuarioService;

/**
 *
 * @author martinbl
 */
@WebServlet(name = "AutenticacionServlet", urlPatterns = {"/autenticacion"})
public class AutenticacionServlet extends HttpServlet {

    private final IUsuarioService usuarioService = new UsuarioService();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        
        Usuario usuario = usuarioService.autenticar(correo, contrasenia);
        
        try{
            
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario",usuario);
            sesion.setAttribute("correo", correo);
            response.sendRedirect("index.html");
        }catch(IllegalArgumentException e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/views/auth/iniciar-sesion.html").forward(request, response);
        }catch(Exception e){
            throw new ServletException("Error al autenticar usuario");
        }
    }


}

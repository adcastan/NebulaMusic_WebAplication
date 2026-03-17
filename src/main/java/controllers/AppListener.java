/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.*;

/**
 *
 * @author Adrián
 */
public class AppListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent evt){
        ServletContext app = evt.getServletContext();
        
        app.setAttribute("appname","Nebula Music");
    }
    
        @Override
    public void contextDestroyed(ServletContextEvent evt){
        ServletContext app = evt.getServletContext();
        
        app.setAttribute("appname","Nebula Music");
    }
}

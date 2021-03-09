/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller03InfoViewController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {

        // Define View destino:
        ModelAndView mv = new ModelAndView("web03infoviewcontroller");
        
        // Prepara los datos y los empaqueta con labels:
        String dato1 = hsr.getParameter("num01");
        String dato2 = hsr.getParameter("num02");

        if (dato1 != null) {
            int num01 = Integer.parseInt(dato1);
            int num02 = Integer.parseInt(dato2);
            int suma = num01 + num02;
            String mensaje = "<h1>La suma es " + suma + "</h1>";
            // Disponibiliza los datos para la View destino:
            mv.addObject("RESPUESTA", mensaje);
        }
        return mv;
    }
}

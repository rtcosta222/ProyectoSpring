/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Persona;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller02InfoControllerView implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {

        ModelAndView mv = new ModelAndView("web02infocontrollerview");

        String mensaje = "Primer mensaje con Spring";
        mv.addObject("mensaje", mensaje);

        String html = "<h1>Codigo html</h1>";
        mv.addObject("html", html);

        Persona persona = new Persona("rtc", "rtc@mail", 22);
        mv.addObject("PERSONA", persona);

        return mv;
    }
}

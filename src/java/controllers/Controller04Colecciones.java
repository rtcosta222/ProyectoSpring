/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Persona;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller04Colecciones implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web04colecciones");

        ArrayList<Persona> personas = new ArrayList<>();
        Persona p = new Persona("aaa", "bbb",35);
        personas.add(p);
        p = new Persona("ccc", "ddd",35);
        personas.add(p);
        p = new Persona("eee", "fff",35);
        personas.add(p);
        mv.addObject("PERSONAS", personas);
        return mv;
    }
    
}

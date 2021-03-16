/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author lscar
 */
public class Controller16MultiAction extends MultiActionController{
    public ModelAndView inicio(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web16multiaction");
        return mv;
    }

    public ModelAndView operar(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web16multiaction");
        int num01 = Integer.parseInt(request.getParameter("num01"));
        int num02 = Integer.parseInt(request.getParameter("num02"));
        String oper = request.getParameter("operacion");
        if(oper.equals("sumar")){
            mv.addObject("MSG", "La suma es " + (num01 + num02));
        } else if(oper.equals("multiplicar")){
            mv.addObject("MSG", "La multiplicación es " + (num01 * num02));            
        }
        return mv;
    }
    
    public ModelAndView alta(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web16multiaction");
        mv.addObject("MSG", "Usuario dado de alta");
        return mv;
    }
    
    public ModelAndView baja(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web16multiaction");
        mv.addObject("MSG", "Usuario dado de baja");
        return mv;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author lscar
 */
public class Controller171MultiAccionesMates extends MultiActionController{
    
    public ModelAndView iniciar(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web171multiaccionesmates");
        return mv;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView tablamulti(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web171multiaccionesmates");
        String ui = request.getParameter("cjnum");
        int multi = Integer.parseInt(ui);
        ArrayList<Integer> tablamulti = new ArrayList<>();
        for(int i = 1; i <= 10 ; i++){
            tablamulti.add(i*multi);
        }
        mv.addObject("TABLAMULTI", tablamulti);
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView pares(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web171multiaccionesmates");
        String ui = request.getParameter("cjnum");
        int limite = Integer.parseInt(ui);
        ArrayList<Integer> pares = new ArrayList<>();
        for(int i = 1; i <= limite; i++){
            if(i%2 == 0){
                pares.add(i);
            }
        }
        mv.addObject("PARES", pares);
        return mv;            
    }
}

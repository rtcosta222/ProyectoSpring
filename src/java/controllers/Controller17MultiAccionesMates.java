/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author lscar
 */
public class Controller17MultiAccionesMates extends MultiActionController{
    public ModelAndView iniciar(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web17multiaccionesmates");
        return mv;
    }
    
    public ModelAndView operar(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("web17multiaccionesmates");
        String ui = request.getParameter("cjnum");
        int multi = Integer.parseInt(ui);
        String operacion = request.getParameter("tipooper");
        if(operacion.equals("tablamulti")){
            ArrayList<Integer> tablamulti = new ArrayList<>();
            for(int i = 1; i <= 10 ; i++){
                tablamulti.add(i*multi);
            }
            mv.addObject("TABLAMULTI", tablamulti);
        } else if(operacion.equals("pares")){
            ArrayList<Integer> pares = new ArrayList<>();
            for(int i = 1; i <= multi; i++){
                if(i%2 == 0){
                    pares.add(i);
                }
            }
            mv.addObject("PARES", pares);
        } else{
            mv.addObject("MSG", "Operación inválida");
        }
        return mv;
    }
}

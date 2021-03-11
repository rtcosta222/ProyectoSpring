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
public class Controller13ContadorSession implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web13contadorsession"); 
        String ui = hsr.getParameter("incremento");
        if(ui != null){
            int contador = 1;
            // El contador tendrá valor uno pero solo la primera vez. Luego tendrá el valor 
            // que hayamos almacenado en Session. Necesitaremos saber si el contador está
            // en session. Si sí, recuperamos el objeto de session, lo incrementamos y lo
            // volvemos a almacenar.
            if(hsr.getSession().getAttribute("CONTADOR") != null){
                contador = (int)hsr.getSession().getAttribute("CONTADOR");
            }
            contador += 1;
            hsr.getSession().setAttribute("CONTADOR", contador);
            mv.addObject("CONTADOR", contador);
        }
        return mv;
    }
    
}

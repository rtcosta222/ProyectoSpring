/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TablaMulti;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller05TablaMultiplicar implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        // View de destino
        ModelAndView mv = new ModelAndView("web05tablamultiplicar");
        String ui = hsr.getParameter("multi");
        
        // Versión 01:
        if (ui != null) {
            int multi = Integer.parseInt(ui);
            String html = "";
            for (int i=1; i<11; i++) {
                html += "<tr>";
                html += "<td>" + i + "</td>";
                html += "<td>" + multi + "</td>";
                html += "<td>" + (multi*i) + "</td>";
                html += "</tr>";
            }
            mv.addObject("TABLAMULTI", html);
        }
            
        // Versión 02:
        if (ui != null) {
            int multi = Integer.parseInt(ui);
            TablaMulti tmulti = new TablaMulti();
            ArrayList<TablaMulti> tablam = new ArrayList<>();
            for (int i=1; i<11; i++) {
                tmulti = new TablaMulti(multi, i, multi*i);
                tablam.add(tmulti);
            }
            mv.addObject("TABLAMULTIOBJ", tablam);
        }
        return mv;
    }
}

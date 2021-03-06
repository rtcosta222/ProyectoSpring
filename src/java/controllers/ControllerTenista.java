/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.GrandSlam;
import models.Tenista;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class ControllerTenista implements Controller{
    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web09tenista");
        Tenista tenista = (Tenista)this.getBean("tenista", hsr.getServletContext());
        mv.addObject("TENISTA", tenista);
        GrandSlam gs =(GrandSlam)this.getBean("gs", hsr.getServletContext());
        mv.addObject("GRANDSLAM", gs);
        return mv;        
    }
    
}

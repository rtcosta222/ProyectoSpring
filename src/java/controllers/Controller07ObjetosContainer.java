/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Coche;
import models.Conductor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller07ObjetosContainer implements Controller{

    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web07objectscontainer");
        Coche car = (Coche)this.getBean("car", hsr.getServletContext());
        mv.addObject("CAR", car);
        Conductor driver =(Conductor)this.getBean("driver", hsr.getServletContext());
        mv.addObject("DRIVER", driver);
        return mv;
    }
    
}

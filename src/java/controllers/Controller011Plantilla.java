/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Plantilla;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoryPlantilla;

/**
 *
 * @author lscar
 */
public class Controller011Plantilla implements Controller{

    private Object getBean(String id, ServletContext context) {
        ApplicationContext container = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web011plantilla");
        // Declaración y asignación del objeto repo.
        RepositoryPlantilla repo = (RepositoryPlantilla)this.getBean("repositoryplantilla",
                                                                    hsr.getServletContext());
        List<Plantilla> plantilla = repo.getPlantilla();
        mv.addObject("PLANTILLA", plantilla);
        return mv;
    }
}

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
import models.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoryHospital;

/**
 *
 * @author lscar
 */
public class Controller011Hospital implements Controller{

    private Object getBean(String id, ServletContext context) {
        ApplicationContext container = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        // Define la View de destino.
        ModelAndView mv = new ModelAndView("web011hospitales");
        // Obtenemos acceso a los métodos definidos en el objeto "repo" para acceder
        // a la bbdd. Lo ideal es declarar el repo como atributo de clase.
        RepositoryHospital repo = (RepositoryHospital) this.getBean("repositoryhospital", 
                                                                    hsr.getServletContext());
        // Eliminar hospital por hcod.
        String ui = hsr.getParameter("cjhcod");
        if(ui != null){
            int hcod = Integer.parseInt(ui);
            repo.eliminarHospital(hcod);
        }
        // Obtiene los datos actualizados y se los envia a la View. 
        List<Hospital> hospitales = repo.getHospitales();
        mv.addObject("HOSPITALES", hospitales);
        return mv;
    }   
}

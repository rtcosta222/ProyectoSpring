/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoryEmpleado;

/**
 *
 * @author lscar
 */
public class Controller15MostrarEmpleados implements Controller{
    RepositoryEmpleado repo;
    
    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web15mostrarempleados");

        String idemp = hsr.getParameter("BorrarIdEmp");
        if(idemp != null){
            ArrayList<String> listaids = (ArrayList<String>)hsr.getSession().getAttribute("listaids");
            listaids.remove(idemp);
            if(listaids.isEmpty()){
                hsr.getSession().setAttribute("listaids", null);
            } else{
                hsr.getSession().setAttribute("listaids", listaids);
            }
        }
        
        if(hsr.getSession().getAttribute("listaids") != null){   
            this.repo = (RepositoryEmpleado)this.getBean("repositoryempleado", hsr.getServletContext());
            ArrayList<String> listaids = (ArrayList<String>)hsr.getSession().getAttribute("listaids");
            List<Empleado> empleados = this.repo.getEmpleadosInSession(listaids);
            mv.addObject("TABLAEMPINSESSION", empleados);
        }
        return mv;
    }
}

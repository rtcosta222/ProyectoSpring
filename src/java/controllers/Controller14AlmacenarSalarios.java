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
public class Controller14AlmacenarSalarios implements Controller{
    RepositoryEmpleado repo;

    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }
       
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web14almacenarsalarios");
        String ui = hsr.getParameter("salario");
        if(ui != null){
            int salario = Integer.parseInt(ui);
            int sumasal = 0;
            if(hsr.getSession().getAttribute("SUMASAL") != null){
                sumasal = (int) hsr.getSession().getAttribute("SUMASAL");                
            }
            sumasal += salario;
            hsr.getSession().setAttribute("SUMASAL", sumasal);
            mv.addObject("SALARIO", salario);
        }
        
        this.repo = (RepositoryEmpleado)this.getBean("repositoryempleado",
                                                      hsr.getServletContext());
        List<Empleado> empleados = repo.getEmpleados();
        mv.addObject("EMPLEADOS", empleados);
        return mv;
    }
    
    
}

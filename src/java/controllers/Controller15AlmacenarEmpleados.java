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
public class Controller15AlmacenarEmpleados implements Controller{

    RepositoryEmpleado repo;
    
    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web15almacenarempleados");
        
        // Anadir empleado a Session:
        String idemp = hsr.getParameter("AnadirIdEmp");
        if(idemp != null) {
            ArrayList<String> idsinsession;
            if(hsr.getSession().getAttribute("listaids") != null){
                idsinsession = (ArrayList<String>)hsr.getSession().getAttribute("listaids");
            } else{
                idsinsession = new ArrayList<>();
            }
            
            if(idsinsession.contains(idemp)){
                boolean iddup = true;
                mv.addObject("IDDUPLICADA", iddup);
            } else{
                idsinsession.add(idemp);
                hsr.getSession().setAttribute("listaids", idsinsession);
            }
            
            int almacenados;
            almacenados = idsinsession.size();
            mv.addObject("NUMALMACENADOS", almacenados);
        }

        this.repo = (RepositoryEmpleado)this.getBean("repositoryempleado",
                                                        hsr.getServletContext());
        List<Empleado> empleados = this.repo.getEmpleados();
        mv.addObject("TABLAEMP", empleados);
        return mv;
    }
}

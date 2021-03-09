/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author lscar
 */
public class Controller08ContainerDepartamentos implements Controller{

    private Object getBean(String id, ServletContext servlet){
        ApplicationContext container = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        Object bean = container.getBean(id);
        return bean;
    }
    // El método siguiente debe estar en un repositorio.
    private Departamento buscarDepartamento(int id, ServletContext context) throws SQLException{
        // Get connection
        DriverManagerDataSource datasource = 
           (DriverManagerDataSource)this.getBean("dataSourceOracle", context);
        Connection cn = datasource.getConnection();
        
        // Acceso a la BBDD
        String sql = "select* from dept where dept_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(num, nom, loc);
            rs.close();
            cn.close();
            return dept;
        }
        rs.close();
        cn.close();
        return null;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web08containerdepartamentos");
        String dato = hsr.getParameter("id");
        if(dato != null){
            int id = Integer.parseInt(dato);
            // Con repositorio: 
            // Departamento dept = this.repo.buscarDepartamento(id, hsr.getServletContext());
            Departamento dept = this.buscarDepartamento(id, hsr.getServletContext());
            mv.addObject("DEPARTAMENTO", dept);
        }
        return mv;
    }    
}

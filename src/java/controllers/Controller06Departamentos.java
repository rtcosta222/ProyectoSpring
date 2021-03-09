/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoryDepartamento;

/**
 *
 * @author lscar
 */
public class Controller06Departamentos implements Controller{
    // Attributes
    RepositoryDepartamento repo;
    // Constructor
    public Controller06Departamentos() {
        this.repo = new RepositoryDepartamento();
    }
    // Methods
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web06departamentos");
        List<Departamento> departamentos = this.repo.getDepartamentos();
        mv.addObject("DEPARTAMENTOS",departamentos);
        return mv;
    }
}

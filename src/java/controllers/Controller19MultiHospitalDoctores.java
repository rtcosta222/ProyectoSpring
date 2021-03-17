/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Doctor;
import models.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import repositories.RepositoryHospitalDoctor;

/**
 *
 * @author lscar
 */
public class Controller19MultiHospitalDoctores extends MultiActionController{

    RepositoryHospitalDoctor repo;
    
    private Object getBean(String id, ServletContext context) {
        ApplicationContext container
                = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }
    
    public ModelAndView start(HttpServletRequest request, HttpServletResponse response) throws SQLException, SQLException{
        ModelAndView mv = new ModelAndView("web19multihospitaldoctores");
        this.repo = (RepositoryHospitalDoctor)this.getBean("repositoryhospitaldoctor", request.getServletContext());
        List<Hospital> hospitales = this.repo.getHospitales();
        mv.addObject("TABLAHOSPITAL", hospitales);
        return mv;
    }
    
    public ModelAndView getDoctoresHospital(HttpServletRequest request, HttpServletResponse response) throws SQLException{
        ModelAndView mv = new ModelAndView("web19multihospitaldoctores");
        String ui = request.getParameter("hcod");
        int hcod = Integer.parseInt(ui);
        this.repo = (RepositoryHospitalDoctor)this.getBean("repositoryhospitaldoctor", request.getServletContext());
        List<Doctor> doctores = this.repo.getDoctoresHospital(hcod);
        mv.addObject("DOCTORESHOSPITAL", doctores);
        List<Hospital> hospitales = this.repo.getHospitales();
        mv.addObject("TABLAHOSPITAL", hospitales);
        return mv;
    }
    
    public ModelAndView incSalDoctoresHospital(HttpServletRequest request, HttpServletResponse response) throws SQLException{
        ModelAndView mv = new ModelAndView("web19multihospitaldoctores");
        String ui = request.getParameter("cjincsal");
        int incrsal = Integer.parseInt(ui);
        ui = request.getParameter("hcod");
        int hcod = Integer.parseInt(ui);
        this.repo = (RepositoryHospitalDoctor)this.getBean("repositoryhospitaldoctor", request.getServletContext());
        this.repo.incSalDoctoresHospital(hcod, incrsal);
        List<Doctor> doctores = this.repo.getDoctoresHospital(hcod);
        mv.addObject("DOCTORESHOSPITAL", doctores);
        List<Hospital> hospitales = this.repo.getHospitales();
        mv.addObject("TABLAHOSPITAL", hospitales);
        return mv;
    }
}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Empleado;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author lscar
 */
public class RepositoryEmpleado {
    DriverManagerDataSource datasource;
    
    public RepositoryEmpleado(DriverManagerDataSource datasource){
        this.datasource = datasource;
    }
    
    public List<Empleado> getEmpleados() throws SQLException{
        Connection cn = this.datasource.getConnection();
        String sql = "select *from emp order by apellido";
        Statement st = cn.createStatement();
        ResultSet z_rs = st.executeQuery(sql);
        ArrayList<Empleado> empleados =new ArrayList<>();
        while(z_rs.next()){
            Empleado emp = new Empleado(z_rs.getInt("EMP_NO"),
                                        z_rs.getString("APELLIDO"),
                                        z_rs.getString("OFICIO"),
                                        z_rs.getInt("SALARIO"));
            empleados.add(emp);
        }
        z_rs.close();
        cn.close();
        return empleados;
    }
    
    public List<Empleado> getEmpleadosInSession(ArrayList<String> listaids) throws SQLException{
        Connection cn = datasource.getConnection();
        // Ajustando el interface de datos.
        String datos = "";
        for(String s: listaids){
            datos += s + ","; 
        }
        datos = datos.substring(0, datos.lastIndexOf(","));

        String sql = "select * from emp where emp_no in(" + datos + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> empleadosinsession = new ArrayList<>();
        while(rs.next()){
            Empleado emp = new Empleado(rs.getInt("EMP_NO"),
                                        rs.getString("APELLIDO"),
                                        rs.getString("OFICIO"),
                                        rs.getInt("SALARIO"));
            empleadosinsession.add(emp);
        }
        rs.close();
        cn.close();
        return empleadosinsession;
        
    }
}

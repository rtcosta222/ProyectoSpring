/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Doctor;
import models.Hospital;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author lscar
 */
public class RepositoryHospitalDoctor {
    
    private DriverManagerDataSource datasource;
    
    public RepositoryHospitalDoctor(DriverManagerDataSource datasource){
        this.datasource = datasource;
    }
    
    public List<Hospital> getHospitales() throws SQLException{
        Connection cn = this.datasource.getConnection();
        String sql = "select * from hospital";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Hospital> hospitales = new ArrayList<>();
        while(rs.next()){
            Hospital hosp = new Hospital(rs.getInt("HOSPITAL_COD"),
                                            rs.getString("NOMBRE"),
                                            rs.getString("DIRECCION"),
                                            rs.getString("TELEFONO"),
                                            rs.getInt("NUM_CAMA"));
            hospitales.add(hosp);
        }
        rs.close();
        cn.close();
        return hospitales;
    }
    
    public List<Doctor> getDoctoresHospital(int hcod) throws SQLException{
        Connection cn = this.datasource.getConnection();
        String sql = "select * from doctor where hospital_cod=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, hcod);
        ResultSet rs = pst.executeQuery();
        ArrayList<Doctor> doctores = new ArrayList<>();
        while(rs.next()){
            Doctor doc = new Doctor(rs.getInt("HOSPITAL_COD"),
                                    rs.getInt("DOCTOR_NO"),
                                    rs.getString("APELLIDO"),
                                    rs.getString("ESPECIALIDAD"),
                                    rs.getInt("SALARIO"));
            doctores.add(doc);
        }
        rs.close();
        cn.close();
        return doctores;
    }
    
    public void incSalDoctoresHospital(int hcod, int incrsal) throws SQLException{
        Connection cn = datasource.getConnection();
        String sql = "update doctor set salario=salario+? where hospital_cod=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, incrsal);
        pst.setInt(2, hcod);
        pst.executeUpdate();
        cn.close();
    }
}

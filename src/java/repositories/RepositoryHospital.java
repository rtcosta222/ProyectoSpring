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
import models.Departamento;
import models.Hospital;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author lscar
 */
public class RepositoryHospital {
    private DriverManagerDataSource datasource;

    public RepositoryHospital(DriverManagerDataSource datasource) {
        this.datasource = datasource;
    }

    public List<Hospital> getHospitales() throws SQLException {
        Connection cn = datasource.getConnection();
        String sql = "select * from hospital";
        Statement z_st = cn.createStatement();
        ResultSet z_rs = z_st.executeQuery(sql);
        ArrayList<Hospital> hospitales = new ArrayList<>();
        while(z_rs.next()){
            Hospital hosp = new Hospital(z_rs.getInt("HOSPITAL_COD"),
                                        z_rs.getString("NOMBRE"),
                                        z_rs.getString("DIRECCION"),
                                        z_rs.getString("TELEFONO"),
                                        z_rs.getInt("NUM_CAMA"));
            hospitales.add(hosp);    
        }
        z_rs.close();
        cn.close();
        return hospitales;
    }
}

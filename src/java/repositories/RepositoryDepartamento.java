/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Departamento;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author lscar
 */
public class RepositoryDepartamento {
    
    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String path = "jdbc:oracle:thin:@localhost:1521:XE";
        Connection cn = DriverManager.getConnection(path, "system", "oracle");
        return cn;
    }
    
    public List<Departamento> getDepartamentos() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Departamento> departamentos = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("DEPT_NO");
            String nombre = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(id, nombre, loc);
            departamentos.add(dept);
        }
        rs.close();
        cn.close();
        return departamentos;
    }
}

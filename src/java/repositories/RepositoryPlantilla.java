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
import models.Plantilla;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author lscar
 */
public class RepositoryPlantilla {

    private DriverManagerDataSource datasource;

    public RepositoryPlantilla(DriverManagerDataSource datasource){
        this.datasource = datasource;
    }
    public List<Plantilla> getPlantilla() throws SQLException{
        Connection connection = this.datasource.getConnection();
        String sql = "select * from plantilla order by apellido";
        Statement stat = connection.createStatement();
        ResultSet rset = stat.executeQuery(sql);
        ArrayList<Plantilla> plantilla = new ArrayList<>();
        while(rset.next()) {
            Plantilla plant = new Plantilla(rset.getInt("HOSPITAL_COD"),
                                            rset.getInt("SALA_COD"),
                                            rset.getInt("EMPLEADO_NO"),
                                            rset.getString("APELLIDO"),
                                            rset.getString("FUNCION"),
                                            rset.getString("TURNO"),
                                            rset.getInt("SALARIO"));
            plantilla.add(plant);
        }
        rset.close();
        connection.close();
        return plantilla;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author lscar
 */
public class Departamento {
    
    private int dnum;
    private String dnom;
    private String dloc;

    public Departamento() {}
    
    public Departamento(int dnum, String dnom, String dloc) {
        this.dnum = dnum;
        this.dnom = dnom;
        this.dloc = dloc;
    }
    
    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }
    
    public String getDnom() {
        return dnom;
    }

    public void setDnom(String dnom) {
        this.dnom = dnom;
    }

    public String getDloc() {
        return dloc;
    }

    public void setDloc(String dloc) {
        this.dloc = dloc;
    }
}

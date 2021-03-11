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
public class Plantilla {
    
    private int hcod;
    private int scod;
    private int empno;
    private String ape;
    private String fun;
    private String t;
    private int sal;

    public Plantilla(){}
    
    public Plantilla(int hcod, int scod, int empno, String ape, String fun, String t, int sal){
        this.hcod = hcod;
        this.scod = scod;
        this.empno = empno;
        this.ape = ape;
        this.fun = fun;
        this.t = t;
        this.sal = sal;
    }
    
    public int getHcod() {
        return hcod;
    }

    public void setHcod(int hcod) {
        this.hcod = hcod;
    }

    public int getScod() {
        return scod;
    }

    public void setScod(int scod) {
        this.scod = scod;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}

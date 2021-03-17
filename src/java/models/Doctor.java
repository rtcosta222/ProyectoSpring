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
public class Doctor {
    private int hcod;
    private int docno;
    private String ape;
    private String esp;
    private int sal;

    public Doctor(){}
    
    public Doctor(int hcod, int docno, String ape, String esp, int sal){
        this.hcod = hcod;
        this.docno = docno;
        this.ape = ape;
        this.esp = esp;
        this.sal = sal;
    }
    
    public int getHcod() {
        return hcod;
    }

    public void setHcod(int hcod) {
        this.hcod = hcod;
    }

    public int getDocno() {
        return docno;
    }

    public void setDocno(int docno) {
        this.docno = docno;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}

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
public class Hospital {
    private int hcod;
    private String hnom;
    private String hdir;
    private String htel;
    private int hncama;
    
    public Hospital(){}
    
    public Hospital(int hcod, String hnom, String hdir, String htel, int hncama){
        this.hcod = hcod;
        this.hnom = hnom;
        this.hdir = hdir;
        this.htel = htel;
        this.hncama = hncama;
    }
    
    public int getHcod() {
        return hcod;
    }

    public void setHcod(int hcod) {
        this.hcod = hcod;
    }

    public String getHnom() {
        return hnom;
    }

    public void setHnom(String hnom) {
        this.hnom = hnom;
    }

    public String getHdir() {
        return hdir;
    }

    public void setHdir(String hdir) {
        this.hdir = hdir;
    }

    public String getHtel() {
        return htel;
    }

    public void setHtel(String htel) {
        this.htel = htel;
    }

    public int getHncama() {
        return hncama;
    }

    public void setHncama(int hncama) {
        this.hncama = hncama;
    }
}

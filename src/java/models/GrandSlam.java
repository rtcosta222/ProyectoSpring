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
public class GrandSlam {
    
    private String titulo;
    private Tenista tenista;

    public GrandSlam(Tenista tenista){
        this.tenista = tenista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tenista getTenista() {
        return tenista;
    }

    public void setTenista(Tenista tenista) {
        this.tenista = tenista;
    }
}

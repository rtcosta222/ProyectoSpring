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
public class TablaMulti {
    
    private int multiplicando;
    private int multiplicador;
    private int resultado;

    public TablaMulti() {}
    
    public TablaMulti(int multiplicando, int multiplicador, int resultado){
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
        this.resultado = resultado;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}

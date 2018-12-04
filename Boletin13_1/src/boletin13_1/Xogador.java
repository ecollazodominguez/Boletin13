/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Xogador extends Seleccion {
    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
    public void xogarPartido(){
        
    }
    public void entrenar(){
        System.out.println("O xogador entrena.");
    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores.\n"+this);
    }

    @Override
    public String toString() {
        return super.toString()+"\nDorsal = " + dorsal + "\nDemarcación = " + demarcacion;
    }
    
    
    
}


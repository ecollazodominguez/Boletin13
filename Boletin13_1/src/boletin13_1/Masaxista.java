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
public class Masaxista extends Seleccion {
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    
    
    @Override
    public void concentrarse(){
        JOptionPane.showMessageDialog(null,"Concéntrase a Selección.");
    }
    public void darMasaxes(){
        
    }
    
    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores.\n"+this);
    }

    @Override
    public String toString() {
        return super.toString()+ "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
    }
    
    
}

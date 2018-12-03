/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador xog1 = new Xogador(1, "Delantero", 1, "Rafa", "Perez", 23);
        Adestrador adestra = new Adestrador("albar", 2, "Alfredo", "Gonzalez", 30);
        Masaxista masa1 = new Masaxista("Experta", 15,10, "Mariano", "Ramirez", 27);
        Seleccion xogador = new Seleccion(2,"Javier", "Alvarez", 24);
        
        xog1.concentrarse();
        adestra.concentrarse();
        masa1.concentrarse();
        xogador.concentrarse();
        
        xog1.viaxar();
        adestra.viaxar();
        masa1.viaxar();
        xogador.viaxar();
        
        xog1.setEdade(35);
        System.out.println(xog1.toString());
  }
    
}

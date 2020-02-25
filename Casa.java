/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.completo;

import ico.componer.Baño;
import ico.componer.Habitacion;
import ico.componer.Puertas;

/**
 *
 * @author USUARIO
 */
public class Casa {
   private Baño numBaños;
   private Habitacion cuartos;
   private Puertas puerta;
   private int pisos;

    public Casa() {
    }

    public Casa(Baño numBaños, Habitacion cuartos, Puertas puerta, int pisos) {
        this.numBaños = numBaños;
        this.cuartos = cuartos;
        this.puerta = puerta;
        this.pisos = pisos;
    }

    public Habitacion getCuartos() {
        return cuartos;
    }

    public Baño getNumBaños() {
        return numBaños;
    }

    public int getPisos() {
        return pisos;
    }

    public Puertas getPuerta() {
        return puerta;
    }

    public void setCuartos(Habitacion cuartos) {
        this.cuartos = cuartos;
    }

    public void setNumBaños(Baño numBaños) {
        this.numBaños = numBaños;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setPuerta(Puertas puerta) {
        this.puerta = puerta;
    }
   public void vivir(){
   
   }
   public void mudarse(){
   
   }
    
    
    
    
}

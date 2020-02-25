/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.componer;

/**
 *
 * @author USUARIO
 */
public class Habitacion {
  
    private int numParedes;
    private String nombre;
    private int numEnchufes;

    public Habitacion() {
    }

    public Habitacion(int numParedes, String nombre, int numEnchufes) {
        this.numParedes = numParedes;
        this.nombre = nombre;
        this.numEnchufes = numEnchufes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEnchufes() {
        return numEnchufes;
    }

    public int getNumParedes() {
        return numParedes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEnchufes(int numEnchufes) {
        this.numEnchufes = numEnchufes;
    }

    public void setNumParedes(int numParedes) {
        this.numParedes = numParedes;
    }
    
    public void meterMuebles(){
    
    }
    
    public void irDormir(){
    }
    
    
    
}

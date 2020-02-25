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
public class Baño {
    private boolean completo;
    private int llaves;
    private String color;

    public Baño() {
    }

    public Baño(boolean completo, int llaves, String color) {
        this.completo = completo;
        this.llaves = llaves;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getLlaves() {
        return llaves;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    public void setLlaves(int llaves) {
        this.llaves = llaves;
    }
    
    public void tirarAgua (){
        System.out.println("Ariendo llave");   
    }
    
    public void prepararBa(){
    }
    
    
    
    
}

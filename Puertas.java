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
public class Puertas {
  private String color;
  private float altura;
  private String dondeAbre;

    public Puertas() {
    }

    public Puertas(String color, float altura, String dondeAbre) {
        this.color = color;
        this.altura = altura;
        this.dondeAbre = dondeAbre;
    }

    public float getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public String getDondeAbre() {
        return dondeAbre;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDondeAbre(String dondeAbre) {
        this.dondeAbre = dondeAbre;
    }
  
  public void ponerSeguro(){
  
  }
  
  public void abrir (){
  
  }
    
    
    
    
    
}

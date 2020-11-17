/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;

public class Triangulo extends Forma {
    
public double Lado;
    public void setLado(double Lado){
    this.Lado = Lado;
  }
  

    @Override
    public double calcularArea() {
        System.out.println("Triangulo");
        System.out.println("Área: ");
       return Math.pow(Lado,2) * (Math.sqrt(3)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro: ");
        return Lado * 3;
    }
    
}
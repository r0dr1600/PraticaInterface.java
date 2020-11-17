/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;

public class Quadrado extends Forma {

    public void setLado(double Lado) {
        this.Lado = Lado;
    }
    
    
    
    double Lado;

    @Override
    public double calcularArea() {
        System.out.println("Quadrado");
        System.out.println("Área: ");
       return  (Lado * Lado);
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro: ");
        return Lado * 4;
    }
    
}
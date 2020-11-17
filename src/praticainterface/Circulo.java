/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;

public class Circulo extends Forma {
    
    double Raio;

    public void setRaio(double Raio) {
        this.Raio = Raio;
    }
    
    

    @Override
    public double calcularArea() {
        System.out.println("Circulo");
        System.out.println("Área: ");
        return Raio = 3.14*Math.pow(Raio,2);
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro: ");
        return (Raio * 2) * 3.14;
    }
    
}
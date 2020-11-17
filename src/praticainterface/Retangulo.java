/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;

public class Retangulo extends Forma {

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    
    
    
    double Base;
    double Altura;

    @Override
    public double calcularArea() {
        System.out.println("Retangulo");
        System.out.println("Área: ");
        
        return Base*Altura;
    }

    @Override
    public double calcularPerimetro() {
        
        System.out.println("Perimetro: ");
        return (Base * 2) + Altura * 2;
                
    }
    
}
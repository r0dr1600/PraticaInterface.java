/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;

/**
 *
 * @author Rodrigo
 */
public class PraticaInterface {

   public static void main(String[] args) {
    
        Retangulo R1 = new Retangulo();
        Circulo C1 = new Circulo();
        Triangulo T1 = new Triangulo();
        Quadrado Q1 = new Quadrado();
        
        C1.setRaio(15);
        R1.setAltura(10);
        R1.setBase(20);
        T1.setLado(10);
        Q1.setLado(8);
        
        
        System.out.println(R1.calcularArea());
        System.out.println(R1.calcularPerimetro());
        
        System.out.println(C1.calcularArea());
        System.out.println(C1.calcularPerimetro());
        
        System.out.println(T1.calcularArea());
        System.out.println(T1.calcularPerimetro());
        
        System.out.println(Q1.calcularArea());
        System.out.println(Q1.calcularPerimetro());
  }
}
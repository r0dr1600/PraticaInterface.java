/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticainterface;
import java.util.ArrayList;
import java.util.List;


public class Casa implements AreaCalculavel{

     
    @Override
    public double calcularArea() {
        return 0;
    }
    
    Quadrado quad = new Quadrado();
    Triangulo tri = new Triangulo();
    Retangulo ret = new Retangulo();
    Circulo circ = new Circulo();
    
     public List<Forma> Comodos(Quadrado quad,Triangulo tri,Retangulo ret,Circulo circ){
     
     List<Forma> comodos = new ArrayList<Forma>();
     comodos.add(quad);
     comodos.add(tri);
     comodos.add(ret);
     comodos.add(circ);

      return comodos;

     }
    
}
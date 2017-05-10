/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expolimorfismo;

/**
 *
 * @author agarridogarcia
 */
public class CocheElectrico extends Coches{
    int bateria;

    public CocheElectrico() {
    }

    public CocheElectrico(int bateria) {
        this.bateria = bateria;
    }

    public CocheElectrico(int bateria, String matricula, String marca, int potencia, int portas) {
        super(matricula, marca, potencia, portas);
        this.bateria = bateria;
    }
    
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" + "bateria=" + bateria + '}';
    }
    
    
    public float calcularPrecio(){
         Icalculable ica= ()-> getBateria()-500;
        return ica.calcularPrezo();
      
    }
    

        
    
    
}

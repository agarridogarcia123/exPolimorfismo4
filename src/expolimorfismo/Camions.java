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
public class Camions extends Vehiculo {
    private boolean remolque;

    public Camions() {
    }

    public Camions(boolean remolque) {
        this.remolque = remolque;
    }

    public Camions(boolean remolque, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.remolque = remolque;
    }

  

    @Override
    public String toString() {
        return "Camions{" + super.toString() + "remolque=" + remolque + '}';
    }

    @Override
    public float calcularPrezo() {
    Icalculable ica=()-> remolque?super.getPotencia()*120+10000:super.getPotencia()*120;
        return ica.calcularPrezo();
    }
    
    
    
}

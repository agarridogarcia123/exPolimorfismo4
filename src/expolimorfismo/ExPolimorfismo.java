/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class ExPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColeccionVehiculo obx=new ColeccionVehiculo();
         
       
        int opcion;
        
         
         do{
             try{
                 
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Engadir coches \n2 Engadir camións \n3 Consultar precio \n4 Amosar \n5 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1: obx.engadirVehiculo(new Coches(JOptionPane.showInputDialog("Matricula?"),JOptionPane.showInputDialog("Marca?"),Integer.parseInt(JOptionPane.showInputDialog("Num Cabalos?:")), Integer.parseInt(JOptionPane.showInputDialog("Portas?"))));
                break;
            case 2:obx.engadirVehiculo(new Camions(Boolean.parseBoolean(JOptionPane.showInputDialog("Ten remolque?")),JOptionPane.showInputDialog("Matricula?"),JOptionPane.showInputDialog("Marca?"),Integer.parseInt(JOptionPane.showInputDialog("Num Cabalos?:"))));
                break;
            case 3:obx.verPrecio();
                break;
            case 4:obx.amosar();
                break;
            case 5:System.exit(0);
            
    }
    
}while(opcion<5);

    
}
}
   
    
    


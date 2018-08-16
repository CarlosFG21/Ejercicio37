/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio37video46;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio37Video46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null,"PROGRAMA CLASES ABSTRACTAS");
        
        Persona[] lasPersonas = new Persona[2];
        
        lasPersonas[0] = new empleado("LUIS CONDE ",50000,2009,02,25);
        
        lasPersonas[1] = new Alumno("ANA LOPEZ ","BIOLOGICAS");
        
        for(Persona p: lasPersonas){
           
            System.out.println(p.dameDescripcion());
        }
    }
    
}

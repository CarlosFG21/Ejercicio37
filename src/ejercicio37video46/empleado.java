
package ejercicio37video46;

import java.util.*;

abstract class Persona{
    
    public Persona(String nom){
        
        nombre = nom;
    }
    
    public abstract String dameDescripcion();
    
    private String nombre;
}


class empleado extends Persona{
    
    public empleado(String nom,double sue,int agno,int mes,int dia){
      
        super(nom);
        //nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
        
        ++IdSiguiente;
        Id=IdSiguiente;
  }
    
    /*public empleado(String nom){
        
        this(nom, 30000,2000,01,01);
        
    }*/

    //empleado() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
  /*public String dameNombre(){
      
      return nombre + " Id: " + Id;
  }*/  
  
  public String dameDescripcion(){
      return "ESTE EMEPLEADO TIENE UN Id= " + Id + " CON UN SUELDO= " + sueldo;
  }
  
 /* public double dameSueldo(){ //geter
      
      return sueldo;
  }*/
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  //private String nombre;
  private double sueldo;
  private Date altaContrato;
  private static int IdSiguiente;
  private int Id;
  
}

class Alumno extends Persona{
    
    public Alumno(String nom,String car){
        
        super(nom);
        
        carrera = car;
    }
    
    public String dameDescripcion(){
        
        return "ESTE ALUMNO ESTA ESTUDIANDO LA CARRERA DE " + carrera;
    }
    

    private String carrera; 
    
    
}

/*class Jefaturas extends empleado{
    
    public Jefaturas(String nom,double sue,int agno,int mes,int dia){
        
        super(nom,sue,agno,mes,dia);
    }
    
    public void  estableceIncentivo(double b){
        
        incentivo =b;
    }
    
    public double dameSueldo(){
        
        double sueldoJefe = super.dameSueldo();
        
        return sueldoJefe + incentivo;
    }
    private double incentivo;
    
    
}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaClase;

/**
 *
 * @author Mario
 */
public class Estadio {
    String nombre_est, tipo;
    Double capacidad;
 

    public String getNombre_est() {
        return nombre_est;
    }

    public void setNombre_est(String nombre_est) {
        this.nombre_est = nombre_est;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
  
   public void presentar_datos() {
      System.out.printf("Nombre: %s Tipo %s Capacidad %d\n", getNombre_est(), getTipo() ,getCapacidad());
   } 
    
    
   
   
    
}

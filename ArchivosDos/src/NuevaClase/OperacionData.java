/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaClase;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {
    ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){
        return informacion;
    }
    
    public double promedioC(){
         double sumC=0;
            for (int i = 0; i < obtenerInformacion().size(); i++) {
                sumC += obtenerInformacion().get(i).getCapacidad();
            }
            sumC/=obtenerInformacion().size();
            return sumC;
    }
    
}

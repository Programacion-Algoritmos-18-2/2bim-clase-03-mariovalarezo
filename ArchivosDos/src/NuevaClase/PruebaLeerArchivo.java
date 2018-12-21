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
public class PruebaLeerArchivo {

    public static void main(String args[]) {
        LeerArchivoTexto11 aplicacion = new LeerArchivoTexto11();
        OperacionData o = new OperacionData();

        aplicacion.abrirArchivo();
        o.agregarInformacion(aplicacion.leerRegistros());
        System.out.println("El promedio es: " + o.promedioC());
        //aplicacion.leerRegistros2(); // datos.txt
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto


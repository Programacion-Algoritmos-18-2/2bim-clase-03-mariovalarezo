package NuevaClase;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto11 {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estadios.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    // lee registro del archivo
    public ArrayList<Estadio> leerRegistros() {
        ArrayList<Estadio> lista = new ArrayList<>();
        //OperacionData o = new OperacionData();
        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                Estadio e = new Estadio();
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                //System.out.println(linea_partes);
                e.setNombre_est(linea_partes.get(0));
                e.setTipo(linea_partes.get(1));
                e.setCapacidad(Double.parseDouble(linea_partes.get(2)));
                lista.add(e);
            } // fin de while                     
           //o.agregarInformacion(lista);
           //o.promedioC();

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        
        return lista;
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

package cuentas;

import java.io.*;
import java.util.ArrayList;

public class Almacenamiento {
//  Atributos de clase

    private FileOutputStream salida;
    private ObjectOutputStream saliendo;
    private FileInputStream entrada;
    private ObjectInputStream entrando;
    private boolean exito;
    private ArrayList<Cuenta> cuentas;

//  Métodos de clase


//  Metodo para sobreescribir el archivo con el arreglo modificado
    boolean modArchivoCuenta (ArrayList arrayCuentas){
        exito = true;
        try {
            salida = new FileOutputStream("Cuentas/cuentas.bin");
            saliendo = new ObjectOutputStream(salida);
            saliendo.writeObject(arrayCuentas);

        } catch (IOException e){
            exito = false;
        }finally {
            try {
                saliendo.close();
            } catch (IOException excepcionSalida){
                exito = false;
            }
        }

        return exito;
    }
//  Método para extraer el arreglo de cuentas del archivo
    ArrayList<Cuenta> busquedaArchivoCuenta(){
        try {
            entrada = new FileInputStream("Cuentas/cuentas.bin");
            entrando = new ObjectInputStream(entrada);
            cuentas = (ArrayList<Cuenta>) entrando.readObject();
        } catch (IOException e){
            cuentas = null;
        } catch (ClassNotFoundException e){
            cuentas = null;
        } finally {
            try {
                entrando.close();
            } catch (IOException excepcionEntrada){
                cuentas = null;
            }
        }
        return cuentas;
    }

}

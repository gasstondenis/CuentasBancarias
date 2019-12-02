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

    boolean modArchivoCuenta (ArrayList arrayCuentas){
        exito = true;
        try {
            salida = new FileOutputStream("/home/gaston/Tecnicatura Universitaria en Programacion/2DO CUATRIMESTRE/Lab de Computacion 2/TPI/Cuentas/cuentas.bin");
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

    ArrayList<Cuenta> busquedaArchivoCuenta(){
        try {
            entrada = new FileInputStream("/home/gaston/Tecnicatura Universitaria en Programacion/2DO CUATRIMESTRE/Lab de Computacion 2/TPI/Cuentas/cuentas.bin");
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

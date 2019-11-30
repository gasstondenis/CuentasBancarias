package cuentas;

public class AdministrarCuenta {
    private Almacenamiento almacenamiento = new Almacenamiento();
    private AltaBaja altaBaja = new AltaBaja();
    ListaCuentas listaCuentas = new ListaCuentas();



    public boolean darDeAlta(Cuenta cuenta) {
        boolean creado;
        listaCuentas.arrayCuentas.add(cuenta);
        creado = altaBaja.crearCuenta(listaCuentas.arrayCuentas);
        return creado;
    }

    public boolean darDeBaja(int nroCuenta, String password){
        boolean exito = false;
        Cuenta objeto;
        int indice;
        objeto = buscarCuenta(nroCuenta);
        if (objeto != null) {
            if (objeto.getPassword().equals(password)) {
                listaCuentas.arrayCuentas.remove(listaCuentas.i);
                exito = altaBaja.borrarCuenta(listaCuentas.arrayCuentas);
            }
        }
        return exito;
    }


    Cuenta buscarCuenta(int nroCuenta){
        Cuenta cuenta = null;
        listaCuentas.i = 0;
        if (listaCuentas.arrayCuentas != null) {
            for (Cuenta arreglo: listaCuentas.arrayCuentas) {
                if ((listaCuentas.arrayCuentas.get(listaCuentas.i)).getNroCuenta() == nroCuenta){
                    cuenta = listaCuentas.arrayCuentas.get(listaCuentas.i);
                    break;
                }
                listaCuentas.i++;
            }
        }
        return cuenta;
    }
    public void setArreglo (){
        try {
            listaCuentas.arrayCuentas = almacenamiento.busquedaArchivoCuenta();
        } catch (NullPointerException e){
            almacenamiento.modArchivoCuenta(listaCuentas.arrayCuentas);
        }
    }

    boolean extraerSaldo(Cuenta cuenta, double monto){
        boolean retorno = true;
        return cuenta.descontarSaldo(monto);

    }
    void acreditarSaldo(Cuenta cuenta, double monto){
        cuenta.incrementarSaldo(monto);
    }

    int contadorCuentas(){
        return altaBaja.getContadorCuentas();
    }


}

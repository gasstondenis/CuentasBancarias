package cuentas;

public class AdministrarCuenta {
    private Almacenamiento almacenamiento = new Almacenamiento();
    private AltaBaja altaBaja = new AltaBaja();
    private ListaCuentas listaCuentas = new ListaCuentas();



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

    boolean extraerSaldo(int nroCuenta, double monto){
        boolean retorno = false;
        Cuenta cuenta = buscarCuenta(nroCuenta);
        retorno = cuenta.descontarSaldo(monto);
        if (retorno) {
            listaCuentas.arrayCuentas.set(listaCuentas.i, cuenta);
        }
        return retorno;
    }
    void acreditarSaldo(int nroCuenta, double monto){
        Cuenta cuenta;
        cuenta = buscarCuenta(nroCuenta);
        cuenta.incrementarSaldo(monto);
        listaCuentas.arrayCuentas.set(listaCuentas.i, cuenta);
    }
    void actualizarArchivo(){
        almacenamiento.modArchivoCuenta(listaCuentas.arrayCuentas);
    }
    void cambiarContraseña(int nroCuenta, String password){
        Cuenta cuenta = buscarCuenta(nroCuenta);
        cuenta.setPassword(password);
        listaCuentas.arrayCuentas.set(listaCuentas.i, cuenta);
    }
}

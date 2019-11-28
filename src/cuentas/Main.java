package cuentas;

//      IMPORTACIONES NECESARIAS
import gui.Ventana;
import java.util.Scanner;


public class Main {
//Declaración de constantes para opciones
    private static AdministrarCuenta administrarCuenta = new AdministrarCuenta();

    private static void iniciarGUI(){
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
//      OBJETOS VARIABLES AUXILIARES PARA DIFERENTES INSTANCIAS DEL CÓDIGO

        Scanner reader = new Scanner(System.in);
        Scanner readerString = new Scanner(System.in);


        Cuenta cuentaBuscada, cuentaCreada, cambioPassword; //se necesita el usuario, el numero de cuenta y el password
        int nroCuenta, opcion;
        double monto;
        String usuario, password;

//      CADENA CON OPCIONES POSIBLES. (Menú y sub-Menu)
        String opciones = "\t.:Menú:.\n1.\tCrear cuenta\n2.\tDar de baja una cuenta\n3.\tAdministrar cuenta\n4.\tSalir";
        String opcionesSubMenu = "\t .:Administrando cuenta:.\n1.\tConsultar saldo\n2.\tAcreditar saldo\n3.\tExtraer saldo\n4.\tMostrar datos de la cuenta\n5.\tAtrás";

        do {
            administrarCuenta.setArreglo();
//      LECTURA DE LA OPCIÓN PARA EL PRIMER MENU
            System.out.println(opciones+"\n\nSu opción: ");

            opcion = reader.nextInt();

                switch (opcion) {

                    case 1:
//      DAR DE ALTA UNA CUENTA
                        System.out.print("Ingrese su nombre y apellido: ");
                        usuario = readerString.nextLine();

                        System.out.print("Ingrese un numero de cuenta: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese una contraseña: ");
                        password = readerString.nextLine();

                        cuentaCreada = new Cuenta(usuario, nroCuenta, password);

//              VALIDACIÓNES DE OPERACIÓN
                        if (administrarCuenta.darDeAlta(cuentaCreada)) System.out.println("Operación exitosa.");
                        else System.err.println("Ha ocurrido un error inesperado.");
                        break;

                    case 2:
//      DAR DE BAJA UNA CUENTA
                        System.out.print("Ingrese el numero de la cuenta que desea dar de baja: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese la contraseña de la cuenta asociada al numero ingresado: ");
                        password = readerString.nextLine();
//              VALIDACIONES DE OPERACIÓN
                        if (administrarCuenta.darDeBaja(nroCuenta, password)) System.out.println("Operación exitosa.");
                        else System.err.println("Ha ocurrido un error, quizá la cuenta que desea eliminar no exite.");
                        break;

                    case 3:
//      ADMINISTRAR CUENTA

                        System.out.print("ingrese el número de la cuenta que desea administrar: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese la contraseña correspondiente a la cuenta: ");
                        password = readerString.nextLine();

//              VALIDACIONES DE OPERACIÓN
                        cuentaBuscada = administrarCuenta.buscarCuenta(nroCuenta);
                        if (cuentaBuscada != null){
                            if (cuentaBuscada.getPassword().equals(password)){

//      BUCLE PARA EL SUBMENU
                                do {

                                    System.out.println(opcionesSubMenu+"\n\nSu opción: ");
                                    opcion = reader.nextInt();
                                    switch (opcion) {
//      CONSULTA DE SALDO
                                        case 1:

                                            System.out.println("Su saldo es: $" + cuentaBuscada.getSaldo());
                                            break;

                                        case 2:
//      ACREDITACION DE SALDO
                                            System.out.print("Ingrese el monto que desea acreditar a su cuenta: $");
                                            monto = reader.nextDouble();
                                            administrarCuenta.acreditarSaldo(cuentaBuscada, monto);
                                            System.out.println("Operacion exitosa.");
                                            break;

                                        case 3:
//      EXTRACCION DE SALDO
                                            System.out.print("Ingrese el monto que desea extraer: $");
                                            monto = reader.nextDouble();
//              VALIDACIONES DE OPERACION
                                        if (!(administrarCuenta.extraerSaldo(cuentaBuscada, monto)))
                                                System.err.println("Su saldo es insuficiente.");

                                        else System.out.println("Operación exitosa.");

                                        break;

                                        case 4:
//      MOSTRAR DATOS DE LA CUENTA (NOMBRE, NUMERO DE CUENTA Y SALDO)
                                            System.out.println(cuentaBuscada.mostrarDatos());
                                            break;
//      SALIR DEL SUB MENU (IR HACIA ATRAS)
                                        case 5:
                                            System.out.println("...");
                                            break;

                                        default:
                                            System.err.println("Opción no valida.");
                                            break;

                                    }

                                } while (opcion != 5);

//      ELSE AL SEGUNDO IF DE LA OPCION ADMINISTRAR CUENTA
                            } else System.err.println("Validación de cuenta erroneo.");

//      ELSE AL PRIMER IF DE LA OPCION ADMINISTRAR CUENTA
                        } else System.err.println("La cuenta a la que desea acceder no existe.");

                        break;
                    case 4:
                        System.out.println("...");
                        break;
//      OPCION PREDETERMINADA EN CASO DE QUE EL NUMERO INGRESADO NO ESTE CONTEMPLADO
                    default:
                        System.err.println("Opción no valida.");
                        break;
                    }

        } while(opcion != 4);

//      FIN DEL PROGRAMA
    }

    /*
    CAMBIO DE CONTRASEÑA
    System.out.print("Por favor ingrese su contraseña actual: ");
                                            password = readerString.nextLine();

//              VALIDACIONES DE OPERACION
                                            if (!cuentaBuscada.getPassword().equals(password)) {
                                                System.err.println("Contraseña erronea. Anulando operación por motivos de seguridad.");
                                                return;
                                            }

                                            System.out.print("Ingrese su nueva contraseña: ");
                                            password = readerString.nextLine();

                                            cuentaBuscada.setPassword(password);
                                            System.out.println("Cambio de contraseña exitoso.");
                                            break;

     */

}

package cuentas;

//      IMPORTACIONES NECESARIAS

import java.util.Scanner;

public class Main {

    private static AdministrarCuenta administrarCuenta = new AdministrarCuenta();
//    Declaración de constantes para opciones del MENU PRINCIPAL

    private static final int CREAR_CUENTA = 1;
    private static final int DAR_DE_BAJA = 2;
    private static final int ADMINISTRAR_CUENTA = 3;
    private static final int SALIR = 4;

//  Declaracion de constantes para opciones del MENU SECUNDARIO(ADMINISTRAR CUENTA)

    private static final  int CONSULTAR_SALDO = 1;
    private static final int ACREDITAR_SALDO = 2;
    private static final int EXTRAER_SALDO = 3;
    private static final int MODIF_CONTRASENIA = 4;
    private static final int MOSTRAR_DATOS = 5;
    private static final int VOLVER_ATRAS = 6;

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
        String opcionesSubMenu = "\t .:Administrando cuenta:.\n1.\tConsultar saldo\n2.\tAcreditar saldo\n3.\tExtraer saldo\n4.\tModificar contraseña de la cuenta\n5.\tMostrar datos de la cuenta\n6.\tAtrás";
        administrarCuenta.setArreglo();

//      BUCLE DEL PRIMER MENÚ
        do {
//      LECTURA DE LA OPCIÓN PARA EL PRIMER MENU
            System.out.println(opciones+"\n\nSu opción: ");

            opcion = reader.nextInt();

                switch (opcion) {

                    case CREAR_CUENTA:
//      DAR DE ALTA UNA CUENTA
                        System.out.print("Ingrese su nombre y apellido: ");
                        usuario = readerString.nextLine();

                        System.out.print("Ingrese un numero de cuenta: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese una contraseña: ");
                        password = readerString.nextLine();

                        System.out.print("Ingrese el saldo que tendrá su cuenta: $");
                        monto = reader.nextDouble();

                        cuentaCreada = new Cuenta(usuario, nroCuenta, password, monto);

//              VALIDACIÓNES DE OPERACIÓN
                        if (administrarCuenta.buscarCuenta(cuentaCreada.getNroCuenta()) != null){
                            System.err.println(String.format("Ya existe una cuenta con el numero '%d'. Por favor, elija uno diferente.\n", cuentaCreada.getNroCuenta()));
                            break;
                        }
                        if (administrarCuenta.darDeAlta(cuentaCreada)) System.out.println("\nOperación exitosa.\n");
                        else System.err.println("\nHa ocurrido un error inesperado.\n");
                        break;

                    case DAR_DE_BAJA:
//      DAR DE BAJA UNA CUENTA
                        System.out.print("Ingrese el numero de la cuenta que desea dar de baja: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese la contraseña de la cuenta asociada al numero ingresado: ");
                        password = readerString.nextLine();
//              VALIDACIONES DE OPERACIÓN
                        if (administrarCuenta.darDeBaja(nroCuenta, password)) System.out.println(package cuentas;

//      IMPORTACIONES NECESARIAS

import java.util.Scanner;

public class Main {

    private static AdministrarCuenta administrarCuenta = new AdministrarCuenta();
//    Declaración de constantes para opciones del MENU PRINCIPAL

    private static final int CREAR_CUENTA = 1;
    private static final int DAR_DE_BAJA = 2;
    private static final int ADMINISTRAR_CUENTA = 3;
    private static final int SALIR = 4;

//  Declaracion de constantes para opciones del MENU SECUNDARIO(ADMINISTRAR CUENTA)

    private static final  int CONSULTAR_SALDO = 1;
    private static final int ACREDITAR_SALDO = 2;
    private static final int EXTRAER_SALDO = 3;
    private static final int MODIF_CONTRASENIA = 4;
    private static final int MOSTRAR_DATOS = 5;
    private static final int VOLVER_ATRAS = 6;

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
        String opcionesSubMenu = "\t .:Administrando cuenta:.\n1.\tConsultar saldo\n2.\tAcreditar saldo\n3.\tExtraer saldo\n4.\tModificar contraseña de la cuenta\n5.\tMostrar datos de la cuenta\n6.\tAtrás";
        administrarCuenta.setArreglo();

//      BUCLE DEL PRIMER MENÚ
        do {
//      LECTURA DE LA OPCIÓN PARA EL PRIMER MENU
            System.out.println(opciones+"\n\nSu opción: ");

            opcion = reader.nextInt();

                switch (opcion) {

                    case CREAR_CUENTA:
//      DAR DE ALTA UNA CUENTA
                        System.out.print("Ingrese su nombre y apellido: ");
                        usuario = readerString.nextLine();

                        System.out.print("Ingrese un numero de cuenta: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese una contraseña: ");
                        password = readerString.nextLine();

                        System.out.print("Ingrese el saldo que tendrá su cuenta: $");
                        monto = reader.nextDouble();

                        cuentaCreada = new Cuenta(usuario, nroCuenta, password, monto);

//              VALIDACIÓNES DE OPERACIÓN
                        if (administrarCuenta.buscarCuenta(cuentaCreada.getNroCuenta()) != null){
                            System.err.println(String.format("Ya existe una cuenta con el numero '%d'. Por favor, elija uno diferente.\n", cuentaCreada.getNroCuenta()));
                            break;
                        }
                        if (administrarCuenta.darDeAlta(cuentaCreada)) System.out.println("\nOperación exitosa.\n");
                        else System.err.println("\nHa ocurrido un error inesperado.\n");
                        break;

                    case DAR_DE_BAJA:
//      DAR DE BAJA UNA CUENTA
                        System.out.print("Ingrese el numero de la cuenta que desea dar de baja: ");
                        nroCuenta = reader.nextInt();

                        System.out.print("Ingrese la contraseña de la cuenta asociada al numero ingresado: ");
                        password = readerString.nextLine();
//              VALIDACIONES DE OPERACIÓN
                        if (administrarCuenta.darDeBaja(nroCuenta, password)) System.out.println("Operación exitosa.\n");
                        else System.err.println("No se ha podido dar de baja la cuenta. Quizá la cuenta que desea eliminar no existe o le corresponde un numero de cuenta diferente.\n");
                        break;

                    case ADMINISTRAR_CUENTA:
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
                                    administrarCuenta.actualizarArchivo();
                                    System.out.println("\n"+opcionesSubMenu+"\n\nSu opción: ");
                                    opcion = reader.nextInt();
                                    switch (opcion) {
//      CONSULTA DE SALDO
                                        case CONSULTAR_SALDO:

                                            System.out.println("Su saldo es: $" + cuentaBuscada.getSaldo());
                                            break;

                                        case ACREDITAR_SALDO:
//      ACREDITACION DE SALDO
                                            System.out.print("Ingrese el monto que desea acreditar a su cuenta: $");
                                            monto = reader.nextDouble();
                                            administrarCuenta.acreditarSaldo(cuentaBuscada.getNroCuenta(), monto);
                                            System.out.println("Operacion exitosa.");
                                            break;

                                        case EXTRAER_SALDO:
//      EXTRACCION DE SALDO
                                            System.out.print("Ingrese el monto que desea extraer: $");
                                            monto = reader.nextDouble();
//              VALIDACIONES DE OPERACION
                                        if (!(administrarCuenta.extraerSaldo(cuentaBuscada.getNroCuenta(), monto)))
                                                System.err.println("Su saldo es insuficiente.\n");

                                        else System.out.println("Operación exitosa.\n");

                                        break;
//      CAMBIO DE CONTRASEÑA
                                        case MODIF_CONTRASENIA:
                                            System.out.print("Por favor ingrese su contraseña actual: ");
                                            password = readerString.nextLine();

//              VALIDACIONES DE OPERACION
                                            if (!cuentaBuscada.getPassword().equals(password)) {
                                                System.err.println("Contraseña erronea. Anulando operación por motivos de seguridad.");
                                                return;
                                            }

                                            System.out.print("Ingrese su nueva contraseña: ");
                                            password = readerString.nextLine();

                                            administrarCuenta.cambiarContraseña(cuentaBuscada.getNroCuenta(), password);
                                            System.out.println("Cambio de contraseña exitoso.");
                                            break;

//      MOSTRAR DATOS DE LA CUENTA (NOMBRE, NUMERO DE CUENTA Y SALDO)
                                        case MOSTRAR_DATOS:
                                            System.out.println(cuentaBuscada.mostrarDatos()+"\n");
                                            break;
//      SALIR DEL SUB MENU (IR HACIA ATRAS)
                                        case VOLVER_ATRAS:
                                            System.out.println("...");
                                            break;

                                        default:
                                            System.err.println("Opción no valida.\n");
                                            break;

                                    }

                                } while (opcion != VOLVER_ATRAS);

//      ELSE AL SEGUNDO IF DE LA OPCION ADMINISTRAR CUENTA
                            } else System.err.println("Validación de cuenta erroneo.\n");

//      ELSE AL PRIMER IF DE LA OPCION ADMINISTRAR CUENTA
                        } else System.err.println("La cuenta a la que desea acceder no existe.\n");

                        break;
                    case SALIR:
                        System.out.println("...");
                        break;
//      OPCION PREDETERMINADA EN CASO DE QUE EL NUMERO INGRESADO NO ESTE CONTEMPLADO
                    default:
                        System.err.println("Opción no valida.\n");
                        break;
                    }

        } while(opcion != SALIR);



//      FIN DEL PROGRAMA
    }"Operación exitosa.\n");
                        else System.err.println("No se ha podido dar de baja la cuenta. Quizá la cuenta que desea eliminar no existe o le corresponde un numero de cuenta diferente.\n");
                        break;

                    case ADMINISTRAR_CUENTA:
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
                                    administrarCuenta.actualizarArchivo();
                                    System.out.println("\n"+opcionesSubMenu+"\n\nSu opción: ");
                                    opcion = reader.nextInt();
                                    switch (opcion) {
//      CONSULTA DE SALDO
                                        case CONSULTAR_SALDO:

                                            System.out.println("Su saldo es: $" + cuentaBuscada.getSaldo());
                                            break;

                                        case ACREDITAR_SALDO:
//      ACREDITACION DE SALDO
                                            System.out.print("Ingrese el monto que desea acreditar a su cuenta: $");
                                            monto = reader.nextDouble();
                                            administrarCuenta.acreditarSaldo(cuentaBuscada.getNroCuenta(), monto);
                                            System.out.println("Operacion exitosa.");
                                            break;

                                        case EXTRAER_SALDO:
//      EXTRACCION DE SALDO
                                            System.out.print("Ingrese el monto que desea extraer: $");
                                            monto = reader.nextDouble();
//              VALIDACIONES DE OPERACION
                                        if (!(administrarCuenta.extraerSaldo(cuentaBuscada.getNroCuenta(), monto)))
                                                System.err.println("Su saldo es insuficiente.\n");

                                        else System.out.println("Operación exitosa.\n");

                                        break;
//      CAMBIO DE CONTRASEÑA
                                        case MODIF_CONTRASENIA:
                                            System.out.print("Por favor ingrese su contraseña actual: ");
                                            password = readerString.nextLine();

//              VALIDACIONES DE OPERACION
                                            if (!cuentaBuscada.getPassword().equals(password)) {
                                                System.err.println("Contraseña erronea. Anulando operación por motivos de seguridad.");
                                                return;
                                            }

                                            System.out.print("Ingrese su nueva contraseña: ");
                                            password = readerString.nextLine();

                                            administrarCuenta.cambiarContraseña(cuentaBuscada.getNroCuenta(), password);
                                            System.out.println("Cambio de contraseña exitoso.");
                                            break;

//      MOSTRAR DATOS DE LA CUENTA (NOMBRE, NUMERO DE CUENTA Y SALDO)
                                        case MOSTRAR_DATOS:
                                            System.out.println(cuentaBuscada.mostrarDatos()+"\n");
                                            break;
//      SALIR DEL SUB MENU (IR HACIA ATRAS)
                                        case VOLVER_ATRAS:
                                            System.out.println("...");
                                            break;

                                        default:
                                            System.err.println("Opción no valida.\n");
                                            break;

                                    }

                                } while (opcion != VOLVER_ATRAS);

//      ELSE AL SEGUNDO IF DE LA OPCION ADMINISTRAR CUENTA
                            } else System.err.println("Validación de cuenta erroneo.\n");

//      ELSE AL PRIMER IF DE LA OPCION ADMINISTRAR CUENTA
                        } else System.err.println("La cuenta a la que desea acceder no existe.\n");

                        break;
                    case SALIR:
                        System.out.println("...");
                        break;
//      OPCION PREDETERMINADA EN CASO DE QUE EL NUMERO INGRESADO NO ESTE CONTEMPLADO
                    default:
                        System.err.println("Opción no valida.\n");
                        break;
                    }

        } while(opcion != SALIR);



//      FIN DEL PROGRAMA
    }

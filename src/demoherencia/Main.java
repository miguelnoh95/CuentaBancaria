package demoherencia;

import java.util.Scanner;

/**
 *
 * @author Edeco
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que accion desea realizar");
        System.out.println("1 = Cuanta Bancaria");
        System.out.println("2 = Cuenta de Ahorro");
        System.out.println("3 = Cuenta de Cheques");
        int cuenta = entrada.nextInt();
        
        if (cuenta == 1){          
            System.out.println("Proporcione el número de la cuenta:");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente: ");
            String nombreDelCliente = entrada.next();
            System.out.println("Proporcione los apellidos del cliente:");
            String apellidosDelCliente = entrada.next();
            Cliente cliente = new Cliente(nombreDelCliente, apellidosDelCliente);
        
            CuentaBancaria cuentaBancaria = new CuentaBancaria (numeroDeCuenta, cliente);
            int contador = 0;
           
            while (contador == 0){
                System.out.println("¿Que acción desea realizar?: ");
                System.out.println("1 = Introducir datos personales.");
                System.out.println("2 = Proporcionar los datos del cliente.");
                System.out.println("3 = Depositar.");
                System.out.println("4 = Retirar.");
                System.out.println("5 = Finalizar.");
                int accion = entrada.nextInt();
                
                if (accion == 1){
                    String fechaDeNacimientoDelUsuario;
                    System.out.println("Porporcione la fecha de nacimiento.");
                    fechaDeNacimientoDelUsuario = entrada.nextLine();
                    System.out.println("Porporcione su direccion: ");
                    String direccionDelUsuario = entrada.nextLine();
                    System.out.println("Porporcione su cupacion: ");
                    String ocupacionDelUsuario = entrada.nextLine();                
                    System.out.println("Proporcione su telefono: ");
                    String TelefonoDelUsuario = entrada.nextLine();                
                    System.out.println("Proporcione su correo electronico: ");
                    String correoElectronicoDelUsuario = entrada.nextLine();
                    cliente.setFechaDeNacimientoDelUsuario(fechaDeNacimientoDelUsuario);
                    cliente.setDireccionDelUsuario(direccionDelUsuario);
                    cliente.setOcupacionDelUsuario(ocupacionDelUsuario);
                    cliente.setTelefonoDelUsuario(TelefonoDelUsuario);
                    cliente.setCorreoElectronicoDelUsuario(correoElectronicoDelUsuario);   
                }
                if (accion == 2){
                    System.out.println ("El número de cuenta: " + cuentaBancaria.getNumeroDeCuenta());
                    System.out.println ("El nombre del usuario: " + cliente.getNombreDelUsuario());
		    System.out.println ("El apellido del usuario: " + cliente.getApellidosDelUsuario());
                    System.out.println ("Fecha de nacimiento del usuario: " );
		    System.out.println (cliente.getFechaDeNacimientoDelUsuario());
                    System.out.println ("Domicilio del usuario: ");
 		    System.out.println ( cliente.getDireccionDelUsuario());
                    System.out.println("Ocupación del usuario: ");
		    System.out.println (cliente.getOcupacionDelUsuario());
                    System.out.println("telefóno del usuario: ");
		    System.out.println (cliente.getTelefonoDelUsuario());
                    System.out.println("Correo electronico del usuario: ");
 		    System.out.println (cliente.getCorreoElectronicoDelUsuario());
                }
                int accionARealizar = 0;
                
                if (accionARealizar == 3){
                    System.out.println("¿Cuánto quiere depositar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaBancaria.depositar(cantidad);
                }
                if (accion == 4){
                    System.out.println("¿Cuánto quiere retirar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaBancaria.retirar(cantidad);
                }
                else {
                    System.out.println("Finalizar");
                    contador = contador + 1;
                }
                double saldo = cuentaBancaria.getSaldo();
                System.out.println(saldo);
            }
        }
        else {
            System.out.println("Acción no encontrada.");
        }
        
        if (cuenta == 2){
            int numeroDeCuenta;
            String cliente;
  
            System.out.println("Ingrese el número de cuenta del Usuario: ");
            numeroDeCuenta = entrada.nextInt();
            System.out.println("Ingrese el nombre del Usuario: ");
            cliente = entrada.next();
            CuentaDeAhorro nuevaCuenta = new CuentaDeAhorro(numeroDeCuenta, cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.retirar(500);
        }
        
        if (cuenta == 3){
            int numeroDeCuenta;
            String cliente;
            int contador;
            int accionARealizar;
            System.out.println("Proporcione el número de la cuenta: ");
            numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del usuario: ");
            cliente = entrada.next();
            CuentaDeCheques CuentaDeCheques = new CuentaDeCheques(numeroDeCuenta, cliente);
            contador = 0;
            
            while (contador == 0){
                System.out.println("¿Qué acción quiere realizar?: ");
                System.out.println("1 = Depositar");
                System.out.println("2 = Retirar");
                System.out.println("3 = Finalizar");
                accionARealizar = entrada.nextInt();
                int accion = 0;
                
                if (accion == 1){
                    System.out.println("Deposito bancario...");
                    System.out.println("¿Cuánto quiere depositar?: ");
                    double cantidad = entrada.nextDouble();
                    CuentaDeCheques.Depositar(cantidad);
                }
                else if (accion == 2){
                    System.out.println("Retiro de efectivo...");
                    System.out.println("¿Cuánto quiere retirar?: ");
                    double cantidad = entrada.nextDouble();
                    CuentaDeCheques.Retirar(cantidad);
                }
                else if (accion == 3){
                    System.out.println("Finalizar");
                    contador = contador + 1;
                }
                else {
                    System.out.println("No se realizar la operarcion.");
                }
                double saldo = CuentaDeCheques.getSaldo();
                System.out.println(saldo);
            }
        }
    }
        
        
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Edeco
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private String Cliente;
    private double saldo;
   
    public CuentaBancaria  (int numeroDeCuenta, String Cliente){
        this.numeroDeCuenta = numeroDeCuenta;
        this.Cliente = Cliente;
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
    return saldo;
    }
    private void numeroDeCuenta (int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    private void cliente (String Cliente) {
        this.Cliente = Cliente;
     }
    public boolean depositar (String cantidad) {
        boolean seRealizoDeposito;    
        if (cantidad > 0.0){
            saldo = saldo + cantidad;
            seRealizoDeposito = true;
        }
        else{
            seRealizoDeposito = false;
        }
        return seRealizoDeposito;
    }
    public boolean retirar (double cantidad){
        boolean seRealizoRetiro;
        if (cantidad < getSaldo()){
            saldo = saldo - cantidad;
            seRealizoRetiro = true;
        }
        else {
            seRealizoRetiro = false;
        }
        return seRealizoRetiro;
    }

    void depositar(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

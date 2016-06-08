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
public class CuentaDeAhorro {
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
    public CuentaDeAhorro (int numeroDeCuenta, String Cliente){
        super(numeroDeCuenta, Cliente);
        this.tasaDeInteres = .25;
        this.comisionPorSaldo = 50;
    }
    public boolean seRealizoDeposito (double cantidad){
        boolean siDepositar = false;
        if (cantidad < super.getSaldo()){
            siDepositar = true;
        }
        return siDepositar;
    }
    public double getSaldo(){
        return super.getSaldo();
    }
    public boolean seRealizoRetiro(double cantidad){
        boolean siRetirar = false;
        if (cantidad < super.getSaldo()){
            siRetirar = true;
        }
        return siRetirar;
    }
    public double comisionPorSaldo(){
        double comisionPorSaldo = 0;
        if (super.getSaldo() < 1000){
            comisionPorSaldo = 50;
        }
        else {
            comisionPorSaldo = 0;
        }
        return comisionPorSaldo;
    }
    public double tasaDeInteres(){
        double interes = 0;
        interes = (super.getSaldo()*this.tasaDeInteres)/100;
        return interes;
    }
}

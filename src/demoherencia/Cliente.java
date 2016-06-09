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
public class Cliente {
    private String nombreDelUsuario;
    private String apellidoDelUsuario;
    private String fechaDeNacimientoDelUsuario;
    private String direccionDelUsuario;
    private String ocupacionDelUsuario;
    private String telefonoDelUsuario;
    private String correoElectronicoDelUsuario;
    
    Cliente(String nombreDelUsuario,String apellidoDelUsuario){
        this.nombreDelUsuario = nombreDelUsuario;
        this.apellidoDelUsuario = apellidoDelUsuario;
        this.fechaDeNacimientoDelUsuario = "00/00/00";
        this.direccionDelUsuario = "0";
        this.ocupacionDelUsuario = "0";
        this.telefonoDelUsuario = "(000)000-0000";
        this.correoElectronicoDelUsuario = "0";
                        
    }
    
    public String getnombreDelUsuario(){
        return nombreDelUsuario;               
    }
    public String getapellidoDelUsuario(){
        return apellidoDelUsuario;        
    }
    public String getfechaDeNacimientoDelUsuario(){
        return fechaDeNacimientoDelUsuario;        
    }
    public String getdireccionDelUsuario(){
        return direccionDelUsuario;        
    }
    public String getocupacionDelUsuario(){
        return ocupacionDelUsuario;        
    }
    public String telefonoDelUsuario(){
        return telefonoDelUsuario;        
    }
    public String getcorreoElectronicoDelUsuario(){
        return correoElectronicoDelUsuario;        
    }
            
    public void setNombre(String nombreDelUsuario){
        this.nombreDelUsuario = nombreDelUsuario;        
    }
    public void setApellido(String apellidoDelUsuario){
        this.apellidoDelUsuario = apellidoDelUsuario;        
    }
    public void setFechaDeNacimiento(String fechaDENacimientoDelUsuario){
        this.fechaDeNacimientoDelUsuario = fechaDeNacimientoDelUsuario;        
    }
    public void setDireccion(String direccionDelUsuario){
        this.direccionDelUsuario = direccionDelUsuario;        
    }
    public void setOcupacion(String ocupacionDelUsuario){
        this.ocupacionDelUsuario = ocupacionDelUsuario;        
    }
    public void setTelefono(String telefonoDelUsuario){
        this.telefonoDelUsuario = telefonoDelUsuario;        
    }
    public void setCorreoElectronico(String CorreoElectronicoDelUsuario){
        this.correoElectronicoDelUsuario = correoElectronicoDelUsuario;       
    }   
    
}

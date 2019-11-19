package POJOS;
// Generated Nov 2, 2019, 10:49:09 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombre;
     private String apellido;
     private Date fechaNacimiento;
     private String correo;
     private String telefono;
     private Set tarjetases = new HashSet(0);
     private Set reservacions = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String apellido, Date fechaNacimiento, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }
    public Usuario(String nombre, String apellido, Date fechaNacimiento, String correo, String telefono, Set tarjetases, Set reservacions) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.correo = correo;
       this.telefono = telefono;
       this.tarjetases = tarjetases;
       this.reservacions = reservacions;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getTarjetases() {
        return this.tarjetases;
    }
    
    public void setTarjetases(Set tarjetases) {
        this.tarjetases = tarjetases;
    }
    public Set getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set reservacions) {
        this.reservacions = reservacions;
    }




}



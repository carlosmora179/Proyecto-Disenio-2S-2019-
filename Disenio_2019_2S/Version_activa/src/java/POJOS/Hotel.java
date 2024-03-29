package POJOS;
// Generated 11/11/2019 09:43:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Hotel generated by hbm2java
 */
public class Hotel  implements java.io.Serializable {


     private Integer idHotel;
     private Direccion direccion;
     private String nombre;
     private int recomendado;
     private int total;
     private Set habitacions = new HashSet(0);
     private Set imagens = new HashSet(0);

    public Hotel() {
    }

	
    public Hotel(Direccion direccion, String nombre, int recomendado, int total) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.recomendado = recomendado;
        this.total = total;
    }
    public Hotel(Direccion direccion, String nombre, int recomendado, int total, Set habitacions, Set imagens) {
       this.direccion = direccion;
       this.nombre = nombre;
       this.recomendado = recomendado;
       this.total = total;
       this.habitacions = habitacions;
       this.imagens = imagens;
    }
   
    public Integer getIdHotel() {
        return this.idHotel;
    }
    
    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getRecomendado() {
        return this.recomendado;
    }
    
    public void setRecomendado(int recomendado) {
        this.recomendado = recomendado;
    }
    public int getTotal() {
        return this.total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    public Set getHabitacions() {
        return this.habitacions;
    }
    
    public void setHabitacions(Set habitacions) {
        this.habitacions = habitacions;
    }
    public Set getImagens() {
        return this.imagens;
    }
    
    public void setImagens(Set imagens) {
        this.imagens = imagens;
    }




}



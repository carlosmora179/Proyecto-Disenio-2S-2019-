package entity;
// Generated Nov 2, 2019, 10:49:09 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Habitacion generated by hbm2java
 */
public class Habitacion  implements java.io.Serializable {


     private Integer idHabitacion;
     private Hotel hotel;
     private TipoHabitacion tipoHabitacion;
     private String disponibilidad;
     private Set imagens = new HashSet(0);
     private Set reservacions = new HashSet(0);

    public Habitacion() {
    }

	
    public Habitacion(Hotel hotel, TipoHabitacion tipoHabitacion, String disponibilidad) {
        this.hotel = hotel;
        this.tipoHabitacion = tipoHabitacion;
        this.disponibilidad = disponibilidad;
    }
    public Habitacion(Hotel hotel, TipoHabitacion tipoHabitacion, String disponibilidad, Set imagens, Set reservacions) {
       this.hotel = hotel;
       this.tipoHabitacion = tipoHabitacion;
       this.disponibilidad = disponibilidad;
       this.imagens = imagens;
       this.reservacions = reservacions;
    }
   
    public Integer getIdHabitacion() {
        return this.idHabitacion;
    }
    
    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public TipoHabitacion getTipoHabitacion() {
        return this.tipoHabitacion;
    }
    
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public String getDisponibilidad() {
        return this.disponibilidad;
    }
    
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public Set getImagens() {
        return this.imagens;
    }
    
    public void setImagens(Set imagens) {
        this.imagens = imagens;
    }
    public Set getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set reservacions) {
        this.reservacions = reservacions;
    }




}



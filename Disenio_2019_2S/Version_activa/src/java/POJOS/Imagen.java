package POJOS;
// Generated 11/11/2019 09:43:59 PM by Hibernate Tools 4.3.1



/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private Integer idImagen;
     private Habitacion habitacion;
     private Hotel hotel;
     private String url;

    public Imagen() {
    }

	
    public Imagen(Hotel hotel, String url) {
        this.hotel = hotel;
        this.url = url;
    }
    public Imagen(Habitacion habitacion, Hotel hotel, String url) {
       this.habitacion = habitacion;
       this.hotel = hotel;
       this.url = url;
    }
   
    public Integer getIdImagen() {
        return this.idImagen;
    }
    
    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


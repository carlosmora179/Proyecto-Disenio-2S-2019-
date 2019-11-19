package POJOS;
// Generated 11/11/2019 09:43:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private Integer idDireccion;
     private String pais;
     private String region;
     private Set hotels = new HashSet(0);

    public Direccion() {
    }

	
    public Direccion(String pais, String region) {
        this.pais = pais;
        this.region = region;
    }
    public Direccion(String pais, String region, Set hotels) {
       this.pais = pais;
       this.region = region;
       this.hotels = hotels;
    }
   
    public Integer getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    public Set getHotels() {
        return this.hotels;
    }
    
    public void setHotels(Set hotels) {
        this.hotels = hotels;
    }




}


package entity;
// Generated Nov 2, 2019, 10:49:09 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoHabitacion generated by hbm2java
 */
public class TipoHabitacion  implements java.io.Serializable {


     private Integer idTipoHabitacion;
     private String tipoHabitacioncol;
     private Set habitacions = new HashSet(0);

    public TipoHabitacion() {
    }

	
    public TipoHabitacion(String tipoHabitacioncol) {
        this.tipoHabitacioncol = tipoHabitacioncol;
    }
    public TipoHabitacion(String tipoHabitacioncol, Set habitacions) {
       this.tipoHabitacioncol = tipoHabitacioncol;
       this.habitacions = habitacions;
    }
   
    public Integer getIdTipoHabitacion() {
        return this.idTipoHabitacion;
    }
    
    public void setIdTipoHabitacion(Integer idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }
    public String getTipoHabitacioncol() {
        return this.tipoHabitacioncol;
    }
    
    public void setTipoHabitacioncol(String tipoHabitacioncol) {
        this.tipoHabitacioncol = tipoHabitacioncol;
    }
    public Set getHabitacions() {
        return this.habitacions;
    }
    
    public void setHabitacions(Set habitacions) {
        this.habitacions = habitacions;
    }




}



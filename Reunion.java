package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Reunion {

    public String descripcion;
    public String fecha;
    public String hora;
    public List<Contacto> asistentes;


    /**
     * Metodo constructor
     * @param descripcion
     * @param fecha
     * @param hora
     */
    

    public Reunion(String descripcion, String fecha, String hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        this.asistentes=new ArrayList<>();
        
    }

    /**
     * Metodo para incluir un asistente en una reunion
     * @param contacto
     * @return
     */

    public boolean incluirAsistente(Contacto contacto){
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
            return true;
        }
        return false; 
    }

    /**
     * Metodo para eliminar asistente de una reunion 
     * @param contacto
     * @return asistentes
     */

    public boolean eliminarAsistente( Contacto contacto){
        return asistentes.remove(contacto);
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", asistentes="
                + asistentes + "]";
    }


  

    
    
}

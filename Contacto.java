package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Contacto {
    
    public String nombre;
    public String alias;
    public String direccion;
    public String telefono;
    public String email;
    public Collection<Contacto> contactos;

    /**
     * Metodo constructor 
     * @param nombre
     * @param alias
     * @param direccion
     * @param telefono
     * @param email
     */


    public Contacto(String nombre, String alias, String direccion, String telefono, String email){
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
        contactos = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direccion="  + direccion +", telefono=" + telefono + ", email=" + email + "]";
    }

    
    
}


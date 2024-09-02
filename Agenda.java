package co.edu.uniquindio.poo;
import java.util.HashSet;
import java.util.Set;

public class Agenda {

    
    private Set<Contacto> contactos;
    public Set<Grupo> grupos;
    public Set<Reunion> reuniones;
    

    // Constructor
    public Agenda() {

        this.contactos = new HashSet<>();
        this.grupos = new HashSet<>();
        this.reuniones = new HashSet<>();
        
    }

    /**
     * Metodo para agregar un contacto
     * @param contacto
     */
    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre())) {
            contactos.add(contacto);
        }
    }

    /**
     * Metodo para remover un contacto
     * @param contacto
     * @return contactos
     */

    public boolean removerContacto(Contacto contacto) {
        return contactos.remove(contacto);
    }

    /**
     * Metodo para agregar un grupo
     * @param grupo
     * @return grupos
     */
    public boolean agregarGrupo(Grupo grupo) {
        return grupos.add(grupo);
    }

    /**
     * Metodo para remover un grupo
     * @param grupo
     * @return grupos
     */

    public boolean removerGrupo(Grupo grupo) {
        return grupos.remove(grupo);
    }

    /**
     * Metodo para agregar una reunion
     * @param reunion
     * @return reuniones
     */
    public boolean agregarReunion(Reunion reunion) {
        return reuniones.add(reunion);
    }

    /**
     * Metodo para remover una reunion
     * @param reunion
     * @return reuniones
     */

    public boolean removerReunion(Reunion reunion) {
        return reuniones.remove(reunion);
    }


    
    /**
     * Metodo para verificar contacto
     * @param nombre
     * @return centinela
     */

    public boolean verificarContacto(String nombre) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar contacto
     * @param nombre
     * @param telefono
     */

    public void eliminarContacto(String nombre,String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    public Set<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Set<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Set<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Set<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(Set<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "Agenda [contactos=" + contactos + ", grupos=" + grupos + ", reuniones=" + reuniones + "]";
    }


    
    
}

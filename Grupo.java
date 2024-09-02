package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Grupo {

        public Categoria categoria;
        public String nombre;
        public List<Contacto> contactos;
        public int LIMITE_CONTACTOS=5;
    

        public Grupo(String nombre,Categoria categoria){

            this.nombre=nombre;
            this.categoria=categoria;
             contactos = new LinkedList<>();
            this.contactos = new ArrayList<>();
            
        }

        /**
         * Metodo para adicionar contacto a un grupo
         * @param contacto
         * @return
         */

        public boolean adicionarContacto(Contacto contacto) {
            if (contactos.size() < LIMITE_CONTACTOS && !contactos.contains(contacto)) {
                contactos.add(contacto);
                return true;
            }
            return false;
        }

        /**
         * Metodo para eliminar contacto de un grupo
         * @param contacto
         * @return contactos
         */

        public boolean eliminarContacto(Contacto contacto) {
            return contactos.remove(contacto);
        }



        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public List<Contacto> getContactos() {
            return contactos;
        }

        public void setContactos(List<Contacto> contactos) {
            this.contactos = contactos;
        }

        @Override
        public String toString() {
            return "Grupo [categoria=" + categoria + ", nombre=" + nombre + ", contactos=" + contactos + "]";
        }

        

        

       

       
        
       
        


        
    
    }
    
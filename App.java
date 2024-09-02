package co.edu.uniquindio.poo;

public class App {

    public static void main(String[] args) {

        


         
        //Crear contacto
        Contacto contacto1 = new Contacto("Susana","Susi","Corbones","3207900428","susi@gmail.com");
        Contacto contacto2 = new Contacto("Stefany Gomez", "Tefa", "Montevideo", "3124567689", "stefag@gmail.com");
        Contacto contacto3 = new Contacto("Oriana Molina", "Ori", "Villa Liliana", "3225679800", "orianamo@gmail.com");
        Contacto contacto4 = new Contacto("Juan Aguirre", "Juanda", "El Recreo", "3225862358", "juanda118@gmail.com");
        Contacto contacto5 = new Contacto("Lizeth Hernandez", "Liz", "Puerto Espejo", "3197847242", "liizi@gmail.com");
        Contacto contacto6 = new Contacto("Lizeth Hernandez", "Liz", "Puerto Espejo", "3197847242", "liizi@gmail.com");
       


       // Crear un grupo

       Grupo nGrupo= new Grupo("Amigos x siempre",Categoria.AMIGOS);
       nGrupo.adicionarContacto(contacto1);
       nGrupo.adicionarContacto(contacto2);
       nGrupo.adicionarContacto(contacto3);
       nGrupo.adicionarContacto(contacto4);
       nGrupo.adicionarContacto(contacto5);
       nGrupo.adicionarContacto(contacto6);

       Grupo nGrupo2= new Grupo("La mejor Familia",Categoria.FAMILIA);
       nGrupo2.adicionarContacto(contacto1);
       nGrupo2.adicionarContacto(contacto2);
       nGrupo2.adicionarContacto(contacto3);
       nGrupo2.adicionarContacto(contacto4);
       nGrupo2.adicionarContacto(contacto5);
       nGrupo2.adicionarContacto(contacto6);


   
    // Crear una reunión
    Reunion nReunion = new Reunion("Reunión de Trabajo", "2024-09-01", "10:00 AM");
    nReunion.incluirAsistente(contacto1);
    nReunion.incluirAsistente(contacto2);
    nReunion.incluirAsistente(contacto3);

    Reunion nReunion2 = new Reunion("Reunión amor y amistad", "2024-09-20", "6:00 PM");
    nReunion2.incluirAsistente(contacto4);
    nReunion2.incluirAsistente(contacto5);
    nReunion2.incluirAsistente(contacto6);
       

    // Mostrar datos 
    System.out.println(nGrupo.toString());
    System.out.println();
    System.out.println(nGrupo2.toString());
    System.out.println();
    System.out.println(nReunion.toString());
    System.out.println();
    System.out.println(nReunion2.toString());
    
    
        
    }
}

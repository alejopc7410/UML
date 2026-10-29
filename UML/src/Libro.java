public class Libro {
    // atributos privados - nadie los puede tocar directamente 
   // desde afuera 

   private String titulo ; 
   private String autor ;
   private boolean disponible;


    public Libro(){ 
        disponible = true;
    }

    public Libro( String titulo, String autor ){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; 
    }

    public Libro( String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible; 
    }

public String getTitulo(){return titulo; }
public String getAutor(){return autor;}
public boolean isDispononible (){return disponible; }

public void setTitulo(String titulo){
    if ( titulo != null && !titulo.isEmpty()){ 
        this.titulo = titulo; 
    } else{ 
        System.out.println( " Error: El titulo no puede estar vacio"); 
    
    }

}

public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: El autor no puede estar vacío.");
        }
    }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void mostrarInfo() {
        System.out.println("-----Libro-----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro no está disponible para préstamo.");
            return false;
        }
    }

    public boolean devolver() {
        if (!disponible) {
            disponible = true;
            return true;
        } else {
            System.out.println("El libro ya está disponible.");
            return false;
        }
    }
}

public class Biblioteca {private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Libro[10]; 
        this.cantidad = 0; // Capacidad máxima de 100 libros
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
        } else {
            System.out.println("No se puede agregar más libros. Capacidad máxima alcanzada.");
        }
    }

    public void mostrarCatalogo() {
        System.out.println("-----Catálogo de la Biblioteca: " + nombre + "-----");
        for (int i = 0; i < cantidad; i++) {
            catalogo[i].mostrarInfo();
            System.out.println();
        }
    }

    public void buscarPorAutor(String autor) {
        System.out.println("-----Búsqueda de libros por autor: " + autor + "-----");
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                catalogo[i].mostrarInfo();
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor: " + autor);
        }
    }
    
}

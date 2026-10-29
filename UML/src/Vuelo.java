public class Vuelo {

    private String numero; 
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[]asientos ;

    public Vuelo(){

    }

    public Vuelo( String numero, String origen,String destino){
        this.numero = numero;
        this.origen= origen;
        this.destino = destino;
        
    }

    public Vuelo( String numero, String origen,String destino,int capacidadMaxima){
        this.numero = numero;
        this.origen= origen;
        this.destino = destino;
        this.capacidadMaxima= capacidadMaxima;
        this.asientos= new Asiento[capacidadMaxima];
        for ( int i= 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }
    
        
    

    public String getNumero() {
        return numero;
    }

    public void mostrarInfo() {
        System.out.println("------Vuelo " + numero + " ------");
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Capacidad máxima: " + capacidadMaxima + "asientos.");
    }

    public void mostrarAsientos() {
        System.out.println("Asientos del vuelo " + numero + ":");
        for (Asiento a : asientos) {
            a.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento) {
        for (Asiento a : asientos) { // FOR EACH 
            if (a.getCodigo().equals(codigoAsiento)) {
                a.ocupar();
                return;
            }
        }
        System.out.println("Asiento " + codigoAsiento + " no encontrado.");
    }

}
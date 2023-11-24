
public class Videojuego {

    // Atributos
    private String publisher;
    private String title;
    private int year;
    private double price;

    // Constructor
    public Videojuego(String publisher, String title, int year, double price) {
        this.publisher = publisher;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    // Método para obtener información del videojuego
    public void info() {
        System.out.println("\nInformacion sobre el videojuego");
        System.out.println("Publisher del videojuego: " + publisher);
        System.out.println("Titulo del videojuego: " + title);
        System.out.println("Fecha de lanzamiento: " + year);
        System.out.println("Precio del videojuego: " + price);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Videojuego
        Videojuego halo = new Videojuego("Xbox", "Halo", 2001, 49.99);
        Videojuego halo2 = new Videojuego("Xbox", "Halo 2", 2004, 59.99);
        Videojuego halo3 = new Videojuego("Xbox", "Halo 3", 2007, 59.99);

        // Llamar al método info para obtener información del videojuego
        halo.info();
        halo2.info();
        halo3.info();
    }


}


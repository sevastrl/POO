// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        // Atributos
        private String nombre;
        private String lugar;
        private double precio;
        private String chef;

        // Constructor
        public Main(String nombre, String lugar, double precio, String chef) {
            this.nombre = nombre;
            this.lugar = lugar;
            this.precio = precio;
            this.chef = chef;
        }

        // Método para obtener información del videojuego
        public void info() {
            System.out.println("\nInformacion sobre el plato tipico");
            System.out.println("Nombre del Chef: " + chef);
            System.out.println("Nombre del plato: " + nombre);
            System.out.println("Lugar: " + lugar);
            System.out.println("Precio: " + precio);
        }

        public static void main(String[] args) {
            // Crear una instancia de la clase Videojuego
            Main fritada = new Main("Fritada", "Sierra", 4.99, "Jose");
            Main cazuela = new Main("Cazuela", "Costa", 8.99, "Juan");
            Main encebollado = new Main("Encebollado", "Costa", 3.99, "Pepe");
            Main hormigas = new Main("Hormigas del oriente", "Oriente", 4.99, "Jose");


            // Llamar al método info para obtener información del videojuego
            fritada.info();
            cazuela.info();
            encebollado.info();
            hormigas.info();

        }

}
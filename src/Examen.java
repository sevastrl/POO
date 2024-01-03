import java.util.ArrayList;
import java.util.List;

// Clase base
class Personaje {
    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void info() {
        System.out.println("Su nombre es " + nombre + " y su nivel es: " + nivel);
    }
}

class Jugador extends Personaje {
    public Jugador(String nombre, int nivel) {
        super(nombre, nivel);
    }
}

class Enemigo extends Personaje {
    public Enemigo(String nombre, int nivel) {
        super(nombre, nivel);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Personaje personaje = new Personaje("Héroe", 5);
            Jugador jugador = new Jugador("Player1", 10);
            Enemigo enemigo = new Enemigo("Boss", 15);

            personaje.info();
            jugador.info();
            enemigo.info();

            System.out.println("\nLos datos guardados son: \n");

            List<Personaje> personajes = new ArrayList<>();
            personajes.add(personaje);
            personajes.add(jugador);
            personajes.add(enemigo);

            for (Personaje p : personajes) {
                p.info();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

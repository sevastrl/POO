
abstract class Carta {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void jugar();

    public abstract void mostrarDescripcion();
}

class CartaNumerica extends Carta {
    private int numero;
    private int numero2;

    public int getNumero() {
        return numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public CartaNumerica(String nombre, int numero, int numero2) {
        setNombre(nombre);
        setNumero(numero);
        setNumero2(numero2);
    }

    public void jugar() {
        System.out.println("Jugando una cartas numéricas");
    }

    public void mostrarDescripcion() {
        System.out.println("La primera carta numérica es: " + getNumero());
        System.out.println("La segunda carta numérica es: " + getNumero2());
    }

    public void realizarCalculo() {
        double resultado = (double) getNumero() / 2;
        System.out.println("Resultado del primer cálculo: " + resultado);

        double resultado2 = (double) getNumero2() / 2;
        System.out.println("Resultado del segundo cálculo: " + resultado2);

        if (resultado > resultado2){
            System.out.println("La primera carta gana");
        }else {
            System.out.println("La segunda carta gana");
        }
    }
}

class CartaEspecial extends Carta {

    public CartaEspecial(String nombre) {
        setNombre(nombre);
    }

    public void jugar() {
        System.out.println("Jugando una carta especial");
    }

    public void mostrarDescripcion() {
        System.out.println("Carta especial: " + getNombre());
    }

    public void activarEfectoEspecial () {
        System.out.println("Activando el efecto especial");
    }
}

public class JuegoDeCartas {
    public static void main(String[] args) {
        CartaNumerica cartaNumerica = new CartaNumerica("8 de corazones", 25, 10);
        cartaNumerica.jugar();
        cartaNumerica.mostrarDescripcion();
        cartaNumerica.realizarCalculo();

        System.out.println("\n");

        try {
            CartaEspecial cartaEspecial = new CartaEspecial("Joker");
            cartaEspecial.jugar();
            cartaEspecial.mostrarDescripcion();
            cartaEspecial.activarEfectoEspecial();
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }

    }
}

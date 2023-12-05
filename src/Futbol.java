public class Futbol {

    String jugador = "Sebas";
    int numero = 5;

    public Futbol (String jugador, int numero){
        this.jugador = jugador;
        this.numero = numero;
    }

    public static void Correr(){
        System.out.println("Recorrido 200 metros");
    }

    public static void main(String[] args){
        Correr();
    }
}

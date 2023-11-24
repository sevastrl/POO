public class juegos {

    public String nombre;
    public String cualidad;
    public String arma;
    public String armadura;


    public juegos(String nombre, String cualidad, String arma, String armadura){
        this.nombre = nombre;
        this.cualidad = cualidad;
        this.arma = arma;
        this.armadura = armadura;
    }

    public void mostrar(){
        System.out.println("\nEl nombre del personaje es: " + nombre);
        System.out.println("La cualidad del personaje es: " + cualidad);
        System.out.println("La arma del personaje es: " + arma);
        System.out.println("La armadura del personaje es: " + armadura);

    }

    public static void main(String[] args){
        juegos personaje = new juegos("Sebas","Fuego","Espada","Hierro");
        juegos personaje1 = new juegos("Jose","Hielo","Dagas","Hierro");
        juegos personaje2 = new juegos("Harry","Tierra","Lanza","Hierro");

        personaje.mostrar();
        personaje1.mostrar();
        personaje2.mostrar();
    }

}

public class estudiantes {

    public String nombre;
    public int edad;

    public estudiantes(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

    public void saludar(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

    public static void main(String[] args) {

        estudiantes estudiante_desarollo = new estudiantes("sebas", 20);
        estudiantes estudiante_redes = new estudiantes("juan", 22);

        estudiante_desarollo.saludar();
        estudiante_redes.saludar();

    }




}

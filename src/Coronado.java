import java.util.Scanner;

class Participante{
    String nombre;
    String disiplina;
    boolean sanciones;

    boolean examenesMedicos;

    public Participante(String nombre, String disiplina, boolean sanciones, boolean examenesMedicos) {
        this.nombre = nombre;
        this.disiplina = disiplina;
        this.sanciones = sanciones;
        this.examenesMedicos = examenesMedicos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisiplina() {
        return disiplina;
    }

    public boolean isSanciones() {
        return sanciones;
    }

    public boolean isExamenesMedicos() {
        return examenesMedicos;
    }

    public void validacionMedicos(){
        if (examenesMedicos ==  equals(true)){
            System.out.println("El participante no cumple con los examenes medicos");
        }else {
            System.out.println("El participante cumple con los examenes medicos");
        }
    }

    public void validacionSanciones(){
        if (sanciones ==  equals(true)){
            System.out.println("El participante podra");
        }else {
            System.out.println("El participante no podra participar por las sanciones");
        }
    }

}

class Validacion{

    int edad;
    String aptitudFisica;
    String invalido;

    public Validacion(int edad, String aptitudFisica, String invalido){
        this.edad = edad;
        this.aptitudFisica = aptitudFisica;
    }

    public int getEdad() {
        return edad;
    }

    public String getAptitudFisica() {
        return aptitudFisica;
    }

    public String getInvalido() {
        return invalido;
    }

    public void verificarEdad(){
        if (edad > 17){
            System.out.println("Tiene la edad suficente para participar");
        }else {
            System.out.println("No tiene la edad suficiente para participar");
        }
    }

}


public class Coronado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del participante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la disiplina del participante:");
        String disiplina = scanner.nextLine();

        System.out.println("El participante tiene sanciones?(true/false):");
        boolean sanciones = scanner.nextBoolean();

        System.out.println("El participante tiene examenes medicos?(true/false):");
        boolean examenesMedicos = scanner.nextBoolean();

        System.out.println("Ingrese la edad del participante:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la aptitud fisica del participante:(baja/media/alta)");
        String aptitudFisica = scanner.nextLine();

        System.out.println(" ");
        String invalido = scanner.nextLine();


        Participante participante = new Participante(nombre, disiplina, sanciones, examenesMedicos);
        Validacion validacion = new Validacion(edad, aptitudFisica, invalido);

        participante.validacionMedicos();
        participante.validacionSanciones();
        validacion.verificarEdad();
    }
}
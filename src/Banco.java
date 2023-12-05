public class Banco {
    String nombre;
    int cedula;

    public Banco(String nombre, int cedula){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public void RegistrarUsuario(){
        System.out.println("Datos personales");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
    }

    public static void R_cuenta_usuario() {
        System.out.println("Cuenta registrada con exito");
    }

    public static void main(String[] args){
            Banco usuario1 = new Banco("Sebas", 1548184);
            usuario1.RegistrarUsuario();
            R_cuenta_usuario();
    }
}

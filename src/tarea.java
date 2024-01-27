public class OperacionesMatematicas {

    public static void main(String[] args) {
        double angulo = 45.0;
        double numero1 = 25.0;
        double numero2 = 4.0;

        // Seno
        double seno = Math.sin(Math.toRadians(angulo));
        System.out.println("Seno(" + angulo + ") = " + seno);

        // Coseno
        double coseno = Math.cos(Math.toRadians(angulo));
        System.out.println("Coseno(" + angulo + ") = " + coseno);

        // Tangente
        double tangente = Math.tan(Math.toRadians(angulo));
        System.out.println("Tangente(" + angulo + ") = " + tangente);

        // Raíz cuadrada
        double raizCuadrada = Math.sqrt(numero1);
        System.out.println("Raíz cuadrada de " + numero1 + " = " + raizCuadrada);

        // Potencia
        double potencia = Math.pow(numero1, 2);
        System.out.println(numero1 + " elevado al cuadrado = " + potencia);

        // Valor absoluto
        double valorAbsoluto = Math.abs(-7.5);
        System.out.println("Valor absoluto de -7.5 = " + valorAbsoluto);

        // Logaritmo natural
        double logaritmoNatural = Math.log(numero1);
        System.out.println("Logaritmo natural de " + numero1 + " = " + logaritmoNatural);

        // Máximo entre dos números
        double maximo = Math.max(numero1, numero2);
        System.out.println("Máximo entre " + numero1 + " y " + numero2 + " = " + maximo);

        // Mínimo entre dos números
        double minimo = Math.min(numero1, numero2);
        System.out.println("Mínimo entre " + numero1 + " y " + numero2 + " = " + minimo);

        // Redondeo hacia arriba
        double redondeoArriba = Math.ceil(8.3);
        System.out.println("Redondeo hacia arriba de 8.3 = " + redondeoArriba);

        // Redondeo hacia abajo
        double redondeoAbajo = Math.floor(8.7);
        System.out.println("Redondeo hacia abajo de 8.7 = " + redondeoAbajo);

        // Valor absoluto
        double absoluto = Math.abs(-15.6);
        System.out.println("Valor absoluto de -15.6 = " + absoluto);

        // Número aleatorio 
        double aleatorio = Math.random();
        System.out.println("Número aleatorio: " + aleatorio);
    }
}


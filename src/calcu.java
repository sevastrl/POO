public class calcu {

    public void sumar(int num1, int num2){
        System.out.println("Resultado: " + (num1 + num2));
    }

    public void sumar(int num1, int num2, int num3){
        System.out.println((num1 + num2 + num3)+5);
    }

    public void sumar(double num1, double num2){
        System.out.println((num1 + num2)+2);
    }

    public static void main(String [] args){
        calcu p1 = new calcu();
        p1.sumar(10,12);

        calcu p2 = new calcu();
        p2.sumar(23,14,5);

        calcu p3 = new calcu();
        p3.sumar(22.6,56.14);


    }

}

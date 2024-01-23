import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        cuadrado cuadrado = new cuadrado();

        JFrame ventana = new JFrame("Cuadrado de un numero");
        ventana.setSize(300,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel elemento = new JLabel("Ingrese un numero: ");
        JTextField input = new JTextField();
        input.setColumns(5);

        JLabel elemento2 = new JLabel("Su numero es: ");
        JTextField input2 = new JTextField();
        input.setColumns(5);

        JLabel elemento3 = new JLabel("Su cuadrado es: ");
        JTextField input3 = new JTextField();
        input.setColumns(5);

        JButton boton = new JButton("Calcular");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(input.getText());
                int valor = cuadrado.obternerNumero(number);
                int cuadra = cuadrado.cuadradoNumero(number);

                String valorString = Integer.toString(valor);
                String cuadradoString = Integer.toString(cuadra);

                input2.setText(valorString);
                input2.setText(cuadradoString);
            }
        });

        JPanel panel = new JPanel();
        panel.add(elemento);
        panel.add(input);

        JPanel panel2 = new JPanel();
        panel2.add(elemento2);
        panel2.add(input2);

        JPanel panel3 = new JPanel();
        panel3.add(elemento3);
        panel3.add(input3);

        JPanel panel4 = new JPanel();
        panel4.add(boton);

        ventana.add(panel, BorderLayout.NORTH);
        ventana.add(panel2, BorderLayout.CENTER);
        ventana.add(panel3, BorderLayout.AFTER_LAST_LINE);
        ventana.add(panel4, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}
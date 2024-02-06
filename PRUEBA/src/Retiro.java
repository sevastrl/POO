import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{

    private VeSaldo veSaldo;
    private JPanel Panel4;
    private JButton menuButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton punto;
    private JButton a0Button;
    private JButton hahaButton;
    private JLabel displayRetiro;
    private JButton limpiarButton;
    private JButton eliminarButton;
    private JButton confirmarButton;

    private String Valor;

    double retiroNum;

    public double getRetiroNum() {
        return retiroNum;
    }

    public Retiro(VeSaldo veSaldo) {
        super("Retiro");
        setContentPane(Panel4);
        setUndecorated(true);
        this.veSaldo = veSaldo;

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor=displayRetiro.getText();
                if(Valor.length() == 1 && Valor.equals(("0"))){
                    displayRetiro.setText("0");
                } else{
                    displayRetiro.setText(Valor+"0");
                }
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor=displayRetiro.getText();
                if (Valor.equals("0")){
                    displayRetiro.setText("1");
                } else{
                    displayRetiro.setText(Valor+"1");
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("2");
                } else {
                    displayRetiro.setText(Valor + "2");
                }
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("3");
                } else {
                    displayRetiro.setText(Valor + "3");
                }
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("4");
                } else {
                    displayRetiro.setText(Valor + "4");
                }
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("5");
                } else {
                    displayRetiro.setText(Valor + "5");
                }
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("6");
                } else {
                    displayRetiro.setText(Valor + "6");
                }
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("7");
                } else {
                    displayRetiro.setText(Valor + "7");
                }
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("8");
                } else {
                    displayRetiro.setText(Valor + "8");
                }
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.equals("0")) {
                    displayRetiro.setText("9");
                } else {
                    displayRetiro.setText(Valor + "9");
                }
            }
        });

        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (!Valor.contains(".")) {
                    displayRetiro.setText(Valor +".");
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayRetiro.setText("0");
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayRetiro.getText();
                if (Valor.length() > 1) {
                    displayRetiro.setText(Valor.substring(0, Valor.length() - 1));
                } else {
                    displayRetiro.setText("0");
                }
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String retiro = displayRetiro.getText();
                retiroNum = Double.parseDouble(retiro);

                double saldoActual = veSaldo.getSaldo();

                if (retiroNum > saldoActual) {
                    JOptionPane.showMessageDialog(Retiro.this, "Saldo insuficiente");
                } else {
                    JOptionPane.showMessageDialog(Retiro.this, "Retiro exitoso!! \nUsted retiró $" + (retiroNum));
                    veSaldo.actualizarSaldo(0, retiroNum);
                }
            }
        });

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu(veSaldo);
                menu.setSize(400, 400);
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });

    }
}

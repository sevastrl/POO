import javax.swing.*;
    import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame{
    private JButton menuButton;
    private JPanel Panel5;
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
    private JButton button12;
    private JButton limpiarButton;
    private JButton eliminarButton;
    private JButton confirmarButton;
    private JLabel displayDeposito;
    private VeSaldo veSaldo;
    private String Valor;
    private JTextField montoTextField;

    public double depositoNum;

    public double getDepositoNum() {
        return depositoNum;
    }

    public Deposito(VeSaldo veSaldo) {
        super("Deposito");
        setContentPane(Panel5);
        setUndecorated(true);
        this.veSaldo = veSaldo;
        montoTextField = new JTextField();

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor= displayDeposito.getText();
                if(Valor.length() == 1 && Valor.equals(("0"))){
                    displayDeposito.setText("0");
                } else{
                    displayDeposito.setText(Valor+"0");
                }
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor=displayDeposito.getText();
                if (Valor.equals("0")){
                    displayDeposito.setText("1");
                } else{
                    displayDeposito.setText(Valor+"1");
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("2");
                } else {
                    displayDeposito.setText(Valor + "2");
                }
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("3");
                } else {
                    displayDeposito.setText(Valor + "3");
                }
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("4");
                } else {
                    displayDeposito.setText(Valor + "4");
                }
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("5");
                } else {
                    displayDeposito.setText(Valor + "5");
                }
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("6");
                } else {
                    displayDeposito.setText(Valor + "6");
                }
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("7");
                } else {
                    displayDeposito.setText(Valor + "7");
                }
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("8");
                } else {
                    displayDeposito.setText(Valor + "8");
                }
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.equals("0")) {
                    displayDeposito.setText("9");
                } else {
                    displayDeposito.setText(Valor + "9");
                }
            }
        });

        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (!Valor.contains(".")) {
                    displayDeposito.setText(Valor +".");
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayDeposito.setText("0");
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = displayDeposito.getText();
                if (Valor.length() > 1) {
                    displayDeposito.setText(Valor.substring(0, Valor.length() - 1));
                } else {
                    displayDeposito.setText("0");
                }
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double monto = Double.parseDouble(displayDeposito.getText().trim());
                    veSaldo.actualizarSaldo(monto, 0);
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Deposito.this, "Error al procesar el monto. Por favor, ingrese un número válido.");
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


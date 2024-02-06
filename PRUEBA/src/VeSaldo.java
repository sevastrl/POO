import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VeSaldo extends JFrame {

    private JButton BMenu;
    private JPanel Panel3;
    private JLabel displaySaldo;
    private double saldo = 13.69;

    public double getSaldo() {
        return saldo;
    }

    private void actualizarDisplaySaldo() {
        DecimalFormat formato = new DecimalFormat("#.##");
        double saldoRedondeado = Double.parseDouble(formato.format(saldo).replace(',', '.'));
        displaySaldo.setText("Saldo: $" + saldoRedondeado);
    }

    public void actualizarSaldo(double depositoNum, double retiroNum) {
        saldo = saldo + depositoNum - retiroNum;
        actualizarDisplaySaldo();
    }

    public VeSaldo() {
        super("Saldo");
        setContentPane(Panel3);
        setUndecorated(true);

        actualizarDisplaySaldo();

        BMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu(VeSaldo.this);
                menu.setSize(400, 400);
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });
    }
}
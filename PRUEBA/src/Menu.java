import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private JPanel Panel2;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private VeSaldo veSaldo;

    public Menu(VeSaldo veSaldo) {
        super("Prueba");
        this.veSaldo = veSaldo;
        setContentPane(Panel2);
        setUndecorated(true);

        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                veSaldo.setSize(400, 400);
                veSaldo.setLocationRelativeTo(null);
                veSaldo.setVisible(true);
                veSaldo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro retiro = new Retiro(veSaldo);
                retiro.setSize(400, 400);
                retiro.setLocationRelativeTo(null);
                retiro.setVisible(true);
                retiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito deposito = new Deposito(veSaldo);
                deposito.setSize(400, 400);
                deposito.setLocationRelativeTo(null);
                deposito.setVisible(true);
                deposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });

        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Menu.this, "Muchas gracias");
                dispose();
            }
        });
    }
}
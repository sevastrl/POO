import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel Text1;
    private JTextField Text;
    private JPasswordField Pass;
    private JButton B1;
    private JLabel Text2;
    private JPanel Panel1;

    public Login() {
        super("PRUEBA");
        setContentPane(Panel1);
        setUndecorated(true);

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = Text.getText();
                String password = Pass.getText();

                if(user.equals("Alan" )&& password.equals("1234")){
                    JOptionPane.showMessageDialog(Login.this, "Bienvenido");
                    VeSaldo veSaldo = new VeSaldo();
                    Menu menu = new Menu(veSaldo);
                    menu.setSize(400, 400);
                    menu.setLocationRelativeTo(null);
                    menu.setVisible(true);
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(Login.this, "Usuario incorrecto");
                    Pass.setText("");
                }
            }
        });
    }
}

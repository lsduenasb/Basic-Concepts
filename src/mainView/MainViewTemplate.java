//Paquetes
package mainView;

//Librerias
import javax.swing.*;
import java.awt.*;

//Autores
/*
@autor: Laura Sofia Dueñas Bulla
@autor: Daniel Camilo Carreño Merino
 */

//Declaracion de la clase
public class MainViewTemplate extends JFrame {
    //Atributos
    private JButton btnLogIn;
    private JLabel lblName, lblLastName, lblLogo;
    private ImageIcon imgLogo;
    private JTextField jtfName, jtfLastName;

    //Constructor
    public MainViewTemplate(){
        this.setSize(250,250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Hello:D");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.pink);
        addComponents(); //invocacion del metodo
        this.setVisible(true);
    }

    //Metodo
    public void addComponents(){
        imgLogo=new ImageIcon("src/images/user.png");
        lblLogo=new JLabel(imgLogo);
        lblLogo.setBounds(85,10,64,64);
        add(lblLogo);

        lblName=new JLabel("Nombre:");
        lblName.setBounds(20, 85, 80,20);
        lblName.setFont(new Font("Times New Roman",2,20));
        add(lblName);

        lblLastName=new JLabel("Apellido:");
        lblLastName.setBounds(20, 120, 80,20);
        lblLastName.setFont(new Font("Times New Roman",2,20));
        add(lblLastName);

        jtfName=new JTextField();
        jtfName.setBounds(100,85,120,20);
        add(jtfName);

        jtfLastName=new JTextField();
        jtfLastName.setBounds(100,120,120,20);
        add(jtfLastName);

        btnLogIn=new JButton("Ingresar");
        btnLogIn.setBounds(75,170,100,30);
        btnLogIn.setBackground(Color.white);
        add(btnLogIn);
    }

}

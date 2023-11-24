import javax.swing.*;
import java.awt.*;









public class Frame extends JFrame{

    public Register register = new Register();

    Frame(){

            

            setSize(300,400);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        register.RegisterPanel(this);



    }








}
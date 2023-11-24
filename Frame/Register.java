import javax.swing.*;
import java.awt.*;
import java.awt.event.*;









public class Register {

  



    public void RegisterPanel(JFrame RegFrame){

        JPanel panel1 = new JPanel();
        
        panel1.setSize(300,400);
        panel1.setBackground(new Color(233,23,122));

        RegFrame.add(panel1);




        JButton button = new JButton("Button");

        button.setBounds(30,30,80,30);

        button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
            LoginPanel LgPanel = new LoginPanel();

            RegFrame.getContentPane().removeAll();
            RegFrame.repaint();
            

            LgPanel.loginPanel(RegFrame);



            }


        });


        panel1.add(button);



    }








}





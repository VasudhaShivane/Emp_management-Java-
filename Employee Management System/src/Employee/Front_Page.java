package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Front_Page implements ActionListener
{
    JFrame f; 
    JLabel id,l1; //image,ems
    JButton b;

    Front_Page()
    {
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/plain2.jpg"));  //to get available image in system
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);  //to adjust/change image size
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);//manually set 
        f.add(l1);


        b = new JButton(" CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        

        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("     EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.BOLD,60));
        lid.setForeground(Color.black);
        lid.setVisible(true);
        id.add(lid); //to display it on the image

        id.add(b); //to display it on the image
        f.add(id);
        
        
       // f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        //f.setLocation(200,100);
    }

      
    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource()==b) //if continue
        {
            f.setVisible(false);
            new login();    //object of login class created and called constructor
        }
    }

    public static void main(String[] arg)
    {
        new Front_Page();
    }
}



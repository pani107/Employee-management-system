package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000,1100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,2000,1100);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(770,250,400,80);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(650,400,200,60);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.setFont(new Font("Raleway",Font.BOLD,17));
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(1000,400,200,60);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        view.setFont(new Font("Raleway",Font.BOLD,17));
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(800,570,200,60);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        rem.setFont(new Font("Raleway",Font.BOLD,17));
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(rem);

        setSize(2000,1100);
        setLocation(250,100);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Main_class();
    }
}
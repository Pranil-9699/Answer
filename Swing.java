package SwingP;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginform1 {

	public static void main(String[] args) {
JFrame frame=new JFrame();
		
		frame.setSize(500,300);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JLabel label=new JLabel("Username");
		label.setBounds(50,50,100,30);//left top width height
		c.add(label);
		
		JLabel label1=new JLabel("Password");
		label1.setBounds(50,80,100,30);
		c.add(label1);

		JTextField t=new JTextField();
	   t.setBounds(130, 60, 200, 20);
	   c.add(t);
	   
	   
	   
	   JPasswordField pass=new JPasswordField();
	   pass.setBounds(130,90,200,20);
	   c.add(pass);
	   
	   
	   JButton btn=new JButton("Submit");
	   btn.setBounds(130, 120, 100,30);
	   c.add(btn);
	   
	   JButton btn1=new JButton("Reset");
	   btn1.setBounds(250, 120, 100,30);
	   c.add(btn1);
	   
	   
	   btn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            handleSubmit();
	        }
	    });
	   
	   
	   frame.setVisible(true);

	}
	private static void handleSubmit() {
	    JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
	}
}














package SwingP;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class vaccine {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
        frame.setSize(500, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);
        
        JLabel label=new JLabel("Vaccinatio  Details");
        label.setBounds(200,50,200,50);
        c.add(label);
        
        JLabel label1=new JLabel("Name");
        label1.setBounds(150,100,50,50);
        c.add(label1);
        
        JTextField t=new JTextField();
        t.setBounds(190, 120, 200, 20);
        c.add(t);
        
        JLabel label2=new JLabel("Dose");
        label2.setBounds(150,150,50,50);
        c.add(label2);
        
        JCheckBox box=new JCheckBox("1 Dose");
        box.setBounds(150, 180, 100, 20);
        c.add(box);
        
        JCheckBox box1=new JCheckBox("2 Dose");
        box1.setBounds(150, 210, 100, 20);
        c.add(box1);
        
        
         JLabel label3=new JLabel("Vaccine");
        label3.setBounds(250,150,50,50);
        c.add(label3);
        
      
        
        JRadioButton radio=new JRadioButton("Covishield");
        radio.setBounds(250, 230, 150,20);
        c.add(radio);
        
        JRadioButton radio2=new JRadioButton("Covaxin");
        radio2.setBounds(250, 190, 150,20);
        c.add(radio2);
        
        JRadioButton radio3=new JRadioButton("Sputnik V");
        radio3.setBounds(250, 210, 150,20);
        c.add(radio3);
        
        
      ButtonGroup grp=new ButtonGroup();  
        grp.add(radio);
        grp.add(radio2);
        grp.add(radio3);
        
        
        Border blackline=BorderFactory.createLineBorder(Color.black);
        
        JPanel panel=new JPanel();
        panel.setBounds(50, 260, 400,80);
        panel.setBorder(blackline);
        panel.setLayout(null);
        c.add(panel);
        
        JLabel lab=new JLabel("Name");
        lab.setBounds(5, 10, 40, 20);
        panel.add(lab);
        
        
        JLabel lab1=new JLabel("1st Dose");
        lab1.setBounds(150, 10, 60, 20);
        panel.add(lab1);
        
        
        JLabel lab2=new JLabel("2nd Dose");
        lab2.setBounds(270, 10, 60, 20);
        panel.add(lab2);
        
        
        
        JLabel lab3=new JLabel("Vaccine");
        lab3.setBounds(5, 40, 60, 20);
        panel.add(lab3);
        
        
       frame.setVisible(true);
        
       
	}

	
	

}













package SwingP;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class show {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocation(50, 50);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Programming Language");
        label.setBounds(150, 50, 300, 20);
        c.add(label);

        String[] values = { "C", "C++", "C#", "Java", "PHP" };

        JComboBox combo = new JComboBox(values);
        combo.setBounds(150, 100, 100, 20);
        c.add(combo);

        JButton btn = new JButton("Show");
        btn.setBounds(270, 100, 80, 20);
        c.add(btn);

        // Create a label to display the selected value
        JLabel selectedLabel = new JLabel("Selected: ");
        selectedLabel.setBounds(290, 50, 300, 20);
        c.add(selectedLabel);

        // Add an action listener to the button to update the label text when the button is clicked
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected value from the combo box
                String selected = (String) combo.getSelectedItem();

                // Update the label text
                selectedLabel.setText("Selected: " + selected);
            }
        });

        frame.setVisible(true);
    }

}

















package SwingP;
import java.awt.*;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400, 400);
		frame.setLocation(50, 50);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextField t=new JTextField();
		t.setBounds(50, 50, 300, 30);
		c.add(t);
		
		JButton btn1=new JButton("7");
		btn1.setBounds(50,90,50,20);
		c.add(btn1);
		
		JButton btn2=new JButton("8");
		btn2.setBounds(130,90,50,20);
		c.add(btn2);
		
		JButton btn3=new JButton("9");
		btn3.setBounds(200,90,50,20);
		c.add(btn3);
		
		JButton btn4=new JButton("/");
		btn4.setBounds(280,90,50,20);
		c.add(btn4);
		
		JButton btn5=new JButton("4");
		btn5.setBounds(50,130,50,20);
		c.add(btn5);
		
		JButton btn6=new JButton("5");
		btn6.setBounds(130,130,50,20);
		c.add(btn6);
		
		JButton btn7=new JButton("6");
		btn7.setBounds(200,130,50,20);
		c.add(btn7);
		
		JButton btn8=new JButton("*");
		btn8.setBounds(280,130,50,20);
		c.add(btn8);
		
		JButton btn9=new JButton("1");
		btn9.setBounds(50,170,50,20);
		c.add(btn9);
		
		JButton btn10=new JButton("2");
		btn10.setBounds(130,170,50,20);
		c.add(btn10);
		
		JButton btn12=new JButton("3");
		btn12.setBounds(200,170,50,20);
		c.add(btn12);
		
		JButton btn13=new JButton("-");
		btn13.setBounds(280,170,50,20);
		c.add(btn13);
		
		JButton bt1=new JButton(".");
		bt1.setBounds(50,210,50,20);
		c.add(bt1);
		
		JButton bt2=new JButton("0");
		bt2.setBounds(130,210,50,20);
		c.add(bt2);
		
		JButton bt3=new JButton("+");
		bt3.setBounds(200,210,50,20);
		c.add(bt3);
		
		JButton bt4=new JButton("+");
		bt4.setBounds(280,210,50,20);
		c.add(bt4);
		
		
		
		JButton btn=new JButton("Clear");
		btn.setBounds(140,260,100,20);
		c.add(btn);
		
		
		
		frame.setVisible(true);
	}

}












package SwingP;

import javax.swing.*;

public class Notepad
{

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		frame.setLayout(null);
		
		frame.setSize(500,500);
		frame.setLocation(900, 50);
		frame.setTitle("Notepad");
		
		JMenuBar menubar=new JMenuBar();
		
		JMenu file=new JMenu("File");
		JMenuItem i1=new JMenuItem("New");
		JMenuItem i2=new JMenuItem("Open");
		JMenuItem i3=new JMenuItem("Save");
		file.add(i1);
		file.add(i2);
		file.add(i3);
		
		menubar.add(file);
		
		
		JMenu edit=new JMenu("Edit");
		
		JMenuItem i4=new JMenuItem("Cut");
		JMenuItem i5=new JMenuItem("Copy");
		JMenuItem i6=new JMenuItem("Paste");
		JMenuItem i7=new JMenuItem("Select All");
		edit.add(i4);
		edit.add(i5);
		edit.add(i6);
		edit.add(i7);
		
		menubar.add(edit);
		
JMenu help=new JMenu("Help");
		
		JMenuItem i8=new JMenuItem("Search");
		JMenuItem i9=new JMenuItem("Tips");
		JMenuItem i10=new JMenuItem("Tricks");
		JMenuItem i11=new JMenuItem("Help Content");
		help.add(i11);
		help.add(i8);
		help.add(i9);
		help.add(i10);
		
		menubar.add(help);
		
	   frame.setJMenuBar(menubar);
	   
	   JFormattedTextField t=new JFormattedTextField();
	   t.setBounds(5, 5, 475, 425);
	   
	   
	   frame.add(t);
		
		frame.setVisible(true);
	}

}















package SwingP;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginForm {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setBounds(50, 50, 500, 350);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JLabel l=new JLabel("First Name");
		l.setBounds(50, 50, 100, 20);
		frame.add(l);
		
		JLabel l1=new JLabel("Last Name");
		l1.setBounds(50, 100, 100, 30);
		frame.add(l1);
		
		JLabel l2=new JLabel("Email Id");
		l2.setBounds(50, 150, 100, 30);
		frame.add(l2);
		
		JTextField text=new JTextField();
		text.setBounds(120, 50, 100, 20);
		frame.add(text);
		
		JTextField text1=new JTextField();
		text1.setBounds(120, 100, 100, 20);
		frame.add(text1);
		
		JTextField text2=new JTextField();
		text2.setBounds(120, 150, 100, 20);
		frame.add(text2);
		
		JLabel l3=new JLabel("User Name");
		l3.setBounds(250, 50, 100, 20);
		frame.add(l3);
		
		JLabel l4=new JLabel("Password");
		l4.setBounds(250, 100, 100, 20);
		frame.add(l4);
		
		JLabel l5=new JLabel("Moblie No");
		l5.setBounds(250, 150, 100, 20);
		frame.add(l5);
		
		JTextField text4=new JTextField();
		text4.setBounds(320, 50, 100, 20);
		frame.add(text4);
		
		JTextField text5=new JTextField();
		text5.setBounds(320, 100, 100, 20);
		frame.add(text5);
		
		JTextField text6=new JTextField();
		text6.setBounds(320, 150, 100, 20);
		frame.add(text6);
		
		JButton btn=new JButton("Submit");
		btn.setBounds(200, 200, 100, 20);
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            handleSubmit();
	        }
	    });
		
		frame.setVisible(true);
		

	}
	private static void handleSubmit() {
	    JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
	}
}

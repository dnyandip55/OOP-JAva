import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class InvalidBirthYearException extends Exception
{
 	public String toString()
 	{
 		return "Invalid Birth Year";
 	}
}
public class cowin extends JFrame implements ActionListener
{  
	JLabel cowin;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8; 
	JButton b1,b2,b3,b4,b5;
 cowin()
 {
	setVisible(true);
	setSize(500,500);
	setLayout(null);
	cowin=new JLabel("Co WIN Registration");
	cowin.setBounds(200,20,200,30);
	add(cowin);
	l1=new JLabel("AdharCard No:");
	l1.setBounds(100,60,130,30);
	add(l1);
	l2=new JLabel("Birth Year:");
	l2.setBounds(100,80,100,50);
	add(l2);
	l3=new JLabel("Mobile No:");
	l3.setBounds(100,110,100,50);
	add(l3);
	
	t1=new JTextField(10);
	t1.setBounds(230,60,100,20);
	add(t1);
	t2=new JTextField(10);
	t2.setBounds(230,100,100,20);
	add(t2);
	t3=new JTextField(10);
	t3.setBounds(230,140,100,20);
	add(t3);
	
	l4=new JLabel("Age Group:");
	l4.setBounds(100,170,100,30);
	add(l4);
	
	r1=new JRadioButton("18 & Above",false);
	r1.setBounds(200,180,150,30);
	add(r1);
	
	r2=new JRadioButton("45 & Above",false);
	r2.setBounds(350,180,200,30);
	add(r2);
	
	l5=new JLabel("Select Hospital:");
	l5.setBounds(100,220,150,30);
	add(l5);
	
	t4=new JTextField(10);
	t4.setBounds(230,230,100,20);
	add(t4);

	l6=new JLabel("vaccine:");
	l6.setBounds(100,260,100,30);
	add(l6);
	
	r3=new JRadioButton("covisheild",false);
	r3.setBounds(200,260,150,30);
	add(r3);
	
	r4=new JRadioButton("covaxin",false);
	r4.setBounds(400,260,150,30);
	add(r4);
	
	r5=new JRadioButton("sphutnic V",false);
	r5.setBounds(550,260,150,30);
	add(r5);
	
	l6=new JLabel("Time slot:");
	l6.setBounds(100,300,150,30);
	add(l6);
	

	r6=new JRadioButton("Morning",false);
	r6.setBounds(200,300,150,30);
	add(r6);
	

	r7=new JRadioButton("afternoon",false);
	r7.setBounds(400,300,150,30);
	add(r7);
	

	r8=new JRadioButton("Evening",false);
	r8.setBounds(550,300,150,30);
	add(r8);
	
	b1=new JButton("ADD");
	b1.setBounds(100,340,80,30);
	add(b1);
	
	b2=new JButton("UPDATE");
	b2.setBounds(210,340,100,30);
	add(b2);
	
	b3=new JButton("DELETE");
	b3.setBounds(330,340,100,30);
	add(b3);
	
	b4=new JButton("VIEW");
	b4.setBounds(460,340,80,30);
	add(b4);
	
	b5=new JButton("SEARCH");
	b5.setBounds(580,340,100,30);
	add(b5);
	
	b1.addActionListener(this);
	
 }
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource()==b1)
	 {
		 try
		 {
			 String s1="0000";
		 String s=t2.getText();
		 	if(s.equals(s1))
		 	{
		 	 throw new InvalidBirthYearException();
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(this, "Birth year="+s);
		 	}
		 }catch(Exception e) 
		 {
			 JOptionPane.showMessageDialog(this, "error="+e);
				
		 }
	 }

 }
 public static void main(String arg[])
 {
	 new cowin();
 }
}
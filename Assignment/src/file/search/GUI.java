package file.search;


import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class GUI extends JFrame implements ActionListener  
{
   JButton button1;
   static JTextField box1; 
   static JTextField box2; 
   static JTextField box3; 
   static JTextField box4; 
      
   // constructor
  GUI(String title)
   {
	   
	   super(title);
	   setSize(650,300);
	   setLayout(new FlowLayout());
	   button1 = new JButton("Search");
	   button1.addActionListener(this);
	   
	   JLabel box1_label = new JLabel("Searched word");
	   box1 = new JTextField("", 50);
	   add(box1_label);
	   add(box1);
	   
	   JLabel box2_label = new JLabel("Link of first file");
	   box2 = new JTextField("", 50);
	   add(box2_label);
	   add(box2);
	   
	   JLabel box3_label = new JLabel("Link of second file");
	   box3 = new JTextField("", 50);
	   add(box3_label);
	   add(box3);
	   
	   JLabel box4_label = new JLabel("Link of third file");
	   box4 = new JTextField("", 50);
	   add(box4_label);
	   add(box4);
	   
	   add(button1);
	   
	   setLocationRelativeTo(null);
	   setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
	   setVisible(true);
	   
	}
  
  	public void actionPerformed(ActionEvent e) 
  	{
  		if (e.getSource().equals(button1))
		{
  			String value1 = box1.getText();
  			String value2 = box2.getText();
  			String value3 = box3.getText();
  			String value4 = box4.getText();
  			
  			ReadFile rf1 = new ReadFile();
  			ReadFile rf2 = new ReadFile();
  			ReadFile rf3 = new ReadFile();
  					
  			int result1 = rf1.openFile(value2, value1);
  			int result2 = rf2.openFile(value3, value1);
  			int result3 = rf3.openFile(value4, value1);
  			
  			FindMostOccurrence fmo = new FindMostOccurrence();
  			fmo.sort(result1, result2, result3);
  			
		}
  	}
}
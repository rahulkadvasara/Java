import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;

class SwingTest implements ActionListener{
	JFrame frm=new JFrame("This is App");
	JPanel pnl=new JPanel();
	JLabel lbl1=new JLabel("Enter your Name");
	JTextField txt1=new JTextField(20);
	JTextField txt2=new JTextField(20);
	JButton btn1=new JButton("Submit");

	public void actionPerformed(ActionEvent ae){
		String str=txt1.getText();
		txt2.setText(str);
	}
	void display(){
		frm.setSize(600, 300);

		btn1.addActionListener(this);
		pnl.add(lbl1);
		pnl.add(txt1);
		pnl.add(txt2);
		pnl.add(btn1);
		frm.add(pnl);
		frm.setVisible(true);
	}
	public static void main(String[] args){
		SwingTest app=new SwingTest();
		app.display();
	}
}
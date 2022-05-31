package test;

import java.awt.FlowLayout;

//import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame {

	JLabel idl = new JLabel("ID");
	JLabel pwl = new JLabel("PW");

	JTextField idf = new JTextField(10);
	JPasswordField pwf = new JPasswordField(10);

	JButton loginB = new JButton("로그인");

	private void buta() {
		loginB.addActionListener(e -> {
			if (idf.getText().equals("1234")) {
				if (pwf.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null, "환영합니다 " + idf.getText() + " 님", "환영합니다",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}

	private void setwindow() {
		setSize(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	private void lay() {
		add(idl);
		add(idf);
		add(pwl);
		add(pwf);
		add(loginB);
	}

	public login() {
		buta();
		lay();
		setwindow();
	}

	public static void main(String[] args) {

		new login();

//		String id,pw;
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("ID:");
//		id = sc.nextLine();
//	
//		System.out.print("PW:");
//		pw = sc.nextLine();
//
//		if(id.equals("1234")) {
//			if (pw.equals("1234")) {
//				System.out.println("환영합니다 "+id+" 님");
//			}
//		}

	}

}

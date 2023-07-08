//package ATM;
//
//import java.awt.Font;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class Fail {
//	public void failView(String str) {
//		Commons commons = new Commons();
//		JFrame frame =(JFrame) commons.Frame();
//
//		//-----------------FAIL------------------
//		JLabel fail = new JLabel("YOUR TRANSACTIONS FAILED!!!");
//		fail.setBounds(0, 280, 600, 50);
//		fail.setHorizontalAlignment(JLabel.CENTER);
//		fail.setFont(new Font("Rockwell", Font.BOLD, 25));
//		JLabel st = new JLabel(str);
//		st.setBounds(0, 320, 600, 50);
//		st.setHorizontalAlignment(JLabel.CENTER);
//		st.setFont(new Font("Rockwell", Font.BOLD, 25));
//		frame.add(st);
//		frame.add(fail);
//		//-----------------------------------------
//
//		frame.setVisible(true);
//	}
//}

package ATM;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fail {
	public void failView(String str) {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();

		//-----------------FAIL------------------
		JLabel fail = new JLabel("YOUR TRANSACTIONS FAILED!!!");
		fail.setBounds(0, 280, 600, 50);
		fail.setHorizontalAlignment(JLabel.CENTER);
		fail.setFont(new Font("Rockwell", Font.BOLD, 25));
		JLabel st = new JLabel(str);
		st.setBounds(0, 320, 600, 50);
		st.setHorizontalAlignment(JLabel.CENTER);
		st.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(st);
		frame.add(fail);
		//-----------------------------------------


		// Back Button
		JButton backButton = new JButton("Back");
		backButton.setBounds(50, 500, 110, 35);
		backButton.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(backButton);

		frame.setVisible(true);
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.loginView();
				frame.dispose();
			}
		});

		frame.setVisible(true);
	}
}

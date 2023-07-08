package ATM;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class Success {
	public void transactionSuccessView(int id) {
		Home home = new Home();
		Commons commons = new Commons();
		JFrame frame = (JFrame) commons.Frame();

		// -----------------SUCCESS------------------
		JLabel sucss = new JLabel("TRANSACTION SUCCESS.");
		sucss.setBounds(0, 280, 600, 50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sucss);
		// -----------------------------------------
//		home.homeView(id);
		frame.setVisible(true);
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
	}

	public void detailView(String num, String pin) {
		Commons commons = new Commons();
		JFrame frame = (JFrame) commons.Frame();

		// -----------------DETAILS------------------
		JLabel sucss = new JLabel("REMEMBER THE DETAILS!!!");
		sucss.setBounds(0, 200, 600, 50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sucss);
		JTextField number = new JTextField("CARD NUMBER : " + num);
		number.setBounds(0, 300, 600, 50);
		number.setEditable(false);
		number.setHorizontalAlignment(JLabel.CENTER);
		number.setFont(new Font("Rockwell", Font.BOLD, 20));
		frame.add(number);
		JTextField pinno = new JTextField("DEFAULT PIN : " + pin);
		pinno.setBounds(0, 400, 600, 50);
		pinno.setHorizontalAlignment(JLabel.CENTER);
		pinno.setEditable(false);
		pinno.setFont(new Font("Rockwell", Font.BOLD, 20));
		frame.add(pinno);
		// -----------------------------------------
		frame.setVisible(true);
	}
}

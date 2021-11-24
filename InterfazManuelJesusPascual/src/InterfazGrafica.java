import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Manuel Jes\u00FAs Pascual Bernal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
	}

}

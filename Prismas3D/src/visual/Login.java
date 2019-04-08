package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import logic.ControlUsuarios;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JPasswordField txtPassw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setBounds(100, 100, 837, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.control));
		panel.setBackground(new Color(105,105,105));
		panel.setBounds(0, 0, 837, 480);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(240, 240, 240)));
		panel_1.setBounds(381, 98, 424, 342);
		panel_1.setBackground(new Color(105,105,105));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUserLogin = new JLabel("INICIAR SESI\u00D3N");
		lblUserLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserLogin.setIcon(new ImageIcon(Login.class.getResource("/resources/user (2).png")));
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserLogin.setForeground(Color.WHITE);
		lblUserLogin.setBounds(139, 42, 164, 33);
		panel_1.add(lblUserLogin);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setBackground(SystemColor.control);
		txtUser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.control));
		txtUser.setBounds(134, 131, 210, 22);
		panel_1.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassw = new JPasswordField();
		txtPassw.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPassw.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassw.setBackground(SystemColor.control);
		txtPassw.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.control));
		txtPassw.setSelectionColor(Color.WHITE);
		txtPassw.setEchoChar('*');
		txtPassw.setBounds(134, 203, 210, 22);
		panel_1.add(txtPassw);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ControlUsuarios.getInstance().confirmLogin(txtUser.getText(),txtPassw.getText())){
					Principal frame = new Principal();
					dispose();
					frame.setVisible(true);
				};
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.control));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(90, 289, 102, 23);
		btnNewButton.setBackground(new Color(105,105,105));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CERRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.control));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(257, 289, 102, 23);
		btnNewButton_1.setBackground(new Color(105,105,105));
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/resources/user (3).png")));
		lblNewLabel_2.setBounds(78, 120, 46, 42);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/resources/house-key.png")));
		lblNewLabel_3.setBounds(78, 195, 46, 42);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/resources/3d (6).png")));
		lblNewLabel.setBounds(50, 89, 270, 267);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(512, 56, 141, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setForeground(Color.WHITE);
		setUndecorated(true);
	}
}

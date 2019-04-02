package visual;

import java.awt.BorderLayout;
import javafx.scene.image.*;
import javafx.scene.paint.*; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Dialog.ModalExclusionType;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.DebugGraphics;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 423);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setName("");
		panel.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(180, 180, 180)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 708, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("REGISTRAR");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setBorder(null);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registrar rgPrisma = new Registrar();
				rgPrisma.setVisible(true);
				rgPrisma.setLocationRelativeTo(null);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.setForeground(Color.DARK_GRAY);
		mntmNewMenuItem.setBounds(34, 109, 119, 45);
		panel.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("GRAFICAR");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GraficarPrisma GrPrisma = new GraficarPrisma();
				GrPrisma.setVisible(true);
				GrPrisma.setLocationRelativeTo(null);
			}
		});
		mntmNewMenuItem_1.setBorder(null);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.setForeground(Color.DARK_GRAY);
		mntmNewMenuItem_1.setBounds(34, 154, 119, 45);
		panel.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("GEOMETR\u00CDA");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setBorder(null);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_2.setForeground(Color.DARK_GRAY);
		mntmNewMenuItem_2.setBounds(34, 199, 119, 45);
		panel.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(34, 108, 104, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(34, 289, 104, 2);
		panel.add(separator_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("CUENTAS");
		mntmNewMenuItem_3.setBackground(Color.WHITE);
		mntmNewMenuItem_3.setBorder(null);
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_3.setForeground(Color.DARK_GRAY);
		mntmNewMenuItem_3.setBounds(38, 244, 119, 45);
		panel.add(mntmNewMenuItem_3);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNombre.setBounds(276, 11, 149, 37);
		panel.add(lblNombre);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/resources/lallalaal.png")));
		lblNewLabel_1.setBounds(201, 82, 300, 224);
		panel.add(lblNewLabel_1);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblMenu.setBounds(73, 82, 46, 14);
		panel.add(lblMenu);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		
	

	}
}

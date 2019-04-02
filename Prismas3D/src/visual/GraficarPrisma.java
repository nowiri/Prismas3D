package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

public class GraficarPrisma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficarPrisma frame = new GraficarPrisma();
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
	public GraficarPrisma() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GraficarPrisma.class.getResource("/resources/geometria.png")));
		setTitle("PRISMAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 467);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.controlHighlight));
		panel.setBackground(Color.WHITE);
		panel.setBounds(389, 25, 287, 297);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel_1.setBounds(21, 264, 323, 135);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 16, 56, 18);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 34, 46, 18);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:");
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 52, 46, 18);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea lateral:");
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 70, 72, 18);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u00C1rea total:");
		lblNewLabel_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 88, 72, 18);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vol\u00FAmen:");
		lblNewLabel_5.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(10, 106, 46, 18);
		panel_1.add(lblNewLabel_5);
		
		JSlider slider = new JSlider();
		slider.setValueIsAdjusting(true);
		slider.setInheritsPopupMenu(true);
		slider.setForeground(Color.DARK_GRAY);
		slider.setToolTipText("ALTURA");
		slider.setBorder(null);
		slider.setBackground(Color.WHITE);
		slider.setPaintTicks(true);
		slider.setBounds(438, 333, 200, 62);
		contentPane.add(slider);
		
		JLabel lblSeleccionaElPrisma = new JLabel("Selecciona el prisma: ");
		lblSeleccionaElPrisma.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblSeleccionaElPrisma.setBounds(39, 40, 144, 20);
		contentPane.add(lblSeleccionaElPrisma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFocusTraversalKeysEnabled(false);
		comboBox.setIgnoreRepaint(true);
		comboBox.setOpaque(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		comboBox.setBounds(39, 83, 144, 20);
		contentPane.add(comboBox);
	}
}

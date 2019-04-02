package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registrar dialog = new Registrar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registrar() {
		setTitle("Guardar Prismas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registrar.class.getResource("/resources/geometria.png")));
		setBounds(100, 100, 546, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "BASE DEL PRISMA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(Color.WHITE);
			panel.setBounds(20, 104, 488, 91);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Cuadrado");
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setBackground(Color.WHITE);
			rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnNewRadioButton.setBounds(25, 19, 119, 23);
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Rect\u00E1ngulo");
			rdbtnNewRadioButton_1.setBackground(Color.WHITE);
			rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnNewRadioButton_1.setBounds(25, 49, 119, 23);
			panel.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnTringulo = new JRadioButton("Tri\u00E1ngulo");
			rdbtnTringulo.setBackground(Color.WHITE);
			rdbtnTringulo.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnTringulo.setBounds(198, 19, 119, 23);
			panel.add(rdbtnTringulo);
			
			JRadioButton rdbtnTrapecio = new JRadioButton("Trapecio");
			rdbtnTrapecio.setBackground(Color.WHITE);
			rdbtnTrapecio.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnTrapecio.setBounds(198, 49, 119, 23);
			panel.add(rdbtnTrapecio);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Rombo");
			rdbtnNewRadioButton_2.setBackground(Color.WHITE);
			rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnNewRadioButton_2.setBounds(373, 19, 97, 23);
			panel.add(rdbtnNewRadioButton_2);
		}
		
		JLabel lblNewLabel = new JLabel("Prismas");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 11, 111, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(20, 52, 70, 14);
		contentPanel.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 11));
		textField.setBounds(114, 50, 111, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAltura.setBounds(255, 53, 46, 14);
		contentPanel.add(lblAltura);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 11));
		spinner.setBounds(311, 50, 111, 20);
		contentPanel.add(spinner);
		
		JPanel panelCuadrado = new JPanel();
		panelCuadrado.setBackground(Color.WHITE);
		panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCuadrado.setBounds(20, 206, 488, 151);
		contentPanel.add(panelCuadrado);
		
		JPanel panelRect = new JPanel();
		panelRect.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRect.setBackground(Color.WHITE);
		panelRect.setBounds(20, 206, 488, 151);
		contentPanel.add(panelRect);
		
		JPanel panelTriang = new JPanel();
		panelTriang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTriang.setBackground(Color.WHITE);
		panelTriang.setBounds(20, 206, 488, 151);
		contentPanel.add(panelTriang);
		
		JPanel panelTrap = new JPanel();
		panelTrap.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTrap.setBackground(Color.WHITE);
		panelTrap.setBounds(20, 206, 488, 151);
		contentPanel.add(panelTrap);
		
		JPanel panelRombo = new JPanel();
		panelRombo.setBackground(Color.WHITE);
		panelRombo.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRombo.setBounds(20, 206, 488, 151);
		contentPanel.add(panelRombo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				okButton.setBackground(Color.WHITE);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("-Salir-");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				cancelButton.setBackground(Color.WHITE);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

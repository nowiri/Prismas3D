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
import javax.swing.SpinnerNumberModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Registrar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JRadioButton botonCuadrado;
	private JRadioButton botonRect;
	JRadioButton botonTriang;
	JRadioButton rdbtnTrapecio;
	JRadioButton botonRombo;
    JPanel panelCuadrado;
	JPanel panelRect;
	JPanel panelTriang;
	JPanel panelTrap;
	JPanel panelRombo;

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
		contentPanel.setBorder(new LineBorder(Color.DARK_GRAY));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "BASE DEL PRISMA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(Color.WHITE);
			panel.setBounds(20, 94, 488, 91);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			botonCuadrado = new JRadioButton("Cuadrado");
			botonCuadrado.setSelected(true);
			
			botonCuadrado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						botonCuadrado.setSelected(true);
						botonRect.setSelected(false);
						botonTriang.setSelected(false);
						rdbtnTrapecio.setSelected(false);
						botonRombo.setSelected(false);
						panelCuadrado.setVisible(true);
						panelRect.setVisible(false);
						panelTriang.setVisible(false);
						panelTrap.setVisible(false);
						panelRombo.setVisible(false);
						
					
				
				}
			});
			botonCuadrado.setBackground(Color.WHITE);
			botonCuadrado.setFont(new Font("Arial", Font.BOLD, 11));
			botonCuadrado.setBounds(25, 19, 119, 23);
			panel.add(botonCuadrado);
			
			botonRect = new JRadioButton("Rect\u00E1ngulo");
			botonRect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					botonCuadrado.setSelected(false);
					botonRect.setSelected(true);
					botonTriang.setSelected(false);
					rdbtnTrapecio.setSelected(false);
					botonRombo.setSelected(false);
					panelCuadrado.setVisible(false);
					panelRect.setVisible(true);
					panelTriang.setVisible(false);
					panelTrap.setVisible(false);
					panelRombo.setVisible(false);
				}
			});
			botonRect.setBackground(Color.WHITE);
			botonRect.setFont(new Font("Arial", Font.BOLD, 11));
			botonRect.setBounds(25, 49, 119, 23);
			panel.add(botonRect);
			
			
			botonTriang = new JRadioButton("Tri\u00E1ngulo");
			botonTriang.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					botonCuadrado.setSelected(false);
					botonRect.setSelected(false);
					botonTriang.setSelected(true);
					rdbtnTrapecio.setSelected(false);
					botonRombo.setSelected(false);
					panelCuadrado.setVisible(false);
					panelRect.setVisible(false);
					panelTriang.setVisible(true);
					panelTrap.setVisible(false);
					panelRombo.setVisible(false);
				}
			});
			botonTriang.setBackground(Color.WHITE);
			botonTriang.setFont(new Font("Arial", Font.BOLD, 11));
			botonTriang.setBounds(198, 19, 119, 23);
			panel.add(botonTriang);
			
			rdbtnTrapecio = new JRadioButton("Trapecio");
			rdbtnTrapecio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					botonCuadrado.setSelected(false);
					botonRect.setSelected(false);
					botonTriang.setSelected(false);
					rdbtnTrapecio.setSelected(true);
					botonRombo.setSelected(false);
					panelCuadrado.setVisible(false);
					panelRect.setVisible(false);
					panelTriang.setVisible(false);
					panelTrap.setVisible(true);
					panelRombo.setVisible(false);
				}
			});
			rdbtnTrapecio.setBackground(Color.WHITE);
			rdbtnTrapecio.setFont(new Font("Arial", Font.BOLD, 11));
			rdbtnTrapecio.setBounds(198, 49, 119, 23);
			panel.add(rdbtnTrapecio);
			
			botonRombo = new JRadioButton("Rombo");
			botonRombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					botonCuadrado.setSelected(false);
					botonRect.setSelected(false);
					botonTriang.setSelected(false);
					rdbtnTrapecio.setSelected(false);
					botonRombo.setSelected(true);
					panelCuadrado.setVisible(false);
					panelRect.setVisible(false);
					panelTriang.setVisible(false);
					panelTrap.setVisible(false);
					panelRombo.setVisible(true);
				}
			});
			botonRombo.setBackground(Color.WHITE);
			botonRombo.setFont(new Font("Arial", Font.BOLD, 11));
			botonRombo.setBounds(373, 19, 97, 23);
			panel.add(botonRombo);
		}
		
		JLabel lblNewLabel = new JLabel("Prismas");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 11, 111, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(30, 52, 70, 14);
		contentPanel.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 11));
		textField.setBounds(114, 50, 111, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAltura.setBounds(286, 52, 46, 14);
		contentPanel.add(lblAltura);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setFont(new Font("Arial", Font.PLAIN, 11));
		spinner.setBounds(357, 50, 111, 20);
		contentPanel.add(spinner);
		
		panelCuadrado = new JPanel();
		panelCuadrado.setBackground(Color.WHITE);
		panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCuadrado.setBounds(20, 196, 488, 151);
		contentPanel.add(panelCuadrado);
		panelCuadrado.setLayout(null);
		
		JLabel lblCuadrado = new JLabel("V\u00E9rtices: ");
		lblCuadrado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCuadrado.setBounds(25, 28, 69, 14);
		panelCuadrado.add(lblCuadrado);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setFont(new Font("Arial", Font.BOLD, 11));
		lblX.setBounds(25, 51, 46, 14);
		panelCuadrado.add(lblX);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setBounds(65, 48, 29, 20);
		panelCuadrado.add(spinner_1);
		
		JLabel lblY = new JLabel("Y1:");
		lblY.setFont(new Font("Arial", Font.BOLD, 11));
		lblY.setBounds(108, 51, 46, 14);
		panelCuadrado.add(lblY);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_2.setBounds(148, 48, 29, 20);
		panelCuadrado.add(spinner_2);
		
		JLabel lblLados = new JLabel("Longitudes: ");
		lblLados.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLados.setBounds(302, 29, 69, 14);
		panelCuadrado.add(lblLados);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(234, 30, 1, 97);
		panelCuadrado.add(separator);
		
		JLabel lblLadoA = new JLabel("Lado A:");
		lblLadoA.setFont(new Font("Arial", Font.BOLD, 11));
		lblLadoA.setBounds(255, 51, 46, 14);
		panelCuadrado.add(lblLadoA);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(312, 48, 29, 20);
		panelCuadrado.add(spinner_3);
		
		panelRect = new JPanel();
		panelRect.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRect.setBackground(Color.WHITE);
		panelRect.setBounds(20, 196, 488, 151);
		contentPanel.add(panelRect);
		
		JLabel lblNewLabel_1 = new JLabel("rectangulo");
		panelRect.add(lblNewLabel_1);
		
		panelTriang = new JPanel();
		panelTriang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTriang.setBackground(Color.WHITE);
		panelTriang.setBounds(20, 196, 488, 151);
		contentPanel.add(panelTriang);
		
		JLabel lblNewLabel_2 = new JLabel("triangulo");
		panelTriang.add(lblNewLabel_2);
		
		panelTrap = new JPanel();
		panelTrap.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTrap.setBackground(Color.WHITE);
		panelTrap.setBounds(20, 196, 488, 151);
		contentPanel.add(panelTrap);
		
		JLabel lblNewLabel_3 = new JLabel("trapecio");
		panelTrap.add(lblNewLabel_3);
		
		panelRombo = new JPanel();
		panelRombo.setBackground(Color.WHITE);
		panelRombo.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRombo.setBounds(20, 196, 488, 151);
		contentPanel.add(panelRombo);
		
		JLabel lblNewLabel_4 = new JLabel("rombo");
		panelRombo.add(lblNewLabel_4);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new LineBorder(Color.DARK_GRAY));
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

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
	JPanel panelRombo;
	JPanel panelTrap;

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
		
		panelTrap = new JPanel();
		panelTrap.setLayout(null);
		panelTrap.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTrap.setBackground(Color.WHITE);
		panelTrap.setBounds(20, 196, 488, 151);
		contentPanel.add(panelTrap);
		
		JLabel label_9 = new JLabel("V\u00E9rtices: ");
		label_9.setFont(new Font("Arial", Font.PLAIN, 12));
		label_9.setBounds(25, 28, 50, 15);
		panelTrap.add(label_9);
		
		JLabel label_12 = new JLabel("X1:");
		label_12.setFont(new Font("Arial", Font.BOLD, 11));
		label_12.setBounds(25, 51, 16, 14);
		panelTrap.add(label_12);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_8.setBounds(65, 48, 29, 20);
		panelTrap.add(spinner_8);
		
		JLabel label_13 = new JLabel("Y1:");
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(108, 51, 16, 14);
		panelTrap.add(label_13);
		
		JSpinner spinner_14 = new JSpinner();
		spinner_14.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_14.setBounds(148, 48, 29, 20);
		panelTrap.add(spinner_14);
		
		JLabel label_14 = new JLabel("Longitudes: ");
		label_14.setFont(new Font("Arial", Font.PLAIN, 12));
		label_14.setBounds(262, 29, 68, 15);
		panelTrap.add(label_14);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(241, 30, 1, 97);
		panelTrap.add(separator_3);
		
		JLabel lblBaseB = new JLabel("Base B:");
		lblBaseB.setFont(new Font("Arial", Font.BOLD, 11));
		lblBaseB.setBounds(262, 51, 41, 14);
		panelTrap.add(lblBaseB);
		
		JSpinner spinner_15 = new JSpinner();
		spinner_15.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_15.setBounds(325, 48, 29, 20);
		panelTrap.add(spinner_15);
		
		JLabel label_16 = new JLabel("X2:");
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(25, 86, 16, 14);
		panelTrap.add(label_16);
		
		JSpinner spinner_16 = new JSpinner();
		spinner_16.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_16.setBounds(65, 83, 29, 20);
		panelTrap.add(spinner_16);
		
		JLabel label_17 = new JLabel("Y2:");
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(108, 86, 16, 14);
		panelTrap.add(label_17);
		
		JSpinner spinner_17 = new JSpinner();
		spinner_17.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_17.setBounds(148, 83, 29, 20);
		panelTrap.add(spinner_17);
		
		JLabel lblBaseB_1 = new JLabel("Base b:");
		lblBaseB_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblBaseB_1.setBounds(262, 83, 41, 14);
		panelTrap.add(lblBaseB_1);
		
		JSpinner spinner_18 = new JSpinner();
		spinner_18.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_18.setBounds(325, 80, 29, 20);
		panelTrap.add(spinner_18);
		
		panelTriang = new JPanel();
		panelTriang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTriang.setBackground(Color.WHITE);
		panelTriang.setBounds(20, 196, 488, 151);
		contentPanel.add(panelTriang);
		panelTriang.setLayout(null);
		
		JLabel label_5 = new JLabel("V\u00E9rtices: ");
		label_5.setBounds(25, 28, 50, 15);
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTriang.add(label_5);
		
		JLabel label_6 = new JLabel("X1:");
		label_6.setBounds(25, 51, 16, 14);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		panelTriang.add(label_6);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_9.setBounds(65, 48, 29, 20);
		panelTriang.add(spinner_9);
		
		JLabel label_7 = new JLabel("Y1:");
		label_7.setBounds(108, 51, 16, 14);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		panelTriang.add(label_7);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_10.setBounds(148, 48, 29, 20);
		panelTriang.add(spinner_10);
		
		JLabel label_8 = new JLabel("Longitudes: ");
		label_8.setBounds(262, 29, 68, 15);
		label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTriang.add(label_8);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(241, 30, 1, 97);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.BLACK);
		panelTriang.add(separator_2);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setBounds(262, 51, 41, 14);
		lblBase.setFont(new Font("Arial", Font.BOLD, 11));
		panelTriang.add(lblBase);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_11.setBounds(325, 48, 29, 20);
		panelTriang.add(spinner_11);
		
		JLabel label_10 = new JLabel("X2:");
		label_10.setBounds(25, 86, 16, 14);
		label_10.setFont(new Font("Arial", Font.BOLD, 11));
		panelTriang.add(label_10);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_12.setBounds(65, 83, 29, 20);
		panelTriang.add(spinner_12);
		
		JLabel label_11 = new JLabel("Y2:");
		label_11.setBounds(108, 86, 16, 14);
		label_11.setFont(new Font("Arial", Font.BOLD, 11));
		panelTriang.add(label_11);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_13.setBounds(148, 83, 29, 20);
		panelTriang.add(spinner_13);
		
		panelCuadrado = new JPanel();
		panelCuadrado.setBackground(Color.WHITE);
		panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCuadrado.setBounds(20, 196, 488, 151);
		contentPanel.add(panelCuadrado);
		panelCuadrado.setLayout(null);
		
		JLabel lblCuadrado = new JLabel("V\u00E9rtices: ");
		lblCuadrado.setHorizontalAlignment(SwingConstants.LEFT);
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
		lblLados.setBounds(262, 29, 69, 14);
		panelCuadrado.add(lblLados);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(241, 30, 1, 97);
		panelCuadrado.add(separator);
		
		JLabel lblLadoA = new JLabel("Lado A:");
		lblLadoA.setFont(new Font("Arial", Font.BOLD, 11));
		lblLadoA.setBounds(262, 51, 46, 14);
		panelCuadrado.add(lblLadoA);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(325, 48, 29, 20);
		panelCuadrado.add(spinner_3);
		
		panelRect = new JPanel();
		panelRect.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRect.setBackground(Color.WHITE);
		panelRect.setBounds(20, 196, 488, 151);
		contentPanel.add(panelRect);
		panelRect.setLayout(null);
		
		JLabel label = new JLabel("V\u00E9rtices: ");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(25, 28, 69, 14);
		panelRect.add(label);
		
		JLabel label_1 = new JLabel("X1:");
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(25, 51, 46, 14);
		panelRect.add(label_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_4.setBounds(65, 48, 29, 20);
		panelRect.add(spinner_4);
		
		JLabel label_2 = new JLabel("Y1:");
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(108, 51, 46, 14);
		panelRect.add(label_2);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_5.setBounds(148, 48, 29, 20);
		panelRect.add(spinner_5);
		
		JLabel label_3 = new JLabel("Longitudes: ");
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(262, 29, 69, 14);
		panelRect.add(label_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(241, 30, 1, 97);
		panelRect.add(separator_1);
		
		JLabel label_4 = new JLabel("Lado A:");
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(262, 51, 46, 14);
		panelRect.add(label_4);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_6.setBounds(325, 48, 29, 20);
		panelRect.add(spinner_6);
		
		JLabel lblLadoB = new JLabel("Lado B:");
		lblLadoB.setFont(new Font("Arial", Font.BOLD, 11));
		lblLadoB.setBounds(262, 80, 46, 14);
		panelRect.add(lblLadoB);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7.setBounds(325, 77, 29, 20);
		panelRect.add(spinner_7);
		
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
		
		panelRombo = new JPanel();
		panelRombo.setBackground(Color.WHITE);
		panelRombo.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRombo.setBounds(20, 196, 488, 151);
		contentPanel.add(panelRombo);
		
		JLabel label_15 = new JLabel("V\u00E9rtices: ");
		label_15.setFont(new Font("Arial", Font.PLAIN, 12));
		label_15.setBounds(25, 28, 69, 14);
		panelRombo.add(label_15);
		
		
		JLabel label_18 = new JLabel("X1:");
		label_18.setFont(new Font("Arial", Font.BOLD, 11));
		label_18.setBounds(25, 51, 46, 14);
		panelRombo.add(label_18);

		
		JSpinner spinner_19 = new JSpinner();
		spinner_19.setBounds(65, 48, 29, 20);
		panelRombo.add(spinner_19);
		
		JLabel label_19 = new JLabel("Y1:");
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(108, 51, 46, 14);
		panelRombo.add(label_19);
		
		JSpinner spinner_20 = new JSpinner();
		spinner_20.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_20.setBounds(148, 48, 29, 20);
		panelRombo.add(spinner_20);
		
		JLabel label_20 = new JLabel("Longitudes: ");
		label_20.setFont(new Font("Arial", Font.PLAIN, 12));
		label_20.setBounds(262, 29, 69, 14);
		panelRombo.add(label_20);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(241, 30, 1, 97);
		panelRombo.add(separator_4);
		
		JLabel label_21 = new JLabel("Lado A:");
		label_21.setFont(new Font("Arial", Font.BOLD, 11));
		label_21.setBounds(262, 51, 46, 14);
		panelRombo.add(label_21);
		
		JSpinner spinner_21 = new JSpinner();
		spinner_21.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_21.setBounds(325, 48, 29, 20);
		panelRombo.add(spinner_21);
		
		JLabel label_22 = new JLabel("Lado B:");
		label_22.setFont(new Font("Arial", Font.BOLD, 11));
		label_22.setBounds(262, 80, 46, 14);
		panelRombo.add(label_22);
		
		JSpinner spinner_22 = new JSpinner();
		spinner_22.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_22.setBounds(325, 77, 29, 20);
		panelRombo.add(spinner_22);
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

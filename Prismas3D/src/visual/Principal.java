package visual;

import java.awt.BorderLayout;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import logic.Centro;
import logic.Cuadrangular;
import logic.Rectangular;
import logic.Romboidal;
import logic.Trapezoidal;
import logic.Triangular;

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
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Principal extends JFrame {
	private JPanel pnlContenido;
	private JPanel panelGeometría;
    private JPanel panelGraficar;
    private JPanel panelPrincipal;
    private JPanel panelCuentas;
    private JPanel panelRegistrar;
	private JPanel contentPane;
    private JPanel pnlRegistrar;
	private JPanel pnlHome;
	private JPanel pnlTitulo;
	private JPanel pnlGraficar;
	private JPanel pnlGeometria;
	private JPanel pnlCuentas;
	private JTextField txtRNombre;
	private JRadioButton rdbtnCuadrado;
	private JRadioButton rdbtnRectan;
	JRadioButton rdbtnTriangulo;
	JRadioButton rdbtnTrapecio;
	JRadioButton rdbtnRombo;
    JPanel panelRect;
	JPanel panelRombo;
	JPanel panelCuadrado;
	JPanel panelTrap;
	JPanel panelTriang;

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
		setBounds(100, 100, 1141, 677);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pnlContenido = new JPanel();
		pnlContenido.setName("");
		pnlContenido.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		pnlContenido.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		pnlContenido.setForeground(Color.DARK_GRAY);
		pnlContenido.setBorder(new LineBorder(new Color(180, 180, 180)));
		pnlContenido.setBackground(Color.WHITE);
		pnlContenido.setBounds(196, 41, 929, 597);
		contentPane.add(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelPrincipal.setBackground(Color.WHITE);
		pnlContenido.add(panelPrincipal, "name_81812329842485");
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 927, 399);
		panelPrincipal.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/resources/3d-Pie-Chart1.png")));
		
		panelRegistrar = new JPanel();
		panelRegistrar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelRegistrar.setBackground(Color.WHITE);
		pnlContenido.add(panelRegistrar, "name_81816321544415");
		panelRegistrar.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 360, 861, 182);
		panelRegistrar.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		panelCuadrado = new JPanel();
		panelCuadrado.setLayout(null);
		panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCuadrado.setBackground(Color.WHITE);
		panel.add(panelCuadrado, "name_176345872090309");
		
		JLabel label_15 = new JLabel("V\u00E9rtices: ");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Arial", Font.PLAIN, 12));
		label_15.setBounds(25, 28, 69, 14);
		panelCuadrado.add(label_15);
		
		JLabel label_16 = new JLabel("X1:");
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(25, 51, 46, 14);
		panelCuadrado.add(label_16);
		
		final JSpinner spnr_x1cuad = new JSpinner();
		spnr_x1cuad.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		spnr_x1cuad.setBounds(65, 48, 29, 20);
		panelCuadrado.add(spnr_x1cuad);
		
		JLabel label_17 = new JLabel("Y1:");
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(108, 51, 46, 14);
		panelCuadrado.add(label_17);
		
		final JSpinner spnr_y1cuad = new JSpinner();
		spnr_y1cuad.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		spnr_y1cuad.setBounds(148, 48, 29, 20);
		panelCuadrado.add(spnr_y1cuad);
		
		JLabel label_18 = new JLabel("Longitudes: ");
		label_18.setFont(new Font("Arial", Font.PLAIN, 12));
		label_18.setBounds(262, 29, 69, 14);
		panelCuadrado.add(label_18);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(241, 30, 1, 97);
		panelCuadrado.add(separator_2);
		
		JLabel label_19 = new JLabel("Lado A:");
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(262, 51, 46, 14);
		panelCuadrado.add(label_19);
		
		final JSpinner spnr_ladoCuad = new JSpinner();
		spnr_ladoCuad.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_ladoCuad.setBounds(325, 48, 29, 20);
		panelCuadrado.add(spnr_ladoCuad);
		
		panelRect = new JPanel();
		panelRect.setLayout(null);
		panelRect.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRect.setBackground(Color.WHITE);
		panel.add(panelRect, "name_176345889796220");
		
		JLabel label_20 = new JLabel("V\u00E9rtices: ");
		label_20.setFont(new Font("Arial", Font.PLAIN, 12));
		label_20.setBounds(25, 28, 69, 14);
		panelRect.add(label_20);
		
		JLabel label_21 = new JLabel("X1:");
		label_21.setFont(new Font("Arial", Font.BOLD, 11));
		label_21.setBounds(25, 51, 46, 14);
		panelRect.add(label_21);
		
		final JSpinner spnr_x1rect = new JSpinner();
		spnr_x1rect.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1rect.setBounds(65, 48, 29, 20);
		panelRect.add(spnr_x1rect);
		
		JLabel label_22 = new JLabel("Y1:");
		label_22.setFont(new Font("Arial", Font.BOLD, 11));
		label_22.setBounds(108, 51, 46, 14);
		panelRect.add(label_22);
		
		final JSpinner spnr_y1rect = new JSpinner();
		spnr_y1rect.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1rect.setBounds(148, 48, 29, 20);
		panelRect.add(spnr_y1rect);
		
		JLabel label_23 = new JLabel("Longitudes: ");
		label_23.setFont(new Font("Arial", Font.PLAIN, 12));
		label_23.setBounds(262, 29, 69, 14);
		panelRect.add(label_23);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(241, 30, 1, 97);
		panelRect.add(separator_3);
		
		JLabel label_24 = new JLabel("Lado A:");
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(262, 51, 46, 14);
		panelRect.add(label_24);
		
		final JSpinner spnr_ladoArect = new JSpinner();
		spnr_ladoArect.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_ladoArect.setBounds(325, 48, 29, 20);
		panelRect.add(spnr_ladoArect);
		
		JLabel label_25 = new JLabel("Lado B:");
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(262, 80, 46, 14);
		panelRect.add(label_25);
		
		final JSpinner spnr_ladoBrect = new JSpinner();
		spnr_ladoBrect.setBounds(325, 77, 29, 20);
		panelRect.add(spnr_ladoBrect);
		
		panelRombo = new JPanel();
		panelRombo.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRombo.setBackground(Color.WHITE);
		panel.add(panelRombo, "name_176345907321409");
		panelRombo.setLayout(null);
		
		JLabel label_29 = new JLabel("V\u00E9rtices: ");
		label_29.setBounds(32, 31, 50, 15);
		label_29.setFont(new Font("Arial", Font.PLAIN, 12));
		panelRombo.add(label_29);
		
		JLabel label_30 = new JLabel("X1:");
		label_30.setBounds(32, 71, 16, 14);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		panelRombo.add(label_30);
		
		final JSpinner spnr_x1rombo = new JSpinner();
		spnr_x1rombo.setBounds(53, 68, 31, 20);
		spnr_x1rombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_x1rombo);
		
		JLabel label_31 = new JLabel("Y1:");
		label_31.setBounds(89, 71, 16, 14);
		label_31.setFont(new Font("Arial", Font.BOLD, 11));
		panelRombo.add(label_31);
		
		final JSpinner spnr_y1rombo = new JSpinner();
		spnr_y1rombo.setBounds(110, 68, 31, 20);
		spnr_y1rombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_y1rombo);
		
		JLabel label_32 = new JLabel("Longitudes: ");
		label_32.setBounds(402, 31, 68, 15);
		label_32.setFont(new Font("Arial", Font.PLAIN, 12));
		panelRombo.add(label_32);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(402, 75, 2, 0);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBackground(Color.BLACK);
		panelRombo.add(separator_4);
		
		JLabel lblBaseB = new JLabel("Base D");
		lblBaseB.setBounds(402, 68, 41, 14);
		lblBaseB.setFont(new Font("Arial", Font.BOLD, 11));
		panelRombo.add(lblBaseB);
		
		final JSpinner spnr_Drombo = new JSpinner();
		spnr_Drombo.setBounds(455, 65, 31, 20);
		spnr_Drombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_Drombo);
		
		JLabel lblBaseB_1 = new JLabel("Base d:");
		lblBaseB_1.setBounds(402, 103, 40, 14);
		lblBaseB_1.setFont(new Font("Arial", Font.BOLD, 11));
		panelRombo.add(lblBaseB_1);
		
		final JSpinner spnr_drombo = new JSpinner();
		spnr_drombo.setBounds(455, 100, 31, 20);
		spnr_drombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_drombo);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.LIGHT_GRAY);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(276, 31, 1, 97);
		panelRombo.add(separator_5);
		
		panelTrap = new JPanel();
		panel.add(panelTrap, "name_176345925246418");
		panelTrap.setLayout(null);
		panelTrap.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTrap.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("V\u00E9rtices: ");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(91, 51, 50, 15);
		panelTrap.add(label);
		
		JLabel label_1 = new JLabel("X1:");
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(91, 74, 16, 14);
		panelTrap.add(label_1);
		
		final JSpinner spnr_x1trap = new JSpinner();
		spnr_x1trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1trap.setBounds(131, 71, 29, 20);
		panelTrap.add(spnr_x1trap);
		
		JLabel label_2 = new JLabel("Y1:");
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(174, 74, 16, 14);
		panelTrap.add(label_2);
		
		final JSpinner spnr_y1trap = new JSpinner();
		spnr_y1trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1trap.setBounds(214, 71, 29, 20);
		panelTrap.add(spnr_y1trap);
		
		JLabel label_3 = new JLabel("Longitudes: ");
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(542, 51, 68, 15);
		panelTrap.add(label_3);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.BLACK);
		separator.setBounds(384, 40, 1, 97);
		panelTrap.add(separator);
		
		JLabel label_4 = new JLabel("Base B:");
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(542, 73, 41, 14);
		panelTrap.add(label_4);
		
		final JSpinner spnr_Btrap = new JSpinner();
		spnr_Btrap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_Btrap.setBounds(605, 70, 29, 20);
		panelTrap.add(spnr_Btrap);
		
		JLabel label_5 = new JLabel("X2:");
		label_5.setFont(new Font("Arial", Font.BOLD, 11));
		label_5.setBounds(91, 109, 16, 14);
		panelTrap.add(label_5);
		
		final JSpinner spnr_x2trap = new JSpinner();
		spnr_x2trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x2trap.setBounds(131, 106, 29, 20);
		panelTrap.add(spnr_x2trap);
		
		JLabel label_6 = new JLabel("Y2:");
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(174, 109, 16, 14);
		panelTrap.add(label_6);
		
		final JSpinner spnr_y2trap = new JSpinner();
		spnr_y2trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y2trap.setBounds(214, 106, 29, 20);
		panelTrap.add(spnr_y2trap);
		
		JLabel label_7 = new JLabel("Base b:");
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(542, 105, 41, 14);
		panelTrap.add(label_7);
		
		final JSpinner spnr_btrap = new JSpinner();
		spnr_btrap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_btrap.setBounds(605, 102, 29, 20);
		panelTrap.add(spnr_btrap);
		
		panelTriang = new JPanel();
		panel.add(panelTriang, "name_176822385533174");
		panelTriang.setLayout(null);
		panelTriang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTriang.setBackground(Color.WHITE);
		
		JLabel label_8 = new JLabel("V\u00E9rtices: ");
		label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		label_8.setBounds(25, 28, 50, 15);
		panelTriang.add(label_8);
		
		JLabel label_9 = new JLabel("X1:");
		label_9.setFont(new Font("Arial", Font.BOLD, 11));
		label_9.setBounds(25, 51, 16, 14);
		panelTriang.add(label_9);
		
		final JSpinner spnr_x1trian = new JSpinner();
		spnr_x1trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1trian.setBounds(65, 48, 29, 20);
		panelTriang.add(spnr_x1trian);
		
		JLabel label_10 = new JLabel("Y1:");
		label_10.setFont(new Font("Arial", Font.BOLD, 11));
		label_10.setBounds(108, 51, 16, 14);
		panelTriang.add(label_10);
		
		final JSpinner spnr_y1trian = new JSpinner();
		spnr_y1trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1trian.setBounds(148, 48, 29, 20);
		panelTriang.add(spnr_y1trian);
		
		JLabel label_11 = new JLabel("Longitudes: ");
		label_11.setFont(new Font("Arial", Font.PLAIN, 12));
		label_11.setBounds(262, 29, 68, 15);
		panelTriang.add(label_11);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(241, 30, 1, 97);
		panelTriang.add(separator_1);
		
		JLabel label_12 = new JLabel("Base:");
		label_12.setFont(new Font("Arial", Font.BOLD, 11));
		label_12.setBounds(262, 51, 41, 14);
		panelTriang.add(label_12);
		
		final JSpinner spnr_basetrian = new JSpinner();
		spnr_basetrian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_basetrian.setBounds(325, 48, 29, 20);
		panelTriang.add(spnr_basetrian);
		
		JLabel label_13 = new JLabel("X2:");
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(25, 86, 16, 14);
		panelTriang.add(label_13);
		
		final JSpinner spnr_x2trian = new JSpinner();
		spnr_x2trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x2trian.setBounds(65, 83, 29, 20);
		panelTriang.add(spnr_x2trian);
		
		JLabel label_14 = new JLabel("Y2:");
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(108, 86, 16, 14);
		panelTriang.add(label_14);
		
		final JSpinner spnr_y2trian = new JSpinner();
		spnr_y2trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y2trian.setBounds(148, 83, 29, 20);
		panelTriang.add(spnr_y2trian);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 201, 845, 91);
		panelRegistrar.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "BASE DEL PRISMA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		
		rdbtnCuadrado = new JRadioButton("Cuadrado");
		rdbtnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnCuadrado.setSelected(true);
				rdbtnRectan.setSelected(false);
				rdbtnTriangulo.setSelected(false);
				rdbtnTrapecio.setSelected(false);
				rdbtnRombo.setSelected(false);
				panelRect.setVisible(false);
				panelRombo.setVisible(false);
				panelCuadrado.setVisible(true);
				panelTriang.setVisible(false);
				panelTrap.setVisible(false);
				
			}
		});
		rdbtnCuadrado.setSelected(true);
		rdbtnCuadrado.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnCuadrado.setBackground(Color.WHITE);
		rdbtnCuadrado.setBounds(25, 19, 119, 23);
		panel_5.add(rdbtnCuadrado);
		
		rdbtnRectan = new JRadioButton("Rect\u00E1ngulo");
		rdbtnRectan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCuadrado.setSelected(false);
				rdbtnRectan.setSelected(true);
				rdbtnTriangulo.setSelected(false);
				rdbtnTrapecio.setSelected(false);
				rdbtnRombo.setSelected(false);
				panelRect.setVisible(true);
				panelRombo.setVisible(false);
				panelCuadrado.setVisible(false);
				panelTriang.setVisible(false);
				panelTrap.setVisible(false);
			}
		});
		rdbtnRectan.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnRectan.setBackground(Color.WHITE);
		rdbtnRectan.setBounds(25, 49, 119, 23);
		panel_5.add(rdbtnRectan);
		
		 rdbtnTriangulo = new JRadioButton("Tri\u00E1ngulo");
		 rdbtnTriangulo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		rdbtnCuadrado.setSelected(false);
		 		rdbtnRectan.setSelected(false);
		 		rdbtnTriangulo.setSelected(true);
		 		rdbtnTrapecio.setSelected(false);
		 		rdbtnRombo.setSelected(false);
		 		panelRect.setVisible(false);
		 		panelRombo.setVisible(false);
		 		panelCuadrado.setVisible(false);
		 		panelTriang.setVisible(true);
		 		panelTrap.setVisible(false);
		 	}
		 });
		 rdbtnTriangulo.setFont(new Font("Arial", Font.BOLD, 11));
		 rdbtnTriangulo.setBackground(Color.WHITE);
		 rdbtnTriangulo.setBounds(198, 19, 119, 23);
		 panel_5.add(rdbtnTriangulo);
		 
		 rdbtnTrapecio = new JRadioButton("Trapecio");
		 rdbtnTrapecio.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		rdbtnCuadrado.setSelected(false);
		 		rdbtnRectan.setSelected(false);
		 		rdbtnTriangulo.setSelected(false);
		 		rdbtnTrapecio.setSelected(true);
		 		rdbtnRombo.setSelected(false);
		 		panelRect.setVisible(false);
		 		panelRombo.setVisible(false);
		 		panelCuadrado.setVisible(false);
		 		panelTriang.setVisible(false);
		 		panelTrap.setVisible(true);
		 	}
		 });
		 rdbtnTrapecio.setFont(new Font("Arial", Font.BOLD, 11));
		 rdbtnTrapecio.setBackground(Color.WHITE);
		 rdbtnTrapecio.setBounds(198, 49, 119, 23);
		 panel_5.add(rdbtnTrapecio);
		 
		 rdbtnRombo = new JRadioButton("Rombo");
		 rdbtnRombo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		rdbtnCuadrado.setSelected(false);
		 		rdbtnRectan.setSelected(false);
		 		rdbtnTriangulo.setSelected(false);
		 		rdbtnTrapecio.setSelected(false);
		 		rdbtnRombo.setSelected(true);
		 		panelRect.setVisible(false);
		 		panelRombo.setVisible(true);
		 		panelCuadrado.setVisible(false);
		 		panelTriang.setVisible(false);
		 		panelTrap.setVisible(false);
		 	}
		 });
		 rdbtnRombo.setFont(new Font("Arial", Font.BOLD, 11));
		 rdbtnRombo.setBackground(Color.WHITE);
		 rdbtnRombo.setBounds(373, 19, 97, 23);
		 panel_5.add(rdbtnRombo);
		 
		 JLabel label_26 = new JLabel("Prismas");
		 label_26.setBounds(125, 48, 111, 30);
		 panelRegistrar.add(label_26);
		 label_26.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		 
		 JLabel label_27 = new JLabel("Nombre:");
		 label_27.setBounds(122, 108, 70, 14);
		 panelRegistrar.add(label_27);
		 label_27.setFont(new Font("Arial", Font.PLAIN, 12));
		 
		 txtRNombre = new JTextField();
		 txtRNombre.setText("Mi_prisma");
		 txtRNombre.setBounds(200, 108, 111, 20);
		 panelRegistrar.add(txtRNombre);
		 txtRNombre.setFont(new Font("Arial", Font.PLAIN, 11));
		 txtRNombre.setColumns(10);
		 
		 JLabel label_28 = new JLabel("Altura:");
		 label_28.setBounds(394, 107, 46, 14);
		 panelRegistrar.add(label_28);
		 label_28.setFont(new Font("Arial", Font.PLAIN, 12));
		 
		 final JSpinner spnrRAltura = new JSpinner();
		 spnrRAltura.setBounds(483, 105, 111, 20);
		 panelRegistrar.add(spnrRAltura);
		 spnrRAltura.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		 spnrRAltura.setFont(new Font("Arial", Font.PLAIN, 11));
		 
		 JButton btnNewButton = new JButton("Guardar");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		int flag = -1; //indica que tipo de base se ha seleccionado
		 		if(rdbtnCuadrado.isSelected())
		 			flag = 0;
		 		if(rdbtnRectan.isSelected())
		 			flag = 1;
		 		if(rdbtnRombo.isSelected())
		 			flag = 2;
		 		if(rdbtnTrapecio.isSelected())
		 			flag = 3;
		 		if(rdbtnTriangulo.isSelected())
		 			flag = 4;
		 		
		 		float altura,x1,y1,x2,y2,lado,ladoA,ladoB,B,b,D,d,base; //variables que contienen los datos para la creacion de prismas
		 		String nombre;
		 		
		 		switch(flag) { //para saber en que elementos buscar los datos, dependiendo del tipo de base seleccionada
		 		case 0://cuadrado
		 			try {
		 				nombre = txtRNombre.getText();
		 				altura = Float.parseFloat(spnrRAltura.getValue().toString());
		 				x1 = Float.parseFloat(spnr_x1cuad.getValue().toString());
		 				y1 = Float.parseFloat(spnr_y1cuad.getValue().toString());
		 				lado = Float.parseFloat(spnr_ladoCuad.getValue().toString());
		 				Cuadrangular aux = new Cuadrangular(altura,x1,y1,lado,nombre);
			 			Centro.getInstance().addPrisma(aux);
			 			JOptionPane.showMessageDialog(null, "Se ha creado el prisma cuadrangular con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
			 			spnrRAltura.setValue(0);
			 			spnr_x1cuad.setValue(0);
			 			spnr_y1cuad.setValue(0);
			 			spnr_ladoCuad.setValue(0);			
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		case 1://rectangulo
		 			try {
		 				nombre = txtRNombre.getText();
		 				altura = Float.parseFloat(spnrRAltura.getValue().toString());
			 			x1 = Float.parseFloat(spnr_x1rect.getValue().toString());
			 			y1 = Float.parseFloat(spnr_y1rect.getValue().toString());
			 			ladoA = Float.parseFloat(spnr_ladoArect.getValue().toString());
			 			ladoB = Float.parseFloat(spnr_ladoBrect.getValue().toString());
			 			Rectangular aux = new Rectangular(altura,x1,y1,ladoA,ladoB,nombre);
			 			Centro.getInstance().addPrisma(aux);
			 			JOptionPane.showMessageDialog(null, "Se ha creado el prisma rectangular con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
			 			spnrRAltura.setValue(0);
			 			spnr_x1rect.setValue(0);
			 			spnr_y1rect.setValue(0);
			 			spnr_ladoArect.setValue(0);
			 			spnr_ladoBrect.setValue(0);
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		case 2://rombo
		 			try {
		 				nombre = txtRNombre.getText();
		 				altura = Float.parseFloat(spnrRAltura.getValue().toString());
			 			x1 = Float.parseFloat(spnr_x1rombo.getValue().toString());
			 			y1 = Float.parseFloat(spnr_y1rombo.getValue().toString());
			 			D = Float.parseFloat(spnr_Drombo.getValue().toString());
			 			d = Float.parseFloat(spnr_drombo.getValue().toString());
			 			Romboidal aux = new Romboidal(altura,x1,y1,D,d,nombre);
			 			Centro.getInstance().addPrisma(aux);
			 			JOptionPane.showMessageDialog(null, "Se ha creado el prisma romboidal con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
			 			spnrRAltura.setValue(0);
			 			spnr_x1rombo.setValue(0);
			 			spnr_y1rombo.setValue(0);
			 			spnr_Drombo.setValue(0);
			 			spnr_drombo.setValue(0);
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		case 3://trapecio
		 			try {
		 				nombre = txtRNombre.getText();
		 				altura = Float.parseFloat(spnrRAltura.getValue().toString());
			 			x1 = Float.parseFloat(spnr_x1trap.getValue().toString());
			 			y1 = Float.parseFloat(spnr_y1trap.getValue().toString());
			 			x2 = Float.parseFloat(spnr_x2trap.getValue().toString());
			 			y2 = Float.parseFloat(spnr_y2trap.getValue().toString());
			 			B = Float.parseFloat(spnr_Btrap.getValue().toString());
			 			b = Float.parseFloat(spnr_btrap.getValue().toString());
			 			Trapezoidal aux = new Trapezoidal(altura,x1,y1,x2,y2,B,b,nombre);
			 			Centro.getInstance().addPrisma(aux);
			 			JOptionPane.showMessageDialog(null, "Se ha creado el prisma trapezoidal con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
			 			spnrRAltura.setValue(0);
			 			spnr_x1trap.setValue(0);
			 			spnr_y1trap.setValue(0);
			 			spnr_x2trap.setValue(0);
			 			spnr_y2trap.setValue(0);
			 			spnr_Btrap.setValue(0);
			 			spnr_btrap.setValue(0);
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		case 4://triangulo
		 			try {
		 				nombre = txtRNombre.getText();
		 				altura = Float.parseFloat(spnrRAltura.getValue().toString());
			 			x1 = Float.parseFloat(spnr_x1trian.getValue().toString());
			 			y1 = Float.parseFloat(spnr_y1trian.getValue().toString());
			 			x2 = Float.parseFloat(spnr_x2trian.getValue().toString());
			 			y2 = Float.parseFloat(spnr_y2trian.getValue().toString());
			 			base = Float.parseFloat(spnr_basetrian.getValue().toString());
			 			Triangular aux = new Triangular(altura,x1,y1,x2,y2,base,nombre);
			 			Centro.getInstance().addPrisma(aux);
			 			JOptionPane.showMessageDialog(null, "Se ha creado el prisma triangular con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
			 			spnrRAltura.setValue(0);
			 			spnr_x1trian.setValue(0);
			 			spnr_y1trian.setValue(0);
			 			spnr_x2trian.setValue(0);
			 			spnr_y2trian.setValue(0);
			 			spnr_basetrian.setValue(0);
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		}
		 		
		 	}
		 });
		 btnNewButton.setBounds(806, 553, 89, 23);
		 panelRegistrar.add(btnNewButton);
		
		panelGraficar = new JPanel();
		panelGraficar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelGraficar.setBackground(Color.WHITE);
		pnlContenido.add(panelGraficar, "name_81819637267776");
		panelGraficar.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("GRAFICAR");
		lblNewLabel_4.setBounds(0, 0, 132, 14);
		panelGraficar.add(lblNewLabel_4);
		
		panelGeometría = new JPanel();
		panelGeometría.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelGeometría.setBackground(Color.WHITE);
		pnlContenido.add(panelGeometría, "name_81822588113893");
		panelGeometría.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("GEOMETRIA");
		lblNewLabel_6.setBounds(0, 0, 129, 14);
		panelGeometría.add(lblNewLabel_6);
		
		panelCuentas = new JPanel();
		panelCuentas.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelCuentas.setBackground(Color.WHITE);
		pnlContenido.add(panelCuentas, "name_81826270578843");
		panelCuentas.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("CUENTAS");
		lblNewLabel_5.setEnabled(true);
		lblNewLabel_5.setBounds(0, 0, 135, 14);
		panelCuentas.add(lblNewLabel_5);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(null);
		panelMenu.setBackground(new Color(112, 128, 144));
		panelMenu.setBounds(0, 0, 197, 638);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelPrincipal);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlHome);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelPrincipal);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlHome);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
			}
		});
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 176, 109, 39);
		panelMenu.add(lblNewLabel);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("  GRAFICAR");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelGraficar);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlGraficar);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
				
				
			}
			
		
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/resources/modeling (8).png")));
		mntmNewMenuItem_1.setBounds(31, 317, 156, 45);
		panelMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.setBackground(new Color(112, 128, 144));
	//	mntmNewMenuItem_1.addActionListener(new ActionListener() {
		//public void actionPerformed(ActionEvent e) {
			/*		GraficarPrisma GrPrisma = new GraficarPrisma();
				GrPrisma.setVisible(true);
				GrPrisma.setLocationRelativeTo(null);*/
		//	}
	//	});
		mntmNewMenuItem_1.setBorder(null);
		mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.setForeground(Color.WHITE);
		
		JMenuItem mntmRegistrar = new JMenuItem(" REGISTRAR");
		mntmRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelRegistrar);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlRegistrar);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
				
			}
			
		});
		
	
		mntmRegistrar.setIcon(new ImageIcon(Principal.class.getResource("/resources/folder (2).png")));
		mntmRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		mntmRegistrar.setForeground(Color.WHITE);
		mntmRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mntmRegistrar.setBorder(null);
		mntmRegistrar.setBackground(new Color(112, 128, 144));
		mntmRegistrar.setBounds(31, 237, 156, 45);
		panelMenu.add(mntmRegistrar);
		
		JMenuItem mntmGeometria = new JMenuItem("GEOMETRIA");
		mntmGeometria.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelGeometría);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlGeometria);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
			}
			
		});
	
		mntmGeometria.setIcon(new ImageIcon(Principal.class.getResource("/resources/reading.png")));
		mntmGeometria.setHorizontalAlignment(SwingConstants.LEFT);
		mntmGeometria.setForeground(Color.WHITE);
		mntmGeometria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mntmGeometria.setBorder(null);
		mntmGeometria.setBackground(new Color(112, 128, 144));
		mntmGeometria.setBounds(31, 395, 156, 45);
		panelMenu.add(mntmGeometria);
		
		JMenuItem mntmCuentas = new JMenuItem("CUENTAS");
		mntmCuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnlContenido.removeAll();
				pnlContenido.add(panelCuentas);
				pnlContenido.repaint();
				pnlContenido.revalidate();
				pnlTitulo.removeAll();
				pnlTitulo.add(pnlCuentas);
				pnlTitulo.repaint();
				pnlTitulo.revalidate();
			}
		
		});
		mntmCuentas.setIcon(new ImageIcon(Principal.class.getResource("/resources/user.png")));
		mntmCuentas.setHorizontalAlignment(SwingConstants.LEFT);
		mntmCuentas.setForeground(Color.WHITE);
		mntmCuentas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mntmCuentas.setBorder(null);
		mntmCuentas.setBackground(new Color(112, 128, 144));
		mntmCuentas.setBounds(31, 470, 156, 45);
		panelMenu.add(mntmCuentas);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/resources/3d (1).png")));
		lblNewLabel_3.setBounds(31, 28, 130, 137);
		panelMenu.add(lblNewLabel_3);
		
		pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(0, 151, 167));
		pnlTitulo.setBounds(196, 0, 929, 41);
		contentPane.add(pnlTitulo);
		pnlTitulo.setLayout(new CardLayout(0, 0));
		
		pnlHome = new JPanel();
		pnlTitulo.add(pnlHome, "name_80703288203094");
		pnlHome.setBackground(new Color(0, 151, 167));
		pnlHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE DE LA EMPRESA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(160, 5, 500, 30);
		pnlHome.add(lblNewLabel_1);
		
		pnlRegistrar = new JPanel();
		pnlRegistrar.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlRegistrar, "name_80858031575147");
		pnlRegistrar.setLayout(new CardLayout(0, 0));
		
		JLabel lblRegistrar = new JLabel("REGISTRAR");
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlRegistrar.add(lblRegistrar, "name_81571125740572");
		
		pnlGraficar = new JPanel();
		pnlGraficar.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlGraficar, "name_80868735605440");
		pnlGraficar.setLayout(new CardLayout(0, 0));
		
		JLabel lblGraficar = new JLabel("GRAFICAR");
		lblGraficar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraficar.setForeground(Color.WHITE);
		lblGraficar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlGraficar.add(lblGraficar, "name_81575709736667");
		
		pnlGeometria = new JPanel();
		pnlGeometria.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlGeometria, "name_80875275372679");
		pnlGeometria.setLayout(new CardLayout(0, 0));
		
		JLabel lblGeometra = new JLabel("GEOMETR\u00CDA");
		lblGeometra.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeometra.setForeground(Color.WHITE);
		lblGeometra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlGeometria.add(lblGeometra, "name_81579765087775");
		
		pnlCuentas = new JPanel();
		pnlCuentas.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlCuentas, "name_81027452984221");
		pnlCuentas.setLayout(new CardLayout(0, 0));
		
		JLabel lblCuentas = new JLabel("CUENTAS");
		lblCuentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuentas.setForeground(Color.WHITE);
		lblCuentas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlCuentas.add(lblCuentas, "name_81583263617228");
		
		
		
	

	}
}

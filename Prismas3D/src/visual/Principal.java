package visual;

import java.awt.BorderLayout;

import javafx.scene.control.ComboBox;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import logic.Centro;
import logic.Cuadrangular;
import logic.Prisma;
import logic.Rectangular;
import logic.Romboidal;
import logic.StdDraw3D;
import logic.Trapezoidal;
import logic.Triangular;
import logic.Users;
import logic.StdDraw3D.Shape;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Panel;
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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JInternalFrame;


public class Principal extends JFrame implements Runnable{
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
	private JTextField txtUsuario;
	private JPasswordField txtPass;
	private JPasswordField txtPass2;
	private JComboBox comboBoxTipo;
	public JMenuItem mntmRegistrar;
	public JMenuItem mntmCuentas;
	private JTextField txtDNombre;
	private JTextField txtDBase;
	private JTextField txtDAltura;
	private JTextField txtDAreal;
	private JTextField txtAreab;
	private JTextField txtAreat;
	private JTextField txtDVolumen;
	private JComboBox cbxSelectPrism;
	private Thread h1;
	int hora, minutos, segundos;
    private Calendar calendario;
    private JLabel lblHora;
    private DefaultPieDataset data = new DefaultPieDataset();
    public final static JLabel lblGraf = new JLabel("New label");;
    private static int contador=-1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
			        cargarGraf();
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
		StdDraw3D.setBackground(StdDraw3D.GRAY);
        StdDraw3D.setInfoDisplay(false);
		setResizable(false);
		setBounds(new Rectangle(0, 0, 2147483647, 2147483647));
		setMaximizedBounds(new Rectangle(0, 0, 2147483647, 2147483647));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 720);
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
		pnlContenido.setBounds(235, 75, 1105, 616);
		contentPane.add(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelPrincipal.setBackground(Color.WHITE);
		pnlContenido.add(panelPrincipal, "name_81812329842485");
		panelPrincipal.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("\u00A1Bienvenido!");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBienvenido.setBounds(169, 104, 120, 14);
		panelPrincipal.add(lblBienvenido);
		
		try{
			JLabel lblUsuarioLogin = new JLabel(Centro.getLoginUser().getUserName());
			lblUsuarioLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblUsuarioLogin.setBounds(227, 411, 139, 14);
			panelPrincipal.add(lblUsuarioLogin);
		}catch(Exception e) {
			
		}
		
		lblHora = new JLabel("HORA");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHora.setBounds(187, 436, 85, 14);
		panelPrincipal.add(lblHora);
				
		JButton button = new JButton("Cerrar Sesi\u00F3n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login logueo = new Login();
				logueo.setVisible(true);
				logueo.setLocationRelativeTo(null);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(SystemColor.controlDkShadow);
		button.setBounds(152, 461, 154, 23);
		panelPrincipal.add(button);
		
		JLabel lblTipo = new JLabel("New label");
		
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTipo.setBounds(107, 411, 120, 14);
		try {
			lblTipo.setText(Centro.getLoginUser().getTipo()+":");
		}catch(Exception e){
			
		}

		panelPrincipal.add(lblTipo);
		
		JLabel lblImagen = new JLabel("New label");
		try {
			if(Centro.getLoginUser().getTipo().equals("Profesor")) {
				lblImagen.setIcon(new ImageIcon(Principal.class.getResource("/resources/teacher (1).png")));
			}else {
				lblImagen.setIcon(new ImageIcon(Principal.class.getResource("/resources/study.png")));
			}
		}catch(Exception e){
			
		}
		lblImagen.setBounds(97, 144, 265, 256);
		panelPrincipal.add(lblImagen);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(384, 11, 709, 592);
		panelPrincipal.add(panel_2);
		panel_2.setLayout(null);
		
	//	lblGraf = new JLabel("New label");
		lblGraf.setBounds(10, 11, 689, 570);
		panel_2.add(lblGraf);
		
		
		data.setValue("C", 40);
        data.setValue("Java", 45);
        data.setValue("Python", 15);
		JFreeChart chart = ChartFactory.createPieChart(
		         "Ejemplo Rapido de Grafico en un ChartFrame", 
		         data, 
		         true, 
		         true, 
		         false);
		
		h1 = new Thread(this);
	    h1.start();
		
		panelRegistrar = new JPanel();
		panelRegistrar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelRegistrar.setBackground(Color.WHITE);
		pnlContenido.add(panelRegistrar, "name_81816321544415");
		panelRegistrar.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(81, 360, 786, 182);
		panelRegistrar.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		panelCuadrado = new JPanel();
		panelCuadrado.setLayout(null);
		panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCuadrado.setBackground(Color.WHITE);
		panel.add(panelCuadrado, "name_176345872090309");
		
		JLabel label_15 = new JLabel("V\u00E9rtices: ");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_15.setBounds(25, 28, 69, 14);
		panelCuadrado.add(label_15);
		
		JLabel label_16 = new JLabel("X1:");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(25, 68, 46, 27);
		panelCuadrado.add(label_16);
		
		final JSpinner spnr_x1cuad = new JSpinner();
		spnr_x1cuad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x1cuad.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		spnr_x1cuad.setBounds(72, 68, 46, 27);
		panelCuadrado.add(spnr_x1cuad);
		
		JLabel label_17 = new JLabel("Y1:");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(158, 68, 46, 27);
		panelCuadrado.add(label_17);
		
		final JSpinner spnr_y1cuad = new JSpinner();
		spnr_y1cuad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y1cuad.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		spnr_y1cuad.setBounds(220, 68, 46, 27);
		panelCuadrado.add(spnr_y1cuad);
		
		JLabel label_18 = new JLabel("Longitudes: ");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_18.setBounds(428, 28, 115, 20);
		panelCuadrado.add(label_18);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(382, 27, 1, 130);
		panelCuadrado.add(separator_2);
		
		JLabel label_19 = new JLabel("Lado A:");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(428, 68, 89, 27);
		panelCuadrado.add(label_19);
		
		final JSpinner spnr_ladoCuad = new JSpinner();
		spnr_ladoCuad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_ladoCuad.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_ladoCuad.setBounds(506, 70, 46, 27);
		panelCuadrado.add(spnr_ladoCuad);
		
		panelRect = new JPanel();
		panelRect.setLayout(null);
		panelRect.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRect.setBackground(Color.WHITE);
		panel.add(panelRect, "name_176345889796220");
		
		JLabel label_20 = new JLabel("V\u00E9rtices: ");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_20.setBounds(25, 28, 69, 14);
		panelRect.add(label_20);
		
		JLabel label_21 = new JLabel("X1:");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_21.setBounds(25, 68, 46, 27);
		panelRect.add(label_21);
		
		final JSpinner spnr_x1rect = new JSpinner();
		spnr_x1rect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x1rect.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1rect.setBounds(72, 68, 46, 27);
		panelRect.add(spnr_x1rect);
		
		JLabel label_22 = new JLabel("Y1:");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_22.setBounds(158, 68, 46, 27);
		panelRect.add(label_22);
		
		final JSpinner spnr_y1rect = new JSpinner();
		spnr_y1rect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y1rect.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1rect.setBounds(220, 68, 46, 27);
		panelRect.add(spnr_y1rect);
		
		JLabel label_23 = new JLabel("Longitudes: ");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_23.setBounds(428, 28, 115, 20);
		panelRect.add(label_23);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(382, 27, 1, 130);
		panelRect.add(separator_3);
		
		JLabel label_24 = new JLabel("Lado A:");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_24.setBounds(428, 68, 89, 27);
		panelRect.add(label_24);
		
		final JSpinner spnr_ladoArect = new JSpinner();
		spnr_ladoArect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_ladoArect.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_ladoArect.setBounds(506, 70, 46, 27);
		panelRect.add(spnr_ladoArect);
		
		JLabel label_25 = new JLabel("Lado B:");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_25.setBounds(428, 116, 75, 14);
		panelRect.add(label_25);
		
		final JSpinner spnr_ladoBrect = new JSpinner();
		spnr_ladoBrect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_ladoBrect.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_ladoBrect.setBounds(506, 113, 46, 27);
		panelRect.add(spnr_ladoBrect);
		
		panelRombo = new JPanel();
		panelRombo.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRombo.setBackground(Color.WHITE);
		panel.add(panelRombo, "name_176345907321409");
		panelRombo.setLayout(null);
		
		JLabel label_29 = new JLabel("V\u00E9rtices: ");
		label_29.setBounds(25, 28, 69, 14);
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelRombo.add(label_29);
		
		JLabel label_30 = new JLabel("X1:");
		label_30.setBounds(25, 68, 46, 27);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelRombo.add(label_30);
		
		final JSpinner spnr_x1rombo = new JSpinner();
		spnr_x1rombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x1rombo.setBounds(72, 68, 46, 27);
		spnr_x1rombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_x1rombo);
		
		JLabel label_31 = new JLabel("Y1:");
		label_31.setBounds(158, 68, 46, 27);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelRombo.add(label_31);
		
		final JSpinner spnr_y1rombo = new JSpinner();
		spnr_y1rombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y1rombo.setBounds(220, 68, 46, 27);
		spnr_y1rombo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		panelRombo.add(spnr_y1rombo);
		
		JLabel label_32 = new JLabel("Longitudes: ");
		label_32.setBounds(428, 28, 115, 20);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelRombo.add(label_32);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(402, 75, 2, 0);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBackground(Color.BLACK);
		panelRombo.add(separator_4);
		
		JLabel lblBaseB = new JLabel("Base D");
		lblBaseB.setBounds(428, 68, 89, 27);
		lblBaseB.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelRombo.add(lblBaseB);
		
		final JSpinner spnr_Drombo = new JSpinner();
		spnr_Drombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_Drombo.setBounds(506, 70, 46, 27);
		spnr_Drombo.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		panelRombo.add(spnr_Drombo);
		
		JLabel lblBaseB_1 = new JLabel("Base d:");
		lblBaseB_1.setBounds(428, 116, 75, 14);
		lblBaseB_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelRombo.add(lblBaseB_1);
		
		final JSpinner spnr_drombo = new JSpinner();
		spnr_drombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_drombo.setBounds(506, 113, 46, 27);
		spnr_drombo.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		panelRombo.add(spnr_drombo);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.LIGHT_GRAY);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(382, 27, 1, 130);
		panelRombo.add(separator_5);
		
		panelTrap = new JPanel();
		panel.add(panelTrap, "name_176345925246418");
		panelTrap.setLayout(null);
		panelTrap.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTrap.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("V\u00E9rtices: ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(25, 28, 69, 14);
		panelTrap.add(label);
		
		JLabel label_1 = new JLabel("X1:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(25, 68, 46, 27);
		panelTrap.add(label_1);
		
		final JSpinner spnr_x1trap = new JSpinner();
		spnr_x1trap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x1trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1trap.setBounds(72, 68, 46, 27);
		panelTrap.add(spnr_x1trap);
		
		JLabel label_2 = new JLabel("Y1:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(158, 68, 46, 27);
		panelTrap.add(label_2);
		
		final JSpinner spnr_y1trap = new JSpinner();
		spnr_y1trap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y1trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1trap.setBounds(220, 68, 46, 27);
		panelTrap.add(spnr_y1trap);
		
		JLabel label_3 = new JLabel("Longitudes: ");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(428, 28, 115, 20);
		panelTrap.add(label_3);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.BLACK);
		separator.setBounds(382, 27, 1, 130);
		panelTrap.add(separator);
		
		JLabel label_4 = new JLabel("Base B:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(428, 68, 89, 27);
		panelTrap.add(label_4);
		
		final JSpinner spnr_Btrap = new JSpinner();
		spnr_Btrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_Btrap.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_Btrap.setBounds(506, 70, 46, 27);
		panelTrap.add(spnr_Btrap);
		
		JLabel label_5 = new JLabel("X2:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(25, 116, 46, 27);
		panelTrap.add(label_5);
		
		final JSpinner spnr_x2trap = new JSpinner();
		spnr_x2trap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x2trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x2trap.setBounds(72, 116, 46, 27);
		panelTrap.add(spnr_x2trap);
		
		JLabel label_6 = new JLabel("Y2:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(158, 116, 46, 27);
		panelTrap.add(label_6);
		
		final JSpinner spnr_y2trap = new JSpinner();
		spnr_y2trap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y2trap.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y2trap.setBounds(220, 116, 46, 27);
		panelTrap.add(spnr_y2trap);
		
		JLabel label_7 = new JLabel("Base b:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(428, 116, 75, 14);
		panelTrap.add(label_7);
		
		final JSpinner spnr_btrap = new JSpinner();
		spnr_btrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_btrap.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_btrap.setBounds(506, 113, 46, 27);
		panelTrap.add(spnr_btrap);
		
		panelTriang = new JPanel();
		panel.add(panelTriang, "name_176822385533174");
		panelTriang.setLayout(null);
		panelTriang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTriang.setBackground(Color.WHITE);
		
		JLabel label_8 = new JLabel("V\u00E9rtices: ");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(25, 28, 69, 14);
		panelTriang.add(label_8);
		
		JLabel label_9 = new JLabel("X1:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(25, 68, 46, 27);
		panelTriang.add(label_9);
		
		final JSpinner spnr_x1trian = new JSpinner();
		spnr_x1trian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x1trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x1trian.setBounds(72, 68, 46, 27);
		panelTriang.add(spnr_x1trian);
		
		JLabel label_10 = new JLabel("Y1:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setBounds(158, 68, 46, 27);
		panelTriang.add(label_10);
		
		final JSpinner spnr_y1trian = new JSpinner();
		spnr_y1trian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y1trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y1trian.setBounds(220, 68, 46, 27);
		panelTriang.add(spnr_y1trian);
		
		JLabel label_11 = new JLabel("Longitudes: ");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(428, 28, 115, 20);
		panelTriang.add(label_11);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(382, 27, 1, 130);
		panelTriang.add(separator_1);
		
		JLabel label_12 = new JLabel("Base:");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(428, 68, 89, 27);
		panelTriang.add(label_12);
		
		final JSpinner spnr_basetrian = new JSpinner();
		spnr_basetrian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_basetrian.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		spnr_basetrian.setBounds(506, 70, 46, 27);
		panelTriang.add(spnr_basetrian);
		
		JLabel label_13 = new JLabel("X2:");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(25, 116, 46, 27);
		panelTriang.add(label_13);
		
		final JSpinner spnr_x2trian = new JSpinner();
		spnr_x2trian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_x2trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_x2trian.setBounds(72, 116, 46, 27);
		panelTriang.add(spnr_x2trian);
		
		JLabel label_14 = new JLabel("Y2:");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(158, 116, 46, 27);
		panelTriang.add(label_14);
		
		final JSpinner spnr_y2trian = new JSpinner();
		spnr_y2trian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnr_y2trian.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnr_y2trian.setBounds(220, 116, 46, 27);
		panelTriang.add(spnr_y2trian);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(81, 201, 786, 58);
		panelRegistrar.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "BASE DEL PRISMA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		
		rdbtnCuadrado = new JRadioButton("Cuadrado");
		rdbtnCuadrado.setHorizontalAlignment(SwingConstants.CENTER);
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
		rdbtnCuadrado.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnCuadrado.setBackground(Color.WHITE);
		rdbtnCuadrado.setBounds(25, 19, 119, 23);
		panel_5.add(rdbtnCuadrado);
		
		rdbtnRectan = new JRadioButton("Rect\u00E1ngulo");
		rdbtnRectan.setHorizontalAlignment(SwingConstants.CENTER);
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
		rdbtnRectan.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnRectan.setBackground(Color.WHITE);
		rdbtnRectan.setBounds(476, 19, 119, 23);
		panel_5.add(rdbtnRectan);
		
		 rdbtnTriangulo = new JRadioButton("Tri\u00E1ngulo");
		 rdbtnTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
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
		 rdbtnTriangulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		 rdbtnTriangulo.setBackground(Color.WHITE);
		 rdbtnTriangulo.setBounds(177, 19, 119, 23);
		 panel_5.add(rdbtnTriangulo);
		 
		 rdbtnTrapecio = new JRadioButton("Trapecio");
		 rdbtnTrapecio.setHorizontalAlignment(SwingConstants.CENTER);
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
		 rdbtnTrapecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		 rdbtnTrapecio.setBackground(Color.WHITE);
		 rdbtnTrapecio.setBounds(632, 19, 119, 23);
		 panel_5.add(rdbtnTrapecio);
		 
		 rdbtnRombo = new JRadioButton("Rombo");
		 rdbtnRombo.setHorizontalAlignment(SwingConstants.CENTER);
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
		 rdbtnRombo.setFont(new Font("Tahoma", Font.BOLD, 14));
		 rdbtnRombo.setBackground(Color.WHITE);
		 rdbtnRombo.setBounds(327, 19, 97, 23);
		 panel_5.add(rdbtnRombo);
		 
		 JLabel label_26 = new JLabel("Prismas");
		 label_26.setForeground(Color.BLACK);
		 label_26.setBounds(81, 30, 111, 30);
		 panelRegistrar.add(label_26);
		 label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		 
		 JLabel label_27 = new JLabel("Nombre:");
		 label_27.setBounds(81, 108, 70, 14);
		 panelRegistrar.add(label_27);
		 label_27.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 
		 txtRNombre = new JTextField();
		 txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
		 txtRNombre.setBounds(161, 108, 184, 20);
		 panelRegistrar.add(txtRNombre);
		 txtRNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 txtRNombre.setColumns(10);
		 
		 JLabel label_28 = new JLabel("Altura:");
		 label_28.setBounds(525, 108, 89, 14);
		 panelRegistrar.add(label_28);
		 label_28.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 
		 final JSpinner spnrRAltura = new JSpinner();
		 spnrRAltura.setForeground(Color.DARK_GRAY);
		 spnrRAltura.setBounds(657, 108, 210, 20);
		 panelRegistrar.add(spnrRAltura);
		 spnrRAltura.setModel(new SpinnerNumberModel(new Float(1), new Float(1), null, new Float(1)));
		 spnrRAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 
		 JButton btnNewButton = new JButton("Guardar");
		 btnNewButton.setBackground(Color.LIGHT_GRAY);
		 btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
			 			spnrRAltura.setValue(1);
			 			spnr_x1cuad.setValue(0);
			 			spnr_y1cuad.setValue(0);
			 			spnr_ladoCuad.setValue(1);
			 			txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
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
			 			spnrRAltura.setValue(1);
			 			spnr_x1rect.setValue(0);
			 			spnr_y1rect.setValue(0);
			 			spnr_ladoArect.setValue(1);
			 			spnr_ladoBrect.setValue(1);
			 			txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
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
			 			spnrRAltura.setValue(1);
			 			spnr_x1rombo.setValue(0);
			 			spnr_y1rombo.setValue(0);
			 			spnr_Drombo.setValue(1);
			 			spnr_drombo.setValue(1);
			 			txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
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
			 			spnrRAltura.setValue(1);
			 			spnr_x1trap.setValue(0);
			 			spnr_y1trap.setValue(0);
			 			spnr_x2trap.setValue(0);
			 			spnr_y2trap.setValue(0);
			 			spnr_Btrap.setValue(1);
			 			spnr_btrap.setValue(1);
			 			txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
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
			 			spnrRAltura.setValue(1);
			 			spnr_x1trian.setValue(0);
			 			spnr_y1trian.setValue(0);
			 			spnr_x2trian.setValue(0);
			 			spnr_y2trian.setValue(0);
			 			spnr_basetrian.setValue(1);
			 			txtRNombre.setText("Mi_prisma_"+Integer.toString(Centro.misPrismas.size()));
		 			}catch(Exception e1) {
		 				JOptionPane.showMessageDialog(null, "Revise los datos ingresados.", "Aviso", JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			break;
		 		}
		 		cargarGraf();
		 	}
		 });
		 btnNewButton.setBounds(778, 580, 89, 23);
		 panelRegistrar.add(btnNewButton);
		
		panelGraficar = new JPanel();
		panelGraficar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panelGraficar.setBackground(Color.WHITE);
		pnlContenido.add(panelGraficar, "name_81819637267776");
		panelGraficar.setLayout(null);
		
		JPanel panelBorde = new JPanel();
		panelBorde.setBackground(Color.WHITE);
		panelBorde.setForeground(Color.BLUE);
		panelBorde.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "GR\u00C1FICA", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelBorde.setBounds(561, 11, 532, 592);
		panelGraficar.add(panelBorde);
		panelBorde.setLayout(null);
		
		Panel panelCanvas = StdDraw3D.canvasPanel;
		panelCanvas.setBounds(10, 21, 512, 560);
		panelBorde.add(panelCanvas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "DATOS DEL PRISMA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(64, 145, 432, 422);
		panelGraficar.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(32, 40, 75, 14);
		panel_1.add(lblNombre);
		
		JLabel lblBase = new JLabel("BASE:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBase.setBounds(32, 94, 58, 14);
		panel_1.add(lblBase);
		
		JLabel lblAltura = new JLabel("ALTURA:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAltura.setBounds(32, 148, 75, 14);
		panel_1.add(lblAltura);
		
		JLabel lblAreaLateral = new JLabel("AREA LATERAL:");
		lblAreaLateral.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAreaLateral.setBounds(32, 202, 102, 14);
		panel_1.add(lblAreaLateral);
		
		JLabel lblAreaTotal = new JLabel("AREA TOTAL:");
		lblAreaTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAreaTotal.setBounds(32, 310, 102, 14);
		panel_1.add(lblAreaTotal);
		
		JLabel lblAreaDeLa = new JLabel("AREA BASE:");
		lblAreaDeLa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAreaDeLa.setBounds(32, 256, 102, 14);
		panel_1.add(lblAreaDeLa);
		
		JLabel lblVo = new JLabel("VOLUMEN:");
		lblVo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVo.setBounds(32, 364, 86, 14);
		panel_1.add(lblVo);
		
		txtDNombre = new JTextField();
		txtDNombre.setBackground(Color.WHITE);
		txtDNombre.setEditable(false);
		txtDNombre.setBounds(161, 37, 231, 20);
		panel_1.add(txtDNombre);
		txtDNombre.setColumns(10);
		
		txtDBase = new JTextField();
		txtDBase.setBackground(Color.WHITE);
		txtDBase.setEditable(false);
		txtDBase.setColumns(10);
		txtDBase.setBounds(161, 91, 231, 20);
		panel_1.add(txtDBase);
		
		txtDAltura = new JTextField();
		txtDAltura.setBackground(Color.WHITE);
		txtDAltura.setForeground(Color.BLACK);
		txtDAltura.setEditable(false);
		txtDAltura.setColumns(10);
		txtDAltura.setBounds(161, 145, 231, 20);
		panel_1.add(txtDAltura);
		
		txtDAreal = new JTextField();
		txtDAreal.setBackground(Color.WHITE);
		txtDAreal.setForeground(Color.BLACK);
		txtDAreal.setEditable(false);
		txtDAreal.setColumns(10);
		txtDAreal.setBounds(161, 199, 231, 20);
		panel_1.add(txtDAreal);
		
		txtAreab = new JTextField();
		txtAreab.setBackground(Color.WHITE);
		txtAreab.setForeground(Color.BLACK);
		txtAreab.setEditable(false);
		txtAreab.setColumns(10);
		txtAreab.setBounds(161, 253, 231, 20);
		panel_1.add(txtAreab);
		
		txtAreat = new JTextField();
		txtAreat.setBackground(Color.WHITE);
		txtAreat.setForeground(Color.BLACK);
		txtAreat.setEditable(false);
		txtAreat.setColumns(10);
		txtAreat.setBounds(161, 307, 231, 20);
		panel_1.add(txtAreat);
		
		txtDVolumen = new JTextField();
		txtDVolumen.setBackground(Color.WHITE);
		txtDVolumen.setForeground(Color.BLACK);
		txtDVolumen.setEditable(false);
		txtDVolumen.setColumns(10);
		txtDVolumen.setBounds(161, 361, 231, 20);
		panel_1.add(txtDVolumen);
		
		cbxSelectPrism = new JComboBox();
		cbxSelectPrism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = cbxSelectPrism.getSelectedIndex();
				System.out.println(index);
				if(index>0) {
					Prisma prisma = Centro.misPrismas.get(index-1);
					txtDNombre.setText(prisma.getNombre());
					txtDBase.setText(prisma.getfiguraBase());
					txtDAltura.setText(Float.toString(prisma.getAltura()));
					txtDAreal.setText(Float.toString(prisma.areaLateral()));
					txtAreab.setText(Float.toString(prisma.areaBase()));
					txtAreat.setText(Float.toString(prisma.areaTotal()));
					txtDVolumen.setText(Float.toString(prisma.volumen()));
					
					if(prisma instanceof Cuadrangular) {
						constCuadrangular(((Cuadrangular) prisma).getX1(),((Cuadrangular) prisma).getY1(),((Cuadrangular) prisma).getLado(),prisma.getAltura());
					}
					if(prisma instanceof Rectangular) {
						
					}
					if(prisma instanceof Romboidal) {
						
					}
					if(prisma instanceof Trapezoidal) {
						
					}
					if(prisma instanceof Triangular) {
						
					}
				}else {
					txtDNombre.setText("");
					txtDBase.setText("");
					txtDAltura.setText("");
					txtDAreal.setText("");
					txtAreab.setText("");
					txtAreat.setText("");
					txtDVolumen.setText("");
					seleccione();
				}
			}

			private void seleccione() {
				StdDraw3D.clearOverlay();
				StdDraw3D.clear();
				StdDraw3D.setCameraOrientation(0, 0, 0);
		        StdDraw3D.setScale(-1, 1);
		        StdDraw3D.setInfoDisplay(false);
		        StdDraw3D.setPenColor(StdDraw3D.BLUE);
		        StdDraw3D.setFont(new Font("Arial", Font.BOLD, 16));
		        StdDraw3D.Shape text = StdDraw3D.text3D(0, 0, 0, "Seleccione");
		        text.scale(3.5);
		        text.move(-0.7, -0.1, 0);
		        text = StdDraw3D.combine(text);
		        StdDraw3D.camera().lookAt(text.getPosition());
		        StdDraw3D.show();
			}

			private void constCuadrangular(float x1, float y1, float dist, float alt) {
				StdDraw3D.clearOverlay();
				StdDraw3D.clear();
				StdDraw3D.setCameraOrientation(0, 0, 0);
		        
		        double x2,x3,x4;
		        double y2,y3, y4;
		        
		        x2 = x1;
		        y2 = y1 - dist;
		        x3 = x2 + dist;
		        x4 = x1 + dist;
		        y3 = y2;
		        y4 = y1; 

		        StdDraw3D.setBackground(StdDraw3D.GRAY);
		        StdDraw3D.setInfoDisplay(false);
		        StdDraw3D.Camera cam = StdDraw3D.camera();
		        if(alt>dist) {
		        	StdDraw3D.setScale(-alt,alt);
		        }else {
		            StdDraw3D.setScale(-dist,dist);
		        }
		        double xb1[] = new double[]{x1,x2,x3,x4};
		        double yb1[] = new double[]{y1,y2,y3,y4};
		        double zb1[] = new double[]{0,0,0,0};
		        Shape base1 = StdDraw3D.polygon(xb1,yb1,zb1);
		        double xb2[] = new double[]{x1,x2,x3,x4};
		        double yb2[] = new double[]{y1,y2,y3,y4};
		        double zb2[] = new double[]{alt,alt,alt,alt};
		        Shape base2 = StdDraw3D.polygon(xb2,yb2,zb2);
		        double xl1[] = new double[]{x1,x2,x2,x1};
		        double yl1[] = new double[]{y1,y2,y2,y1};
		        double zl1[] = new double[]{0,0,alt,alt};
		        Shape lado1 = StdDraw3D.polygon(xl1,yl1,zl1);
		        double xl2[] = new double[]{x2,x3,x3,x2};
		        double yl2[] = new double[]{y2,y3,y3,y2};
		        double zl2[] = new double[]{0,0,alt,alt};
		        Shape lado2 = StdDraw3D.polygon(xl2,yl2,zl2);
		        double xl3[] = new double[]{x3,x4,x4,x3};
		        double yl3[] = new double[]{y3,y4,y4,y3};
		        double zl3[] = new double[]{0,0,alt,alt};
		        Shape lado3 = StdDraw3D.polygon(xl3,yl3,zl3);
		        double xl4[] = new double[]{x4,x1,x1,x4};
		        double yl4[] = new double[]{y4,y1,y1,y4};
		        double zl4[] = new double[]{0,0,alt,alt};
		        Shape lado4 = StdDraw3D.polygon(xl4,yl4,zl4);
		        StdDraw3D.setOrbitCenter((x3-(dist/2)),y4-(dist/2),alt/2);
		        cam.setPosition((x3-(dist/2)),y4-(dist/2),alt+3);
		        StdDraw3D.show();
				
			}
		});
		cbxSelectPrism.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		cbxSelectPrism.setBounds(242, 84, 243, 20);
		panelGraficar.add(cbxSelectPrism);
		
		JLabel lblSeleccioneElPrisma = new JLabel("PRISMA A GRAFICAR:");
		lblSeleccioneElPrisma.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccioneElPrisma.setBounds(64, 86, 168, 14);
		panelGraficar.add(lblSeleccioneElPrisma);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("REGISTRAR NUEVA CUENTA");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(105,105,105));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setEnabled(true);
		lblNewLabel_5.setBounds(90, 21, 366, 53);
		panelCuentas.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de Usuario:");
		lblNewLabel_3.setForeground(new Color(105,105,105));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(119, 142, 151, 14);
		panelCuentas.add(lblNewLabel_3);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(290, 142, 183, 20);
		panelCuentas.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(SystemColor.controlDkShadow);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasea.setBounds(119, 237, 151, 14);
		panelCuentas.add(lblContrasea);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(290, 237, 183, 20);
		panelCuentas.add(txtPass);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a:");
		lblRepetirContrasea.setForeground(SystemColor.controlDkShadow);
		lblRepetirContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRepetirContrasea.setBounds(119, 327, 151, 20);
		panelCuentas.add(lblRepetirContrasea);
		
		txtPass2 = new JPasswordField();
		txtPass2.setBounds(290, 327, 183, 20);
		panelCuentas.add(txtPass2);
		
		JButton btnNewButton_1 = new JButton("Cerrar Sesi\u00F3n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login logueo = new Login();
				logueo.setVisible(true);
				logueo.setLocationRelativeTo(null);
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color (105,105,105));
		btnNewButton_1.setBounds(954, 566, 116, 23);
		panelCuentas.add(btnNewButton_1);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGuardar.setBackground(new Color (105,105,105));
		btnGuardar.setBounds(228, 495, 116, 23);
		panelCuentas.add(btnGuardar);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de Cuenta: ");
		lblTipoDeCuenta.setForeground(SystemColor.controlDkShadow);
		lblTipoDeCuenta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTipoDeCuenta.setBounds(119, 413, 151, 20);
		panelCuentas.add(lblTipoDeCuenta);
		
		comboBoxTipo = new JComboBox();
		comboBoxTipo.setBackground(new Color(105,105,105));
		comboBoxTipo.setForeground(Color.WHITE);
		comboBoxTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"          <Seleccionar>", "             Profesor", "             Estudiante"}));
		comboBoxTipo.setSelectedIndex(0);
		comboBoxTipo.setBounds(290, 415, 183, 20);
		panelCuentas.add(comboBoxTipo);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\PASCASIO\\Downloads\\user (4).png"));
		lblNewLabel_8.setBounds(79, 130, 37, 43);
		panelCuentas.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\PASCASIO\\Downloads\\repeat.png"));
		lblNewLabel_9.setBounds(79, 325, 37, 32);
		panelCuentas.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\PASCASIO\\Downloads\\house-key (1).png"));
		lblNewLabel_10.setBounds(79, 225, 37, 32);
		panelCuentas.add(lblNewLabel_10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(688, 128, 264, 273);
		panelCuentas.add(lblNewLabel_7);
		lblNewLabel_7.setBackground(Color.DARK_GRAY);
		lblNewLabel_7.setIcon(new ImageIcon(Principal.class.getResource("/resources/3d (6).png")));
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(null);
		panelMenu.setBackground(new Color(105,105,105));
		panelMenu.setBounds(0, 0, 235, 691);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblMenu = new JLabel("MEN\u00DA");
		lblMenu.addMouseListener(new MouseAdapter() {
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
				//cargarGraf();
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
		lblMenu.setBackground(Color.WHITE);
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(40, 210, 145, 39);
		panelMenu.add(lblMenu);
		
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
				cbxSelectPrism.removeAllItems();
				cbxSelectPrism.insertItemAt(new String("<Seleccione>"), 0);
				cbxSelectPrism.setSelectedIndex(0);
				for(Prisma prisma: Centro.getInstance().misPrismas) {
					cbxSelectPrism.addItem(prisma.getNombre()+": "+prisma.getfiguraBase());
				}
				
			}
			
		
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/resources/modeling (8).png")));
		mntmNewMenuItem_1.setBounds(34, 380, 156, 45);
		panelMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.setBackground(new Color(105,105,105));
	//	mntmNewMenuItem_1.addActionListener(new ActionListener() {
		//public void actionPerformed(ActionEvent e) {
			/*		GraficarPrisma GrPrisma = new GraficarPrisma();
				GrPrisma.setVisible(true);
				GrPrisma.setLocationRelativeTo(null);*/
		//	}
	//	});
		mntmNewMenuItem_1.setBorder(null);
		mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.setForeground(Color.WHITE);
		
		mntmRegistrar = new JMenuItem(" REGISTRAR");
		mntmRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		/*mntmRegistrar.addMouseListener(new MouseAdapter() {
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
			
		});*/
		
	
		mntmRegistrar.setIcon(new ImageIcon(Principal.class.getResource("/resources/folder (2).png")));
		mntmRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		mntmRegistrar.setForeground(Color.WHITE);
		mntmRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mntmRegistrar.setBorder(null);
		mntmRegistrar.setBackground(new Color(105,105,105));
		mntmRegistrar.setBounds(34, 280, 156, 45);
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
		mntmGeometria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mntmGeometria.setBorder(null);
		mntmGeometria.setBackground(new Color(105,105,105));
		mntmGeometria.setBounds(34, 480, 156, 45);
		panelMenu.add(mntmGeometria);
		
		mntmCuentas = new JMenuItem("CUENTAS");
		mntmCuentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	/*	mntmCuentas.addMouseListener(new MouseAdapter() {
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
		
		}); */
		
		mntmCuentas.setIcon(new ImageIcon(Principal.class.getResource("/resources/user.png")));
		mntmCuentas.setHorizontalAlignment(SwingConstants.LEFT);
		mntmCuentas.setForeground(Color.WHITE);
		mntmCuentas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mntmCuentas.setBorder(null);
		mntmCuentas.setBackground(new Color(105,105,105));
		mntmCuentas.setBounds(34, 580, 156, 45);
		panelMenu.add(mntmCuentas);
		
		JLabel lblIconoBienvenida = new JLabel("");
		lblIconoBienvenida.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
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
		lblIconoBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconoBienvenida.setIcon(new ImageIcon(Principal.class.getResource("/resources/cube-design (3).png")));
		lblIconoBienvenida.setBounds(26, 32, 186, 152);
		panelMenu.add(lblIconoBienvenida);
		
		pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(0, 151, 167));
		pnlTitulo.setBounds(235, 0, 1105, 76);
		contentPane.add(pnlTitulo);
		pnlTitulo.setLayout(new CardLayout(0, 0));
		
		pnlHome = new JPanel();
		pnlTitulo.add(pnlHome, "name_80703288203094");
		pnlHome.setBackground(new Color(0, 151, 167));
		pnlHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PRISMAS 3D");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(302, 18, 500, 39);
		pnlHome.add(lblNewLabel_1);
		
		pnlRegistrar = new JPanel();
		pnlRegistrar.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlRegistrar, "name_80858031575147");
		pnlRegistrar.setLayout(new CardLayout(0, 0));
		
		JLabel lblRegistrar = new JLabel("REGISTRAR");
		lblRegistrar.setBounds(new Rectangle(302, 18, 500, 39));
		lblRegistrar.setBackground(Color.WHITE);
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pnlRegistrar.add(lblRegistrar, "name_81571125740572");
		
		pnlGraficar = new JPanel();
		pnlGraficar.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlGraficar, "name_80868735605440");
		pnlGraficar.setLayout(new CardLayout(0, 0));
		
		JLabel lblGraficar = new JLabel("GRAFICAR");
		lblGraficar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraficar.setForeground(Color.WHITE);
		lblGraficar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblGraficar.setBounds(302, 18, 500, 39);
		pnlGraficar.add(lblGraficar, "name_81575709736667");
		
		pnlGeometria = new JPanel();
		pnlGeometria.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlGeometria, "name_80875275372679");
		pnlGeometria.setLayout(new CardLayout(0, 0));
		
		JLabel lblGeometra = new JLabel("GEOMETR\u00CDA");
		lblGeometra.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeometra.setForeground(Color.WHITE);
		lblGeometra.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblGeometra.setBounds(302, 18, 500, 39);
		pnlGeometria.add(lblGeometra, "name_81579765087775");
		
		pnlCuentas = new JPanel();
		pnlCuentas.setBackground(new Color(0, 151, 167));
		pnlTitulo.add(pnlCuentas, "name_81027452984221");
		pnlCuentas.setLayout(new CardLayout(0, 0));
		
		JLabel lblCuentas = new JLabel("CUENTAS");
		lblCuentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuentas.setForeground(Color.WHITE);
		lblCuentas.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCuentas.setBounds(302, 18, 500, 39);
		pnlCuentas.add(lblCuentas, "name_81583263617228");
		

	}

	private void calcula() {
		Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lblHora.setText(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
		
	}
	
	public static void cargarGraf() {
		int cuad=0,rect=0,trap=0,romb=0,trian=0;
		for(Prisma prisma: Centro.misPrismas) {
			if(prisma instanceof Cuadrangular) {
				cuad++;
			}
			if(prisma instanceof Rectangular) {
				rect++;
				contador++;
			}
			if(prisma instanceof Romboidal) {
				romb++;
			}
			if(prisma instanceof Trapezoidal) {
				trap++;
			}
			if(prisma instanceof Triangular) {
				trian++;
			}
		}
		DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Cuadrangular", cuad);
        data.setValue("Rectangular", rect);
        data.setValue("Romboidal", romb);
        data.setValue("Trapezoidal", trap);
        data.setValue("Triangular", trian);
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "PRISMAS CREADOS POR TIPO", 
         data, 
         true, 
         true, 
         false);
        try {
        	Files.deleteIfExists(Paths.get(System.getProperty("user.dir")+"\\grafico"+(Centro.misPrismas.size()-1)+".jpg"));
        }catch(Exception e) {
        	System.out.println("File not found");
        }
        try {
			ChartUtilities.saveChartAsJPEG(new File("grafico"+Centro.misPrismas.size()+".jpg"), chart, 689, 570);
			lblGraf.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\grafico"+Centro.misPrismas.size()+".jpg")); 
		} catch (IOException e) {
			System.out.println("Me jodi");
			e.printStackTrace();
		}
	}
}

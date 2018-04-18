package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
private JButton btnNewButton;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JTable table;
private JMenuBar menuBar;
private JMenu mnDatoteka;
private JMenuItem mntmOpen;
private JMenuItem mntmSave;
private JMenuItem mntmHelp;
private JMenuItem mntmExit;
private JButton btnNewButton_3;
private JButton btnNewButton_4;
private JButton btnNewButton_5;
private JButton btnDodajKurs;
private JTable table_1;
private JMenuBar menuBar_1;
private JMenu mnNewMenu;
private JMenu mnNewMenu_1;
private JMenuItem mntmOpen_1;
private JMenuItem mntmSave_1;
private JMenuItem mntmExit_1;
private JMenuItem mntmAbout;
private JTextPane textPane;
private JPopupMenu popupMenu;
private JScrollPane scrollPane;
private JMenuItem mntmDodajKurs;
private JMenuItem mntmObrisiKurs;
private JMenuItem mntmIzvrsiIzmenu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/slika/download.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 413);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getTable_1(), BorderLayout.CENTER);
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
			gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_3.gridx = 0;
			gbc_btnNewButton_3.gridy = 0;
			GridBagConstraints gbc_btnDodajKurs = new GridBagConstraints();
			gbc_btnDodajKurs.insets = new Insets(0, 0, 5, 0);
			gbc_btnDodajKurs.gridx = 0;
			gbc_btnDodajKurs.gridy = 0;
			panel.add(getBtnDodajKurs(), gbc_btnDodajKurs);
			GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
			gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_4.gridx = 0;
			gbc_btnNewButton_4.gridy = 1;
			panel.add(getBtnNewButton_4(), gbc_btnNewButton_4);
			GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
			gbc_btnNewButton_5.gridx = 0;
			gbc_btnNewButton_5.gridy = 2;
			panel.add(getBtnNewButton_5(), gbc_btnNewButton_5);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEFT, TitledBorder.TOP, null, null));
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(getTextPane(), GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
						.addContainerGap())
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.TRAILING)
					.addComponent(getTextPane(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
			);
			panel_1.setLayout(gl_panel_1);
		}
		return panel_1;
	}
		

	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Obrisi kurs");
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Izvrsi zamenu");
		}
		return btnNewButton_5;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			
		}
		return btnDodajKurs;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable_1());		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			));
			addPopup(table_1, getPopupMenu());
		}
		return table_1;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar_1 == null) {
			menuBar_1 = new JMenuBar();
			menuBar_1.add(getMnNewMenu());
			menuBar_1.add(getMnNewMenu_1());
		}
		return menuBar_1;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmOpen_1());
			mnNewMenu.add(getMntmSave_1());
			mnNewMenu.add(getMntmExit_1());
		}
		return mnNewMenu;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Help");
			mnNewMenu_1.add(getMntmAbout());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmOpen_1() {
		if (mntmOpen_1 == null) {
 			mntmOpen_1 = new JMenuItem("Open");
			mntmOpen_1.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmOpen_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
 			
 			mntmOpen_1.addActionListener(new ActionListener() {
 				public void actionPerformed(ActionEvent arg0) {

					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle("Izaberite fajl: ");
					fc.showOpenDialog(fc);
					

 				}
 			});
 		}
 		return mntmOpen_1;
	}
	private JMenuItem getMntmSave_1() {
		if (mntmSave_1 == null) {
			mntmSave_1 = new JMenuItem("Save");
			
			mntmSave_1.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
				
									JFileChooser fc = new JFileChooser();
									fc.setDialogTitle("Izaberite fajl: ");
									fc.showSaveDialog(fc);
								}
							});
		
			mntmSave_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		
		return mntmSave_1;
	}
	private JMenuItem getMntmExit_1() {
		if (mntmExit_1 == null) {
			mntmExit_1 = new JMenuItem("Exit");
			mntmExit_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlazak",
											JOptionPane.YES_NO_CANCEL_OPTION);
							
									if (opcija == JOptionPane.YES_OPTION)
										System.exit(0);
				}
			});
			
		}
		return mntmExit_1;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
		}
		return mntmAbout;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
		}
		return textPane;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiIzmenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
 		if (mntmDodajKurs == null) {
 			mntmDodajKurs = new JMenuItem("Dodaj kurs");
 		}
 		return mntmDodajKurs;
 	}

 	private JMenuItem getMntmObrisiKurs() {
 		if (mntmObrisiKurs == null) {
 			mntmObrisiKurs = new JMenuItem("Obri\u0161i kurs");
 		}
 		return mntmObrisiKurs;
 	}

 	private JMenuItem getMntmIzvrsiIzmenu() {
 		if (mntmIzvrsiIzmenu == null) {
 			mntmIzvrsiIzmenu = new JMenuItem("Izvr\u0161i zamenu");
 		}
 		return mntmIzvrsiIzmenu;
 	}
}

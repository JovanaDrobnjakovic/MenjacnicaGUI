package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField kupovni;
	private JLabel lblNewLabel_1;
	private JLabel lblProdajniKurs;
	private JTextField textField;
	private JLabel lblIznos;
	private JTextField iz;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JSlider slider;
	private JButton izmeni;
	private JButton btnOdustani;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getKupovni());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField());
		contentPane.add(getLblIznos());
		contentPane.add(getIz());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getSlider());
		contentPane.add(getIzmeni());
		contentPane.add(getBtnOdustani());
		// contentPane.add(getComboBox_1());
		contentPane.add(getComboBox_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setBounds(10, 21, 77, 14);
		}
		return lblNewLabel;
	}

	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setEditable(false);
			kupovni.setBounds(10, 45, 114, 20);
			kupovni.setColumns(10);
		}
		return kupovni;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Valuta");
			lblNewLabel_1.setBounds(151, 21, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(246, 21, 77, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(237, 45, 114, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 113, 46, 14);
		}
		return lblIznos;
	}

	private JTextField getIz() {
		if (iz == null) {
			iz = new JTextField();
			iz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			iz.setBounds(10, 138, 114, 20);
			iz.setColumns(10);

		}
		return iz;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(190, 95, 97, 14);
		}
		return lblVrstaTransakcije;
	}

	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnNewRadioButton);

			rdbtnNewRadioButton.setBounds(190, 116, 109, 23);
		}
		return rdbtnNewRadioButton;
	}

	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(190, 144, 109, 23);
		}
		return rdbtnNewRadioButton_1;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			// int iznos = slider.getValue();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					iz.setText(String.valueOf(slider.getValue()));
				}
			});
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setBounds(20, 169, 341, 45);

		}
		return slider;
	}

	private JButton getIzmeni() {
		if (izmeni == null) {
			izmeni = new JButton("Izvrsi izmenu");
			izmeni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tr = "";
					String vl = "";
					vl = (String) comboBox_1.getSelectedItem();
					if (rdbtnNewRadioButton.isSelected())
						tr = "kupovina";
					else
						tr = "prodaja";
					MenjacnicaGUI.getTextArea().append("\n");

					MenjacnicaGUI.getTextArea().append("Zamena: [Iznos je " + iz.getText() + " Tip transakcije je "
							+ tr + "Valuta je" + vl + " ]");
					dispose();
				}
			});
			izmeni.setBounds(10, 242, 114, 23);
		}
		return izmeni;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(237, 242, 114, 23);
		}
		return btnOdustani;
	}

	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));

			comboBox_1.setBounds(151, 45, 55, 20);
		}
		return comboBox_1;
	}
}

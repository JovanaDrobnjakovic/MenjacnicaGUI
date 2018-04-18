package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField Sifra;
	private JLabel lblNewLabel;
	private JTextField Naziv;
	private JLabel lblProdajniKurs;
	private JTextField Prodajni;
	private JLabel lblKupovniKurs;
	private JTextField Kupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField Srednji;
	private JTextField Skraceni;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnObrisi;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 356, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getSifra());
		contentPane.add(getLblNewLabel());
		contentPane.add(getNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSrednji());
		contentPane.add(getSkraceni());
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}

	private JTextField getSifra() {
		if (Sifra == null) {
			Sifra = new JTextField();
			Sifra.setBounds(10, 36, 132, 20);
			Sifra.setColumns(10);
		}
		return Sifra;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Naziv");
			lblNewLabel.setBounds(216, 11, 46, 14);
		}
		return lblNewLabel;
	}

	private JTextField getNaziv() {
		if (Naziv == null) {
			Naziv = new JTextField();
			Naziv.setBounds(210, 36, 113, 20);
			Naziv.setColumns(10);
		}
		return Naziv;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 67, 98, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getProdajni() {
		if (Prodajni == null) {
			Prodajni = new JTextField();
			Prodajni.setBounds(10, 92, 132, 20);
			Prodajni.setColumns(10);
		}
		return Prodajni;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(216, 67, 84, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getKupovni() {
		if (Kupovni == null) {
			Kupovni = new JTextField();
			Kupovni.setBounds(216, 92, 113, 20);
			Kupovni.setColumns(10);
		}
		return Kupovni;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 123, 98, 14);
		}
		return lblSrednjiKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(216, 123, 84, 14);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getSrednji() {
		if (Srednji == null) {
			Srednji = new JTextField();
			Srednji.setBounds(10, 148, 132, 20);
			Srednji.setColumns(10);
		}
		return Srednji;
	}

	private JTextField getSkraceni() {
		if (Skraceni == null) {
			Skraceni = new JTextField();
			Skraceni.setBounds(216, 148, 109, 20);
			Skraceni.setColumns(10);
		}
		return Skraceni;
	}
	
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnObrisi.setEnabled(chckbxNewCheckBox.isSelected());
				}
			});
			chckbxNewCheckBox.setBounds(11, 189, 131, 23);
			
		}
		
		return chckbxNewCheckBox;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Pomocna p = new Pomocna();

						p.setNaziv(Naziv.getText());
						p.setSkraceni(Skraceni.getText());
						p.setKupovni(Double.parseDouble(Kupovni.getText()));
						p.setSrednji(Double.parseDouble(Srednji.getText()));
						p.setProdajni(Double.parseDouble(Prodajni.getText()));
						p.setSifra(Integer.parseInt(Sifra.getText()));
						MenjacnicaGUI.getTextArea().append("\n");
						MenjacnicaGUI.getTextArea().append("Obrisano " + p.toString());
						dispose();

					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			btnObrisi.setEnabled(false);
			
			btnObrisi.setBounds(38, 219, 123, 23);
		}
		return btnObrisi;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			btnOdustani.setBounds(191, 219, 132, 23);
		}
		return btnOdustani;
	}
}

package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField sifra;
	private JLabel lblNewLabel_1;
	private JTextField naziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField prodajni;
	private JTextField kupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField srednji;
	private JTextField skraceni;
	private JButton dodaj;
	private JButton obrisi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSifra());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getProdajni());
		contentPane.add(getKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSrednji());
		contentPane.add(getSkraceni());
		contentPane.add(getDodaj());
		contentPane.add(getObrisi());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(10, 32, 138, 20);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setBounds(194, 11, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setBounds(194, 32, 138, 20);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 74, 100, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(194, 74, 100, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setBounds(10, 99, 138, 20);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setBounds(194, 99, 138, 20);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 141, 86, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(194, 141, 100, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setBounds(10, 166, 138, 20);
			srednji.setColumns(10);
		}
		return srednji;
	}
	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setBounds(194, 166, 138, 20);
			skraceni.setColumns(10);
		}
		return skraceni;
	}
	private JButton getDodaj() {
		if (dodaj == null) {
			dodaj = new JButton("Dodaj");
			dodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Pomocna p = new Pomocna();

						p.setNaziv(naziv.getText());
						p.setSkraceni(skraceni.getText());
						p.setKupovni(Double.parseDouble(kupovni.getText()));
						p.setSrednji(Double.parseDouble(srednji.getText()));
						p.setProdajni(Double.parseDouble(prodajni.getText()));
						p.setSifra(Integer.parseInt(sifra.getText()));
						MenjacnicaGUI.getTextArea().append("\n");
						MenjacnicaGUI.getTextArea().append("Dotato " + p.toString());
						dispose();

					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			dodaj.setBounds(10, 207, 138, 23);
		}
		return dodaj;
	}
	private JButton getObrisi() {
		if (obrisi == null) {
			obrisi = new JButton("Obrisi");
			obrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			obrisi.setBounds(194, 207, 138, 23);
		}
		return obrisi;
	}
}

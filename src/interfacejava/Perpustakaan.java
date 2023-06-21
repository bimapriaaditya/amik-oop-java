package interfacejava;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Perpustakaan {
    public static void main(String[] args) {

        // ========== CONTINER ==========
        JFrame form = new JFrame("Aplikasi Perpustakaan Java");     // Container App
        form.setSize(500, 500);     // Size container
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Close App
        form.setLocationRelativeTo(null);   // Middle center App
        form.setLayout(null);
        // ========== END CONTINER ==========

        // Header Component
        JLabel labelJudul = new JLabel("Aplikasi Perpustakaan Java Offline");
        labelJudul.setBounds(145, 35, 250, 25);
        form.add(labelJudul);

        // Row 1 Kode buku
        JLabel labelRow1 = new JLabel("Kode Buku");
        labelRow1.setBounds(50, 85, 250, 20);
        form.add(labelRow1);
        JTextField kodeBuku = new JTextField();
        kodeBuku.setBounds(150, 85, 250, 30);
        form.add(kodeBuku);
        
        // Row 2 Nama Buku
        JLabel labelRow2 = new JLabel("Nama Buku");
        labelRow2.setBounds(50, 120, 250, 20);
        form.add(labelRow2);
        JTextField namaBuku = new JTextField();
        namaBuku.setBounds(150, 120, 250, 30);
        form.add(namaBuku);

        // Row 3 Membership
        JLabel labelRow3 = new JLabel("Membership");
        labelRow3.setBounds(50, 155, 250, 20);
        form.add(labelRow3);

        JRadioButton radioEkslusif = new JRadioButton();
        radioEkslusif.setText("Esklusif");
        radioEkslusif.setBounds(150, 155, 250, 20);

        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Umum");
        radioUmum.setBounds(150, 175, 250, 20);

        ButtonGroup groupMembership = new ButtonGroup();
        groupMembership.add(radioEkslusif);
        groupMembership.add(radioUmum);

        form.add(radioEkslusif);
        form.add(radioUmum);


        // Row 4 Biaya Perhari
        JLabel labelRow4 = new JLabel("Biaya Perhari");
        labelRow4.setBounds(50, 205, 250, 20);
        form.add(labelRow4);
        JTextField biayaPerhari = new JTextField();
        biayaPerhari.setBounds(150, 205, 250, 30);
        form.add(biayaPerhari);


        // Row 5 Hari pinjam
        JLabel labelRow5 = new JLabel("Waktu Pinjaman");
        labelRow5.setBounds(50, 240, 250, 20);
        form.add(labelRow5);
        String hari[] = new String[31];
        for(int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i + 1);
        }
        JComboBox cbHari = new JComboBox<>(hari);
        cbHari.setBounds(150, 240, 50, 20);
        form.add(cbHari);

        // Row 6 Peminjam
        JLabel labelRow6 = new JLabel("Nama Peminjam");
        labelRow6.setBounds(50, 275, 250, 20);
        form.add(labelRow6);
        JTextField namPeminjam = new JTextField();
        namPeminjam.setBounds(150, 275, 250, 30);
        form.add(namPeminjam);


        // Btn SImpan Reset
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(150, 325, 85, 30);
        form.add(btnSimpan);
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(245, 325, 85, 30);
        form.add(btnReset);


        form.setVisible(true);
    }   
}
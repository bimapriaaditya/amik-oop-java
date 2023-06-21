package interfacejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class Lingkaran {

    private static Double r;
    private static JTextField inputJariJari, hasilJawaban;

    public static void main(String[] args) {
        JFrame form = new JFrame("Tugas 2");
        form.setSize(500, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);

        // Header Component
        JLabel labelJudul = new JLabel("LUAS LINGKARAN");
        labelJudul.setBounds(145, 35, 250, 25);
        form.add(labelJudul);

        JLabel labelRow1 = new JLabel("Jari-jari Lingkaran");
        labelRow1.setBounds(50, 85, 250, 20);
        form.add(labelRow1);
        inputJariJari = new JTextField();
        inputJariJari.setBounds(150, 85, 250, 30);
        form.add(inputJariJari);

        JLabel labelRow2 = new JLabel("Hasil");
        labelRow2.setBounds(50, 120, 250, 20);
        form.add(labelRow2);
        hasilJawaban = new JTextField();
        hasilJawaban.setBounds(150, 120, 250, 30);
        hasilJawaban.setEnabled(false);
        form.add(hasilJawaban);

        JButton btnHitungLuasLingkaran = new JButton("HITUNG");
        btnHitungLuasLingkaran.setBounds(50, 200, 100, 30);
        btnHitungLuasLingkaran.addActionListener(new BtnHitungLuasLingkaranListener());
        form.add(btnHitungLuasLingkaran);

        JButton btnReset = new JButton("RESET");
        btnReset.setBounds(50, 245, 100, 30);
        btnReset.addActionListener(new BtnResetListener());
        form.add(btnReset);

        form.setVisible(true);
    }

    private static class BtnHitungLuasLingkaranListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double jariJari = Double.parseDouble(inputJariJari.getText());
            double hasil = Math.PI * jariJari * jariJari;
            hasilJawaban.setText(String.valueOf(hasil));
        }
    }

    private static class BtnResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputPertama.setText(null);
            inputKedua.setText(null);
            hasilJawaban.setText(null);
        }
    }
}

package interfacejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class PersegiPanjang {

    private static Double panjang, lebar;
    private static JTextField inputPanjang, inputLebar, hasilJawaban;

    public static void main(String[] args) {
        JFrame form = new JFrame("Tugas 3");
        form.setSize(500, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);

        // Header Component
        JLabel labelJudul = new JLabel("LUAS PERSEGI PANJANG");
        labelJudul.setBounds(120, 35, 250, 25);
        form.add(labelJudul);

        JLabel labelRow1 = new JLabel("Panjang Persegi Panjang");
        labelRow1.setBounds(50, 85, 250, 20);
        form.add(labelRow1);
        inputPanjang = new JTextField();
        inputPanjang.setBounds(200, 85, 250, 30);
        form.add(inputPanjang);

        JLabel labelRow2 = new JLabel("Lebar Persegi Panjang");
        labelRow2.setBounds(50, 120, 250, 20);
        form.add(labelRow2);
        inputLebar = new JTextField();
        inputLebar.setBounds(200, 120, 250, 30);
        form.add(inputLebar);

        JLabel labelRow3 = new JLabel("Hasil");
        labelRow3.setBounds(50, 155, 250, 20);
        form.add(labelRow3);
        hasilJawaban = new JTextField();
        hasilJawaban.setBounds(200, 155, 250, 30);
        hasilJawaban.setEnabled(false);
        form.add(hasilJawaban);

        JButton btnHitungLuasPersegiPanjang = new JButton("HITUNG");
        btnHitungLuasPersegiPanjang.setBounds(50, 235, 100, 30);
        btnHitungLuasPersegiPanjang.addActionListener(new BtnHitungLuasPersegiPanjangListener());
        form.add(btnHitungLuasPersegiPanjang);

        JButton btnReset = new JButton("RESET");
        btnReset.setBounds(50, 280, 100, 30);
        btnReset.addActionListener(new BtnResetListener());
        form.add(btnReset);

        form.setVisible(true);
    }

    private static class BtnHitungLuasPersegiPanjangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double panjang = Double.parseDouble(inputPanjang.getText());
            double lebar = Double.parseDouble(inputLebar.getText());
            double hasil = panjang * lebar;
            hasilJawaban.setText(String.valueOf(hasil));
        }
    }

    private static class BtnResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputPanjang.setText(null);
            inputLebar.setText(null);
            hasilJawaban.setText(null);
        }
    }
}

package interfacejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Segitiga {

    private static Double a, b;

    private static JTextField inputAlas, inputTinggi, hasilJawaban;

    public static void main(String[] args) {
        JFrame form = new JFrame("Tugas 1");
        form.setSize(500, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);


        // Header Component
        JLabel labelJudul = new JLabel("LUAS SEGITIGA");
        labelJudul.setBounds(145, 35, 250, 25);
        form.add(labelJudul);


        JLabel labelRow1 = new JLabel("Alas Segitiga");
        labelRow1.setBounds(50, 85, 250, 20);
        form.add(labelRow1);
        inputAlas = new JTextField();
        inputAlas.setBounds(150, 85, 250, 30);
        form.add(inputAlas);


        JLabel labelRow2 = new JLabel("Input Nilai 2");
        labelRow2.setBounds(50, 120, 250, 20);
        form.add(labelRow2);
        inputTinggi = new JTextField();
        inputTinggi.setBounds(150, 120, 250, 30);
        form.add(inputTinggi);


        JLabel labelRow3 = new JLabel("Hasil");
        labelRow3.setBounds(50, 165, 250, 20);
        form.add(labelRow3);
        hasilJawaban = new JTextField();
        hasilJawaban.setBounds(150, 165, 250, 30);
        hasilJawaban.setEnabled(false);
        form.add(hasilJawaban);

        JButton btnTambah = new JButton("HITUNG");
        btnTambah.setBounds(50, 245, 100, 30);
        btnTambah.addActionListener(new BtnHitungLuas());
        form.add(btnTambah);


        JButton btnReset = new JButton("RESET");
        btnReset.setBounds(50, 290, 100, 30);
        btnReset.addActionListener(new BtnResetListener());
        form.add(btnReset);


        form.setVisible(true);

    }

    private static class BtnHitungLuas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(inputAlas.getText());
            b = Double.parseDouble(inputTinggi.getText());
    
            double hasil = a * b * 0.5;
            hasilJawaban.setText("" + hasil);
        }
    }

    private static class BtnResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputAlas.setText(null);
            inputTinggi.setText(null);
            hasilJawaban.setText(null);
        }
    }


}

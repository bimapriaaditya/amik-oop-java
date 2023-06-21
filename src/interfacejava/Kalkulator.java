package interfacejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Kalkulator {

    private static int a, b;

    private static JTextField inputPertama, inputKedua, hasilJawaban;

    public static void main(String[] args) {
        JFrame form = new JFrame("Java GUI Kalkulator");
        form.setSize(500, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);


        // Header Component
        JLabel labelJudul = new JLabel("KALKULATOR SEDERHANA");
        labelJudul.setBounds(145, 35, 250, 25);
        form.add(labelJudul);


        JLabel labelRow1 = new JLabel("Input Nilai 1");
        labelRow1.setBounds(50, 85, 250, 20);
        form.add(labelRow1);
        inputPertama = new JTextField();
        inputPertama.setBounds(150, 85, 250, 30);
        form.add(inputPertama);


        JLabel labelRow2 = new JLabel("Input Nilai 2");
        labelRow2.setBounds(50, 120, 250, 20);
        form.add(labelRow2);
        inputKedua = new JTextField();
        inputKedua.setBounds(150, 120, 250, 30);
        form.add(inputKedua);


        JLabel labelRow3 = new JLabel("Hasil");
        labelRow3.setBounds(50, 165, 250, 20);
        form.add(labelRow3);
        hasilJawaban = new JTextField();
        hasilJawaban.setBounds(150, 165, 250, 30);
        hasilJawaban.setEnabled(false);
        form.add(hasilJawaban);

        JButton btnTambah = new JButton("TAMBAH");
        btnTambah.setBounds(50, 245, 100, 30);
        btnTambah.addActionListener(new BtnTambahListener());
        form.add(btnTambah);

        JButton btnKurang = new JButton("KURANG");
        btnKurang.setBounds(160, 245, 100, 30);
        btnKurang.addActionListener(new BtnKurangListener());
        form.add(btnKurang);

        JButton btnKali = new JButton("KALI");
        btnKali.setBounds(270, 245, 75, 30);
        btnKali.addActionListener(new BtnKaliListener());
        form.add(btnKali);

        JButton btnBagi = new JButton("BAGI");
        btnBagi.setBounds(355, 245, 75, 30);
        btnBagi.addActionListener(new BtnBagiListener());
        form.add(btnBagi);

        JButton btnReset = new JButton("RESET");
        btnReset.setBounds(50, 290, 100, 30);
        btnReset.addActionListener(new BtnResetListener());
        form.add(btnReset);


        form.setVisible(true);

    }

    private static class BtnTambahListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(inputPertama.getText());
            b = Integer.parseInt(inputKedua.getText());
    
            int hasil = a + b;
            hasilJawaban.setText("" + hasil);
        }
    }

    private static class BtnKurangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(inputPertama.getText());
            b = Integer.parseInt(inputKedua.getText());
    
            int hasil = a - b;
            hasilJawaban.setText("" + hasil);
        }
    }

    private static class BtnKaliListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(inputPertama.getText());
            b = Integer.parseInt(inputKedua.getText());
    
            int hasil = a * b;
            hasilJawaban.setText("" + hasil);
        }
    }

    private static class BtnBagiListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(inputPertama.getText());
            b = Integer.parseInt(inputKedua.getText());
    
            int hasil = a / b;
            hasilJawaban.setText("" + hasil);
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

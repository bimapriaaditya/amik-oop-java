package uas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Mahasiswa {

    public String nama, kelas, prodi, semester;
    public int nim;
    private JTextField[] fieldValues;

    public static String[] getMahasiswa() {
        // Label untuk Form
        String[] data = {
                "nama",
                "kelas",
                "prodi",
                "semester",
                "nim",
        };
        return data;
    }

    class MahasiswaForm extends JFrame {
        private JPanel mainPanel;

        public MahasiswaForm(String[] field) {
            setTitle("Formulir Biodata Mahasiswa");
            setSize(750, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Buat panel utama dengan ukuran yang fleksibel
            mainPanel = new JPanel(new GridBagLayout());
            int padding = 100;
            int row = 1;
            mainPanel.setBorder(BorderFactory.createEmptyBorder(padding, padding, padding, padding));
            setContentPane(mainPanel);

            // Atur Layout
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.5;
            gbc.insets = new Insets(5, 5, 5, 5); // spasi

            // Tampilkan logo image
            ImageIcon logoIcon = addImageIcon("amik.png");
            if (logoIcon != null) {
                JLabel logoLabel = new JLabel(logoIcon);
                gbc.gridy = 0;
                gbc.gridx = 0;
                mainPanel.add(logoLabel);
            }

            // Looping form field
            fieldValues = new JTextField[field.length];
            for (int i = 0; i < field.length; i++) {
                int colX = 0;
                JLabel label = new JLabel(field[i]);
                JTextField fieldVal = new JTextField();

                gbc.gridx = colX;
                gbc.gridy = row;
                mainPanel.add(label, gbc);
                colX++;
                gbc.gridx = 1;
                mainPanel.add(fieldVal, gbc);
                fieldVal.setName(field[i]);

                fieldValues[i] = fieldVal;

                row++;

                if (i == field.length - 1) {
                    JButton simpanBtn = new JButton("Simpan Data");
                    JButton resetBtn = new JButton("Reset");

                    gbc.gridx = 0;
                    gbc.gridy = row;
                    mainPanel.add(resetBtn, gbc);
                    gbc.gridx = 1;
                    mainPanel.add(simpanBtn, gbc);

                    resetBtn.addActionListener(new BtnResetListener(fieldValues));
                    simpanBtn.addActionListener(new BtnSimpanListener(fieldValues));
                }
            }

            setVisible(true);
        }

        private class BtnResetListener implements ActionListener {
            private JTextField[] fields;

            public BtnResetListener(JTextField[] fields) {
                this.fields = fields;
            }

            // Fungsi untuk membersihkan input
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JTextField field : fields) {
                    field.setText("");
                }
            }
        }

        private class BtnSimpanListener implements ActionListener {
            private JTextField[] fields;

            public BtnSimpanListener(JTextField[] fields) {
                this.fields = fields;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // Boolean brakloop = false;
                for (JTextField field : fields) {
                    String input = field.getText();
                    System.out.println(field.getName() + ": " + input);
                }
                new BtnResetListener(fields).actionPerformed(e);
            }
        }

        // Fungsi untuk menampilkan Image
        private ImageIcon addImageIcon(String path) {
            URL imageURL = getClass().getResource(path);
            if (imageURL != null) {
                ImageIcon originalIcon = new ImageIcon(imageURL);
                Image image = originalIcon.getImage();
                Image resizeImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                return new ImageIcon(resizeImage);
            } else {
                System.err.println("Couldn't find image file: " + path);
                return null;
            }
        }
    }

    public static void main(String[] args) {
        String[] bima = getMahasiswa();
        MahasiswaForm form = new Mahasiswa().new MahasiswaForm(bima);
    }
}

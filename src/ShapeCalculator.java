import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeCalculator extends JFrame {
    private JLabel label1, label2, resultLabel;
    private JTextField inputField1, inputField2;
    private JButton calculateButton;
    private JPanel contentPanel;

    public ShapeCalculator() {
        setTitle("Shape Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(4, 2, 10, 10)); // Mengatur lebar, tinggi, dan jarak antara komponen

        label1 = new JLabel("Panjang");
        label2 = new JLabel("Lebar");
        resultLabel = new JLabel("Hasil");

        inputField1 = new JTextField();
        inputField2 = new JTextField();

        calculateButton = new JButton("Hitung");
        calculateButton.addActionListener(new CalculateButtonListener());

        contentPanel.add(label1);
        contentPanel.add(inputField1);
        contentPanel.add(label2);
        contentPanel.add(inputField2);
        contentPanel.add(calculateButton);
        contentPanel.add(resultLabel);

        // Menambahkan padding pada konten
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(contentPanel);

        pack();
        setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double length = Double.parseDouble(inputField1.getText());
            double width = Double.parseDouble(inputField2.getText());

            if (e.getSource() == calculateButton) {
                double triangleArea = 0.5 * length * width;
                double circleArea = Math.PI * Math.pow(length / 2, 2);
                double rectangleArea = length * width;

                resultLabel.setText("Luas Segitiga: " + triangleArea + " | Luas Lingkaran: " + circleArea + " | Luas Persegi Panjang: " + rectangleArea);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShapeCalculator();
            }
        });
    }
}

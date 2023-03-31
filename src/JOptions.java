import javax.swing.JOptionPane;

public class JOptions {
    public void main()
    {
        String nama;
        nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
        String msg = "Hallo " +  nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }    
}

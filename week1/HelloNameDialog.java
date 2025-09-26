import javax.swing.JOptionPane;

public class HelloNameDialog {
  public static void main(String[] args) {
    String res;
    res = JOptionPane.showInputDialog("name?");
    JOptionPane.showMessageDialog(null, "xin chao " + res);
    System.exit(0);
  }
}

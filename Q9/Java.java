package Q9;
import javax.swing.JOptionPane;

public class Java {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is you name :");
        System.out.println("My name is :" + name);
        JOptionPane.showInputDialog("My name is Ali. How do I help you ");
        System.out.println("I am sorry " + name + "\nI can't help you");
    }
}


import java.io.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = JOptionPane.showInputDialog("Password:");
        File file = new File(System.getProperty("user.dir") + "\\src\\words");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String pass = "";
        String temp = null;
        while (true) {

            temp = reader.readLine();
            if (temp == null) {
                reader.reset();
            }
            if (temp.equalsIgnoreCase(a)) {
                pass = temp;
                break;
            }
        }
        System.out.println(pass);

    }
}

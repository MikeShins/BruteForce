
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
                while (true) {
                    String lol = "";
                    for (int x = 0; x < a.length(); x++) {
                        int k = 0;
                        while (k < 97 || k > 122) {
                            k = (int) (Math.random() * 128 + 1);
                        }
                        char l = (char) k;
                        lol += Character.toString(l);
                    }
                    System.out.println(lol);
                    if (lol.equalsIgnoreCase(a)) {
                        pass = temp;
                        break;
                    }
                }
            }
            if (temp.equalsIgnoreCase(a)) {
                pass = temp;
                break;
            }
        }
        System.out.println(pass);

    }
}

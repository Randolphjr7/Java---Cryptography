package cryptography;

import javax.swing.JOptionPane;

/**
 *
 * @author rando
 */
public class Cryptography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message");
        output += "The original message is: " + text + "\n";

        // Cipher object from Ceaser?
        Cipher c = new Caeser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\n Ceasar Cipher\nThe encrypted message is: " + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted message is: " + code + "\n";

        // Cipher Object from Transpose?
        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code +
                  "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decripted Transpose message is \n" + code + "\n";
        
        // Reverser Object
        Reverser r = new Reverser(text);
        r.encrypt();
        code = r.reverseText(c.getEncodedMessage());
        output += "\nReverser\nThe encrypted Reverse message is \n" + code + 
                  "\n";
        code = r.decode(code);
        output += "The decrypted Reverse message is \n" + code;
        
        System.out.println(output);
        display(output);
              
        
    }

    static void display(String s) { 
            JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt",  
                                          JOptionPane.INFORMATION_MESSAGE);  
        }
    
}

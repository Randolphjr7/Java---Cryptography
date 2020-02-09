package cryptography;

import java.util.StringTokenizer;

/**
 *
 * @author rando
 */
public abstract class Cipher {
    // instance member variables
    private String message;
    StringBuffer encrypted_message, decrypted_message;
    
    // Constructor
    public Cipher(String text) {
        // Complete the Definition
        message = text;
    }
    
    // final method
    public final void encrypt() {
     /*The message string is tokenized into individual words, and each 
       word is encoded by calling the encode method */
       encrypted_message = new StringBuffer("");
       StringTokenizer words = new StringTokenizer(message);
        
       
       while(words.hasMoreTokens()) {
           String s = words.nextToken();
           s = encode(s) + " ";
           encrypted_message.append(s);
       }
    }
    
    // final method
    public final void decrypt(String message) {
     /*The encoded message string is tokenized into individual words, and each
       word is encoded by calling the decode method. Complete the method and
       return the decoded word*/
       decrypted_message = new StringBuffer("");
       StringTokenizer words = new StringTokenizer(message);
       
       while(words.hasMoreTokens()) {
           String s = words.nextToken();
           s = decode(s) + " ";
           decrypted_message.append(s);
       }
    }
    
    String getEncodedMessage() {
        return encrypted_message.toString();
    }
    
    String getDecodedMessage() {
        return decrypted_message.toString();
    }
    
    // abstract methods
    public abstract String encode(String s);
    public abstract String decode(String s);
    
}

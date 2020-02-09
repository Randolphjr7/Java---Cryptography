
package cryptography;

import java.util.StringTokenizer;

/**
 *
 * @author rando
 */
public class Reverser extends Transpose {
    
    public Reverser(String s) {
        super(s);
    }
    
    String reverseText(String message) {
       /*The message string is tokenized into individual words, and each 
       word is encoded by calling the encode method */
       StringBuffer reversed_encrypted_message = new StringBuffer("");
       StringTokenizer words = new StringTokenizer(message);
        
       
       while(words.hasMoreTokens()) {
           String s = words.nextToken();
           s += " ";
           reversed_encrypted_message.insert(0, s);
       }
        return reversed_encrypted_message.toString();
    }
    

}

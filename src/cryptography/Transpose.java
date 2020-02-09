package cryptography;

/**
 *
 * @author rando
 */
public class Transpose extends Cipher {

    public Transpose(String s) {
        super(s);
    }

    @Override
    public String encode(String word) {
        StringBuffer result = new StringBuffer();
        int index = word.length() - 1;
        for(int i = index; 0 <= i; i--) {
            char ch = word.charAt(i);
            result.append(ch);
        }
        return result.toString();
    }

    @Override
    public String decode(String word) {
        StringBuffer result = new StringBuffer();
        int index = word.length() - 1;
        for(int i = index; 0 <= i; i--) {
            char ch = word.charAt(i);
            result.append(ch);
        }
        return result.toString();
    }
    
   
}

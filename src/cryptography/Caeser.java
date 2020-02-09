package cryptography;

/**
 *
 * @author rando
 */
public class Caeser extends Cipher implements Constants {
    
    // Constructor
    public Caeser(String s) {
        // initializes super class
        super(s);
    }
    
    @Override
    public String encode(String word) {
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, Constants.ENCODE_SHIFT);
            result.append(ch);
        }
        return result.toString();
    }
    
    @Override
    public String decode(String word) {
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = reverseDetermineChar(ch, Constants.DECODE_SHIFT);
            result.append(ch);
        }
        return result.toString();
    }
    
    public char determineCharacter(char ch, int shift) {
        if(Character.isLowerCase(ch)) {
            ch = (char)('a' + (ch - 'a' + shift) % Constants.WRAP_AROUND);
        }
        return ch;
    }
    
    public char reverseDetermineChar(char ch, int shift) {
        if(Character.isLowerCase(ch)) {
            ch = (char)('a' + (ch - 'a' + shift) % Constants.WRAP_AROUND);
        }
        return ch;
    }
    
//        int number = 98;
//        int shift  = 3;
//        char originaletter = 'n';
        
        
        // algorithm to encrypt letter
//        char newLetter = (char)('a' + (originaletter - 'a' + shift) % 26);
        // algorithm to decrypt letter
//        char reverse = (char)('a' + (newLetter - 'a' - shift) % 26);
        
        // the breakdown
//        int a = (newLetter - 'a' - shift);
//        System.out.println("a int is: " + a);
//        System.out.println("a char is: " + (char)a);
//        int b = ('a' + (newLetter - 'a' - shift) % 26);
//        System.out.println("b int is: " + b);
//        System.out.println("b char is: " + (char)b);
        
        
        // testing
//        System.out.println("");
//        System.out.println("Original letter: " + originaletter);
//        System.out.println("New Letter: " + newLetter);
//        System.out.println("Reversed back to original : " + reverse);
    
}

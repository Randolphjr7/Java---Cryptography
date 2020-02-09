package cryptography;

/**
 *
 * @author rando
 */
public interface Constants {
    
    static final int WRAP_AROUND  = 26;
    static final int ENCODE_SHIFT = 3;
    static final int DECODE_SHIFT = 23;
    static final int MY_DECODE_SHIFT = 3;
    
    public abstract char determineCharacter(char ch, int shift);
}

package banksystem;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.security.SecureRandom;


/**
 * Basic symmetric encryption example for demo purposes only without changing provider (e.g. BouncyCastle); 
 * it may not conform to current best practices as reported by NIST
 * https://csrc.nist.gov/projects/cryptographic-standards-and-guidelines
 */

public class Encryption {

	private static SecretKeySpec secretKey;
    private static byte[] key;
 
     
        public static void setKey(String myKey) 
        {
            MessageDigest sha = null;
            try {
                key = myKey.getBytes("UTF-8");
                sha = MessageDigest.getInstance("SHA-1");
                key = sha.digest(key);
                key = Arrays.copyOf(key, 16); 
                secretKey = new SecretKeySpec(key, "AES");
            } 
            catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } 
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        
        public static void moreRandomSetKey() {
        	
			try {
				SecureRandom secureRandom = new SecureRandom();
				byte[] key = new byte[32];
				secureRandom.nextBytes(key);
				secretKey = new SecretKeySpec(key, "AES");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        
     
        public static String encrypt(String strToEncrypt, String secret) 
        {
            try
            {
                //setKey(secret);
                moreRandomSetKey();
                //the SunJCE provider uses ECB as the default mode, and PKCS5Padding as the default padding scheme
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); //Better choice "AES/GCM/PKCS5Padding"  or "AES/GCM/NoPadding" (based on bug report https://bugs.openjdk.java.net/browse/JDK-8229043)
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
            } 
            catch (Exception e) 
            {
                System.out.println("Error while encrypting: " + e.toString());
            }
            return null;
        }
     
        public static String decrypt(String strToDecrypt, String secret) 
        {
            try
            {
                //the SunJCE provider uses ECB as the default mode, and PKCS5Padding as the default padding scheme
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  //Better choice "AES/GCM/PKCS5Padding"  or  "AES/GCM/NoPadding" (based on bug report https://bugs.openjdk.java.net/browse/JDK-8229043)
                cipher.init(Cipher.DECRYPT_MODE, secretKey);
                return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
            } 
            catch (Exception e) 
            {
                System.out.println("Error while decrypting: " + e.toString());
            }
            return null;
        }
}

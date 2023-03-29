package banksystem;

import java.util.regex.Pattern;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataValidationException;

import java.text.Normalizer;
//import javax.xml.bind.ValidationException;

public class ValidateOutput {
  // Allows only alphanumeric characters and spaces
  private static final Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\s]{0,20}$");
 
  // Validates and encodes the input field based on a whitelist
  public String validate(String name, String input) throws DataValidationException {
	  
	  //IDS00-j failing sanitize user input can result in sql injection attacks or cross site scripting. The severity is high. It is very likely it could happen.
    String canonical = normalize(input);
 
    if (!pattern.matcher(canonical).matches()) {
      throw new DataValidationException("Improper format in " + name + " field");
    }
     
    // Performs output encoding for nonvalid characters
    canonical = HTMLEntityEncode(canonical);
    return canonical;
  }
 
  // Normalizes to known instances 
  private String normalize(String input) {
    String canonical =
      java.text.Normalizer.normalize(input, Normalizer.Form.NFKC);
    return canonical;
  }
 
  // Encodes nonvalid data
  private static String HTMLEntityEncode(String input) {
    StringBuffer sb = new StringBuffer();
 
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
        sb.append(ch);
      } else {
        sb.append("&#" + (int)ch + ";");
      }
    }
    return sb.toString();
  }
}
  
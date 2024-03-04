import java.security.SecureRandom;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
 
        String password = generatePassword(12, true, true, true, true);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase,
                                          boolean includeDigits, boolean includeSpecialChars) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be greater than 0.");
        }

        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder passwordBuilder = new StringBuilder();
        SecureRandom random = new SecureRandom();

        StringBuilder charPool = new StringBuilder();
        if (includeUppercase) charPool.append(uppercaseChars);
        if (includeLowercase) charPool.append(lowercaseChars);
        if (includeDigits) charPool.append(digitChars);
        if (includeSpecialChars) charPool.append(specialChars);

        
        if (charPool.length() == 0) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

       
        for (int m = 0; m < length; m++) {
            int randomIndex = random.nextInt(charPool.length());
            char randomChar = charPool.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}

public class StringReversal {

    
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
          
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

       
        return new String(charArray);
    }

    public static void main(String[] args) {
        
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}

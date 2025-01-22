public class PalindromeCheck {
    public static void main(String[] args) {
        // Initialize the string
        String word = "level";
        
        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        // Compare characters from the start and end of the string
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome if characters don't match
            }
            start++;
            end--;
        }
        return true; // Palindrome if all characters match
    }
}


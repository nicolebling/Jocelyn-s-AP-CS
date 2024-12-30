

public class StringManip {

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void palindromeChecker(String str) {
        String reversed = reverseString(str);
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        palindromeChecker("taco cat");
        palindromeChecker("laid on no dial");
        palindromeChecker("level up");
    }
}
package PalindromeNumber;

public class PalindromeRunner {
    public static void main(String[] args) {
        PalindromeSolution test = new PalindromeSolution();
        int x = 123454321;
        boolean result = test.isPalindrome(x);
        System.out.println(result);
    }
}

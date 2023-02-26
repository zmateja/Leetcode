package PalindromeNumber;

public class PalindromeSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else {
            long reverse;
            StringBuilder input = new StringBuilder(Integer.toString(x));
            input.reverse();
            reverse = Long.parseLong(input.toString());
            return Integer.toUnsignedLong(x) == reverse;
        }
    }
}

package RomanToNumber;

import java.util.HashMap;

public class RomanSolution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int lastVal = 0;
        int total = 0;
        boolean add = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int curVal = values.get(c);
            if (curVal > lastVal) {
                add = true;
                total = total + curVal;
            } else if (curVal < lastVal) {
                add = false;
                total = total - curVal;
            } else if (add)
                total = total + curVal;
            else total = total - curVal;
            lastVal = curVal;
        }
        return total;
    }
}

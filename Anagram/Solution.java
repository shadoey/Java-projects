import java.util.*;

public class Solution {

    public String sorted(String x) {

        char s[] = x.toCharArray();

        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] > s[j]) {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return (new String(s));

    }
}
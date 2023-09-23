public class Reverse_String {
    public String reverse(String s) {
        char[] letters = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[index] = letters[i];
            index++;
        }
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            out = out + letters[i];
        }

        return out;
    }

}

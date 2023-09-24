public class Main_page {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String w = "abcja";
        String q = "gbcaa";

        solution.sorted(w);
        solution.sorted(q);

        if (solution.sorted(q).equals(solution.sorted(w))) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}
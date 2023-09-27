public class MAIN_PAGE {
    public static void main(String[] args) {

        Solution sc = new Solution();
        int[] arr = { 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 5, 5, 5, 5, 5, 7, 7, 7, 4, 9, 9 };
        int[] result = sc.TopK(arr, 2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}

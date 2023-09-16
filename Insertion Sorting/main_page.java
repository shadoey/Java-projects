public class main_page {
    public static void main(String[] args) {

        int[] array = { 9, 5, 1, 6, 2, 99, 87, 4, 3, 7, 4 };

        InsertionPage exp = new InsertionPage(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
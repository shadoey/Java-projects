public class main_page {
    public static void main(String[] args) {
        int[] array = { 9, 5, 1, 3, 7, 2, 4, 3, 10, 0 };
        SelectionSort_page exp = new SelectionSort_page();
        exp.SelectionSort(array);

        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

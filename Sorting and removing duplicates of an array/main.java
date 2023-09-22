public class main {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2 };

        Sortting sort = new Sortting();

        numbers = sort.Sorted(numbers);
        sort.removeDuplicates(numbers);
        int newSize = sort.removeDuplicates(numbers);

        for (int i = 0; i < newSize; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}

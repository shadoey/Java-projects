import java.util.*;

public class MainPage {
    public static void main(String[] args) {

        LinkedList<Integer> ex = new LinkedList<>();
        ex.push(7);
        ex.push(6);
        ex.push(5);
        ex.push(4);
        ex.push(3);
        ex.push(9);

        int k = ex.size();

        for (int i = k - 1; i >= 0; i--) {
            System.out.println(ex.get(i));
        }

    }

}
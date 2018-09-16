import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {6, 3, 7, 9, 0, 1, 4, 2, 5, 8};
        int b;

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    isSorted = false;

                    b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

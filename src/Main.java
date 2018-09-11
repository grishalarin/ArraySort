import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        Random rnd = new Random();
        Integer j = rnd.nextInt();

        if (j > 1000000) {

            System.out.println(j);
            throw new MyIndexOfBoundException("Array smaller than 1000000");

        }

        for (Integer i = 1000000; i > j; i++) {
            Collections.sort(arrayList);
            System.out.println(arrayList);


        }
    }
}

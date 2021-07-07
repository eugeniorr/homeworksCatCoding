import java.util.*;

public class TestAll {
    public static void main(String[] args) {

        int[][] a = {{1}, {2}};
        //System.out.println(a[0][0] + " " + a[1][0]);

        System.out.println(88 >> 3);

        int[] b = new int[5];

        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("man222");
        list.add("man23");
        list.add("man4555");
        list.add("man7777");
        System.out.println(list);
        list.removeIf(i -> (i.length() > 1 && i.length() < 7));
        System.out.println(list);


        List<Integer> listInt = new ArrayList<>();
        listInt.add(0);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        System.out.println(listInt + ", size: " + listInt.size());
        listInt.removeIf(i -> (i > 0 && i < 5));
        System.out.println(listInt + ", size: " + listInt.size());
        listInt.set(0, 10);
        listInt.add(5);
        listInt.add(5);
        listInt.add(5);
        listInt.add(5);
        int count = Collections.frequency(listInt, 5);
        System.out.println(listInt + ", size: " + listInt.size() + ", count of 5: " + count);
    }
}

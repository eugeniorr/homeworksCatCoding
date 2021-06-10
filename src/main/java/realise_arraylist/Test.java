package realise_arraylist;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(9);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        System.out.println(myList.lastIndexOf(9));

        Object[] newList = myList.toArray();
        System.out.println(Arrays.toString(newList));

        Integer[] newInt = myList.toArray(new Integer[10]);
        System.out.println(Arrays.toString(newInt));

        MyArrayList<Integer> myNewList = (MyArrayList<Integer>) myList.clone();
        myNewList.remove(0);
        myNewList.remove(new Integer(10));
        System.out.println(myNewList);
        myNewList.addAll(0, myList);
        System.out.println(myNewList);

        MyArrayList<Integer> what = new MyArrayList<>();
        what.add(2);
        what.add(3);

        myNewList.retainAll(what);

        myNewList.set(0, 100);
        myNewList.add(4, 99);
        System.out.println(myNewList);
        System.out.println(myNewList.get(1));
    }
}

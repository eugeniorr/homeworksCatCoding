package realise_linkedlist;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkList = new MyLinkedList<>();
        linkList.add(5);
        System.out.println(linkList.contains(5));
        linkList.add(10);
        linkList.add(7);
        linkList.add(9);
        linkList.add(4);
        System.out.println(Arrays.toString(linkList.toArray()));
        linkList.set(0, 1000);
        linkList.removeLast();
        System.out.println(Arrays.toString(linkList.toArray()));
    }
}

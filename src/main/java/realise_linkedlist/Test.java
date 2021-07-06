package realise_linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkList = new MyLinkedList<>();
        linkList.add(5);
        System.out.println(linkList.contains(5));
    }
}

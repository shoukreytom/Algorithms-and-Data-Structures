public class Test {

    public static void main(String[] args) {
        SinglyLinkedList slist = new SinglyLinkedList();
        slist.add(4);
        slist.add(5);
        slist.add(6);
        slist.add(8);
        slist.remove(4);
        slist.remove(6);
        slist.print();
        System.out.println("Size of slist is: " + slist.size());
    }

}

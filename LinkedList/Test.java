public class Test {

    public static void main(String[] args) {
        SinglyLinkedList slist = new SinglyLinkedList();
        slist.add(4);
        slist.add(5);
        slist.add(6);
        slist.add(8);
        System.out.println("Removed value is: " + slist.remove());
        System.out.println("Removed value is: " + slist.remove());
        slist.print();
        System.out.println("Size of slist is: " + slist.size());
        /*DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtHead(4);
        dlist.insertAtHead(7);
        dlist.insertAtTail(8);
        dlist.insertAtHead(5);
        dlist.removeFromHead(7);
        dlist.removeFromHead(8);
        dlist.removeFromHead(4);
        dlist.removeFromHead(5);
        // dlist.removeFromTail(5);     // Tests passed
        dlist.print();
        System.out.println("========== Reverse print ===========");
        dlist.printReverse();
        System.out.println("Size of dlist is: " + dlist.size());
        System.out.println("dlist is empty? " + dlist.isEmpty());
        CircularLinkedList list = new CircularLinkedList();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(12);
        list.remove();
        list.remove();
        list.print();*/
    }

}

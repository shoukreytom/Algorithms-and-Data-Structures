import java.util.Random;

public class Test {

    public static void main(String[] args) {
        /******** Singly LinkedList: Tests Passed ********/
        System.out.println("====== Singly LinkedList ======");
        SinglyLinkedList slist = new SinglyLinkedList();
        fillList(slist, 10);
        slist.remove();
        slist.remove();
        System.out.println(slist);
        System.out.println("Size of the list is: " + slist.size());
        System.out.println("=====================================\n");
        /////////////////////////////////////////////////////////

        /******** Doubly LinkedList: Tests Passed */
        System.out.println("====== Doubly LinkedList =====");
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtHead(4);
        dlist.insertAtHead(7);
        dlist.insertAtTail(8);
        dlist.insertAtHead(5);
        dlist.removeFromTail(7);
        dlist.removeFromHead(8);
        dlist.print();
        System.out.println("=== Reverse print ===");
        dlist.printReverse();
        System.out.println("Size of dlist is: " + dlist.size());
        System.out.println("dlist is empty? " + dlist.isEmpty());
        System.out.println("=====================================\n");
        //////////////////////////////////////////////////////////

        /********* Circular LinkedList: Tests Passed ********/
        System.out.println("====== Circular LinkedList ======");
        CircularLinkedList clist = new CircularLinkedList();
        fillList(clist, 10);
        clist.remove();
        clist.remove();
        System.out.println(clist);
        System.out.println("Size of clist is: " + clist.size());
        System.out.println("=====================================\n");
        ////////////////////////////////////////////////////////

        /******** Sorted LinkedList: Tests Passed ********/
        System.out.println("====== Sorted LinkedList ======");
        SortedLinkedList srlist = new SortedLinkedList();
        fillList(srlist, 10);
        srlist.remove();
        srlist.remove();
        System.out.println(srlist);
        System.out.println("Size of the list is: " + srlist.size());
        ///////////////////////////////////////////////////////////
    }

    public static void fillList(LinkedList list, int n) {
        Random rand = new Random();
        for(int i = 0; i < n; i++)
            list.add(Math.abs(rand.nextInt()%10));
    }

}

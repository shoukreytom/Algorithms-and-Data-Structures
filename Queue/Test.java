public class Test {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(9);
        queue.enqueue(19);
        queue.enqueue(20);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println("===========================");
        Deque deque = new Deque();
        deque.insertFront(3);
        deque.insertFront(5);
        deque.insertFront(9);
        
        deque.insertLast(19);
        deque.insertLast(30);
        deque.deleteLast();     // should delete 30
        deque.deleteFront();    // should delete 9
        deque.print();
        System.out.println("Element infornt of deque is: " + deque.getFront());
        System.out.println("Element at rear of deque is: " + deque.getRear());
    }

}

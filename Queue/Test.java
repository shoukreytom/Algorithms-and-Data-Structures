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
    }

}

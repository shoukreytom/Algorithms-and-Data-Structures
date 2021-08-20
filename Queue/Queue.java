public class Queue {

    private int capacity = 16;
    private int[] storage;
    private int head = -1;

    public Queue() {
        this.storage = new int[this.capacity];
    }

    public Queue(int size) {
        this.capacity = size;
        this.storage = new int[this.capacity];
    }

    public void enqueue(int value) {
        if(!isFull()) {
            this.head++;
            for(int i = this.head; i >= 0; i--) {
                int temp = this.storage[i];
                this.storage[i] = this.storage[i+1];
                this.storage[i+1] = temp;
            }
            this.storage[0] = value;
        }
    }

    public int dequeue() {
        if(!isEmpty()) {
            int temp = this.storage[this.head];
            this.head--;
            return temp;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.head < 0;
    }

    public boolean isFull() {
        return this.head == (this.capacity - 1);
    }

    public void print() {
        for(int i = 0; i <= this.head; i++) {
            System.out.println(this.storage[i]);
        }
    }
}

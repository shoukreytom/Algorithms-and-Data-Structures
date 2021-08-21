public class Deque {

    private int head = -1;
    private int tail = -1;
    private int[] storage;
    private int capacity = 16;

    public Deque() {
        this.storage = new int[this.capacity];
    }

    public Deque(int size) {
        this.capacity = size;
        this.storage = new int[this.capacity];
    }

    public void insertFront(int value) {
        if(!isFull()) {
            this.head++;
            this.tail++;
            for(int i = this.head; i >= 0; i--) {
                int temp = this.storage[i];
                this.storage[i] = this.storage[i+1];
                this.storage[i+1] = temp;
            }
            this.storage[0] = value;
        }
    }

    public void insertLast(int value) {
        if(!isFull()) {
            this.tail++;
            this.storage[this.tail] = value;
        }
    }

    public int deleteFront() {
        if(!isEmpty()) {
            int removed_el = this.storage[0];
            for(int i = 0; i <= this.tail; i++) {
                int temp = this.storage[i];
                this.storage[i] = this.storage[i+1];
                this.storage[i+1] = temp;
            }
            this.head--;
            this.tail--;
            return removed_el;
        }
        return -1;
    }

    public int deleteLast() {
        int removed_el = this.storage[this.tail];
        this.tail--;
        return removed_el;
    }

    public int getFront() {
        if(!isEmpty())
            return this.storage[0];
        return -1;
    }

    public int getRear() {
        if(!isEmpty())
            return this.storage[this.tail];
        return -1;
    }

    public boolean isEmpty() {
        return (this.head < 0) && (this.tail == this.head);
    }

    public boolean isFull() {
        return (this.head >= this.capacity-1) || (this.tail >= this.capacity-1);
    }

    public void print() {
        for(int i = 0; i <= this.head || i <= this.tail; i++) {
            System.out.println(this.storage[i]);
        }
    }

}

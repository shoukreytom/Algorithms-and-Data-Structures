public class Stack {

    private int head = -1;
    private int capacity = 16;
    private int[] storage;

    public Stack() {
        this.storage = new int[this.capacity];
    }

    public Stack(int size) {
        this.capacity = size;
        this.storage = new int[this.capacity];
    }

    public void push(int value) {
        if(!this.isFull()) {
            this.head++;
            this.storage[this.head] = value;
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int temp = storage[this.head];
            this.head--;
            return temp;
        }
        return -1;
    }

    public int peek() {
        return this.storage[this.head];
    }

    public boolean isEmpty() {
        return this.head < 0;
    }

    public boolean isFull() {
        return this.head == (this.capacity-1);
    }

    public void print() {
        for(int i = 0; i <= this.head; i++) {
            System.out.println(this.storage[i]);
        }
    }

}

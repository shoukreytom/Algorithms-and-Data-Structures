public class Stack {

    private int top = 0;
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
            this.storage[this.top] = value;
            this.top++;
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int temp = storage[this.top-1];
            this.top--;
            return temp;
        }
        return -1;
    }

    public int peek() {
        return this.storage[this.top-1];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top == this.capacity;
    }

    public void print() {
        for(int i = 0; i < this.top; i++) {
            System.out.println(this.storage[i]);
        }
    }

}

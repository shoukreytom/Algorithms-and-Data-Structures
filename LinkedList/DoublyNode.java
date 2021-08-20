public class DoublyNode {

    private DoublyNode next;
    private DoublyNode previous;
    private int data;

    public DoublyNode(int data) {
        this.data = data;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return this.next;
    }

    public DoublyNode getPrevious() {
        return this.previous;
    }

    public int getData() {
        return this.data;
    }
    
}

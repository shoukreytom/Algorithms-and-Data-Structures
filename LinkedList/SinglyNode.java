public class SinglyNode {

    private SinglyNode next;
    private int data;

    public SinglyNode(int data) {
        this.data = data;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    public SinglyNode getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

}

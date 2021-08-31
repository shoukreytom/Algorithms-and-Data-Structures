public class CircularNode {

    private CircularNode next;
    private int data;

    public CircularNode(int data) {
        this.data = data;
    }

    public void setNext(CircularNode node) {
        this.next = node;
    }

    public CircularNode getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

}

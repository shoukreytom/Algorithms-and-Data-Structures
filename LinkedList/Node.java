public class Node {

    private Node next;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

}

public class SinglyLinkedList {

    private SinglyNode head;
    private int length = 0;

    public void add(int value) {
        SinglyNode new_node = new SinglyNode(value);
        new_node.setNext(null);
        if (this.head == null) {
            this.head = new_node;
        } else {
            new_node.setNext(this.head);
            this.head = new_node;
        }
        length++;
    }

    public int remove() {
        int temp;
        if(this.head == null)
            temp = -1;
        else {
            temp = this.head.getData();
            this.head = this.head.getNext();
            length--;
        }
        return temp;
    }

    public int size() {
        return this.length;
    }

    public void print() {
        SinglyNode current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}

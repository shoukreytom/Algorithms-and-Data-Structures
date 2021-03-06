public class SinglyLinkedList extends LinkedList{

    private Node head;
    private int length = 0;

    @Override
    public void add(int value) {
        Node new_node = new Node(value);
        new_node.setNext(null);
        if (this.head == null) {
            this.head = new_node;
        } else {
            new_node.setNext(this.head);
            this.head = new_node;
        }
        length++;
    }

    @Override
    public Node remove() {
        if(this.head == null)
            return null;
        else {
            Node removed_node = this.head;
            this.head = this.head.getNext();
            length--;
            return removed_node;
        }
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        String str = "[";
        Node current = this.head;
        while (current != null) {
            if(current.getNext() == null)
                str += current.getData();
            else
                str += current.getData() + ", ";
            current = current.getNext();
        }
        str += "]";
        return str;
    }
}

public class SinglyLinkedList {

    private SinglyNode head;

    public void add(int value) {
        SinglyNode new_node = new SinglyNode(value);
        new_node.setNext(null);
        if (this.head == null) {
            this.head = new_node;
        } else {
            SinglyNode current = this.head;
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(new_node);
        }
    }

    public int remove(int value) {
        if (this.head.getData() == value) {
            int removed_value = this.head.getData();
            SinglyNode next_node = this.head.getNext();
            this.head = next_node;
            return removed_value;
        } else {
            SinglyNode current = this.head;
            while (current != null) {
                if (current.getNext() != null && current.getNext().getData() == value) {
                    SinglyNode removed_node = current.getNext();
                    SinglyNode next_node = removed_node.getNext();
                    current.setNext(next_node);
                    removed_node.setNext(null);
                    return removed_node.getData();
                }
            }
        }
        return -1;
    }

    public int size() {
        int length = 0;
        SinglyNode current = this.head;
        while (current != null) {
            current = current.getNext();
            length++;
        }
        return length;
    }

    public void print() {
        SinglyNode current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}

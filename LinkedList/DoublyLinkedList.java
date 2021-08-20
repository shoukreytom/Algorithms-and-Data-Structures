public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;

    public void insertAtHead(int value) {
        DoublyNode new_node = new DoublyNode(value);
        new_node.setPrevious(null);
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.head.setPrevious(new_node);
            new_node.setNext(this.head);
            this.head = new_node;
        }
    }

    public void insertAtTail(int value) {
        DoublyNode new_node = new DoublyNode(value);
        new_node.setNext(null);
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.tail.setNext(new_node);
            new_node.setPrevious(this.tail);
            this.tail = new_node;
        }
    }

    public int removeFromHead(int value) {
        // We have four conditions:
        // 1- if a node neither has next nor previous (single node)
        // 2- if a node has next but no previous (head)
        // 3- if a node has previous but no next (tail)
        // 4- if a node has both next and previous (middle)
        DoublyNode current = this.head;
        while(current != null) {
            if(current.getData() == value) {
                if(current.getPrevious() == null && current.getNext() == null) {
                    this.head = this.tail = null;
                }
                else if(current.getPrevious() == null && current.getNext() != null) {
                    DoublyNode next_node = current.getNext();
                    next_node.setPrevious(null);
                    this.head = next_node;
                }
                else if(current.getPrevious() != null && current.getNext() == null) {
                    DoublyNode previous_node = current.getPrevious();
                    previous_node.setNext(null);
                    this.tail = previous_node;
                }
                else {
                    DoublyNode previous_node = current.getPrevious();
                    DoublyNode next_node = current.getNext();
                    next_node.setPrevious(previous_node);
                    current.getPrevious().setNext(next_node);
                }
            }
            current = current.getNext();
        }
        return -1;
    }

    public int removeFromTail(int value) {
        // We have four conditions:
        // 1- if a node neither has next nor previous (single node)
        // 2- if a node has next but no previous (head)
        // 3- if a node has previous but no next (tail)
        // 4- if a node has both next and previous (middle)
        DoublyNode current = this.tail;
        while(current != null) {
            if(current.getData() == value) {
                if(current.getPrevious() == null && current.getNext() == null) {
                    this.head = this.tail = null;
                }
                else if(current.getPrevious() == null && current.getNext() != null) {
                    DoublyNode next_node = current.getNext();
                    next_node.setPrevious(null);
                    this.head = next_node;
                }
                else if(current.getPrevious() != null && current.getNext() == null) {
                    DoublyNode previous_node = current.getPrevious();
                    previous_node.setNext(null);
                    this.tail = previous_node;
                }
                else {
                    DoublyNode previous_node = current.getPrevious();
                    DoublyNode next_node = current.getNext();
                    next_node.setPrevious(previous_node);
                    current.getPrevious().setNext(next_node);
                }
            }
            current = current.getPrevious();
        }
        return -1;
    }

    public int size() {
        int length = 0;
        DoublyNode current = this.head;
        while (current != null) {
            current = current.getNext();
            length++;
        }
        return length;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void print() {
        DoublyNode current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void printReverse() {
        DoublyNode current = this.tail;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getPrevious();
        }
    }
}

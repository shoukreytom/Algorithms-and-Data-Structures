public class CircularLinkedList extends LinkedList{

    private Node cursor;
    private int length = 0;

    public CircularLinkedList() {
        this.cursor = null;
    }

    @Override
    public void add(int value) {
        Node new_node = new Node(value);
        if(cursor == null) {
            new_node.setNext(new_node);
            cursor = new_node;
        }
        else {
            new_node.setNext(cursor.getNext());
            cursor.setNext(new_node);
        }
        length++;
    }

    @Override
    public Node remove() {
        Node old_node = cursor.getNext();
        if(old_node == cursor)
            cursor = null;
        else {
            cursor.setNext(old_node.getNext());
            old_node.setNext(null);
            length--;
        }
        return old_node;
    }

    public void advance() {
        cursor = cursor.getNext();
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public String toString() {
        if(cursor == null)
            return "[]";
        String str = "[" + cursor.getData() + ", ";
        Node old_cursor = cursor;
        for(advance(); cursor != old_cursor; advance()) {
            if(cursor.getNext() == old_cursor)
                str += cursor.getData();
            else
                str += cursor.getData() + ", ";
        }
        str += "]";
        return str;
    }

}

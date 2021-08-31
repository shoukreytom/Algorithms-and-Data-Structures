public class CircularLinkedList {
    private CircularNode cursor;

    public CircularLinkedList() {
        this.cursor = null;
    }

    public void add(int value) {
        CircularNode new_node = new CircularNode(value);
        if(cursor == null) {
            new_node.setNext(new_node);
            cursor = new_node;
        }
        else {
            new_node.setNext(cursor.getNext());
            cursor.setNext(new_node);
        }
    }

    public CircularNode remove() {
        CircularNode old_node = cursor.getNext();
        if(old_node == cursor)
            cursor = null;
        else
            cursor.setNext(old_node.getNext());
            old_node.setNext(null);
        return old_node;
    }

    public void advance() {
        cursor = cursor.getNext();
    }

    public void print() {
        if(cursor == null)
            return;
        System.out.println(cursor.getData());
        CircularNode old_cursor = cursor;
        for(advance(); cursor != old_cursor; advance())
            System.out.println(cursor.getData());
    }

}

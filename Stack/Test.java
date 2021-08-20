public class Test {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for(int i = 0; i < 17; i++) {
            stack.push(i);
        }
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack is full? " + stack.isFull());
        // for(int i = 0; i < 17; i++) {
        //     stack.pop();
        // }
        System.out.println("Stack is empty? " + stack.isEmpty());
    }
}

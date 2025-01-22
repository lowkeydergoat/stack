public class StackTest {
    public static void main(String[] args) {
        System.out.println("testing integer");
        Stack<Integer> intStack = new Stack<>(5);
        try {
            intStack.push(1);
            intStack.push(2);
            intStack.push(3);
            intStack.push(4);
            intStack.push(5);
            System.out.println("stack elements: " + intStack.list());
            System.out.println("top element: " + intStack.peek());
            System.out.println("popped element: " + intStack.pop());
            System.out.println("stack elements after pop: " + intStack.list());
            intStack.push(6);
            System.out.println("stack elements after pushing 6: " + intStack.list());
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\ntesting string");
        Stack<String> strStack = new Stack<>(3);
        try {
            strStack.push("Yousef Sheikho");
            strStack.push("Mario Milkov");
            strStack.push("Lukas Hecher");
            System.out.println("stack elements: " + strStack.list());
            System.out.println("top element: " + strStack.peek());
            System.out.println("popped element: " + strStack.pop());
            System.out.println("stack elements after pop: " + strStack.list());
            strStack.push("TGM");
            System.out.println("stack elements after pushing Date: " + strStack.list());
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}

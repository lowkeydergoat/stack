/**
 * Stack Program
 *
 * @param <T> Universal Stack element where u can put anything
 */
public class Stack<T> {
    private Object[] stackArray;
    private int top;
    private int maxSize;

    /**
     * Creates a stack with a default size of 10.
     */
    public Stack() {
        this.maxSize = 10;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    /**
     * Creates a stack with a custom size.
     *
     * @param size The maximum size of the stack.
     */
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element The element to be pushed onto the stack.
     * @throws StackFullException If the stack is full and cannot accept more elements.
     */
    public void push(T element) throws StackFullException {
        if (top == maxSize - 1) {
            throw new StackFullException("Stack is full, cannot push element: " + element);
        }
        stackArray[++top] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty and there are no elements to pop.
     */
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot pop element.");
        }
        return (T) stackArray[top--];
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty and there is no element to peek.
     */
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot peek element.");
        }
        return (T) stackArray[top];
    }

    /**
     * Returns a string version of the elements in the stack.
     *
     * @return A string version of the stack or "Stack is empty." if the stack is empty.
     */
    public String list() {
        if (top == -1) {
            return "Stack is empty.";
        }
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += stackArray[i].toString();
            if (i < top) {
                result += ";";
            }
        }
        return result;
    }
}

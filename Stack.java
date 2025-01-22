public class Stack<T> {
    private Object[] stackArray;
    private int top;
    private int maxSize;

    public Stack() {
        this.maxSize = 10;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }
    public void push(T element) throws StackFullException {
        if (top == maxSize - 1) {
            throw new StackFullException("Stack is full, cannot push element: " + element);
        }
        stackArray[++top] = element;
    }
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot pop element.");
        }
        return (T) stackArray[top--];
    }
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot peek element.");
        }
        return (T) stackArray[top];
    }
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
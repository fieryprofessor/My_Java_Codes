package Stack;

public class StackArray {
    private int capacity;
    private int data[];
    private int top = -1;

    public StackArray(int s) {
        data = new int[s];
        capacity = s;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        if (top > -1) {
            for (int i = 0; i <= top; i++) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }

    public void push(int value) throws IllegalStateException {
        if (top + 1 == capacity) {
            throw new IllegalStateException("Stack Overflow");
        }
        top++;
        data[top] = value;
}

    public int peek() throws IllegalStateException {
    if (isEmpty()) {
        throw new IllegalStateException("Stack Underflow");
    }
    return data[top];
}

    public int pop() throws IllegalStateException {
    if (isEmpty()) {
        throw new IllegalStateException("Stack Underflow");
    }
    int top_value = data[top];
    top--;
    return top_value;
}

    public static void main(String args[]) {
        StackArray s = new StackArray(5);
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(8);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.print();
    }
 }

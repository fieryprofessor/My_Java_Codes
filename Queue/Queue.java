package Queue;

public class Queue {
    private int size;
    private int capacity;
    private int data[];
    int front = 0;
    int back = 0;

    public Queue(int n) {
        size = 0;
        capacity = n;
        data = new int[n];
    }

    public Queue() {
        this(1000);
    }

    public boolean add(int value) {
        if (size >= capacity) {
            System.out.println("Queue is Full");
            return false;
        } else {
            size++;
            data[back] = value;
            back = (++back) % capacity;
        }
        return true;
    }
    
    public int remove() {
        int value;
        if (size <= 0) {
            System.out.println("Queue is empty");
            return -999;
        } else {
            size--;
            value = data[front];
            front = (++front) % capacity;
        }
        return value;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int temp = front;
        int s = size;
        System.out.print("Queue is: ");
        while (s > 0) {
            s--;
            System.out.print(data[temp] + " ");
            temp = (++temp) % capacity;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        System.out.println("Queue size: "+queue.size());
        System.out.println("Queue remove: "+queue.remove());
        queue.print();
        System.out.println(queue.size());
}

}

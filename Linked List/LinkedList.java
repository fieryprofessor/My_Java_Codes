public class LinkedList {
    
    private class Node {
        private int value;
        private Node next;

        public Node(int v, Node n) {
            value = v;
            next = n;
        }
    }

    private Node head;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return head.value;
    }

    // insert at the start
    public void addHead(int value) {
            head = new Node(value, head);
            size++;
        }
    
    //insert at the end
    public void addTail(int value) {
            Node newNode = new Node(value, null);
            Node curr = head;

            if (head == null) {
                head = newNode;
                return;
            }
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    
    public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String args[]) {
            LinkedList ll = new LinkedList();
            ll.addTail(1);
            ll.addTail(2);
            ll.addTail(3);
            ll.display();
            System.out.println("Size: " + ll.size());
            System.out.println("is Empty: " + ll.isEmpty());
            System.out.println("Peek: " + ll.peek());
    }

}

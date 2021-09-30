public class MyLinkedListQueue {

    private Node head;
    private Node tail;
    class Node {
        public int key;
        public Node next;

        public Node(int key){
            this.key= key;
            next=null;
        }
    }

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (tail == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public Node dequeue() {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        if (head == null)
            tail = null;
        return temp;
    }
}

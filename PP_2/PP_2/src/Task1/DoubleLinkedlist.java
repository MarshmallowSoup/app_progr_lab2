package Task1;

public class DoubleLinkedlist {
    protected Node head;

    public DoubleLinkedlist() {
        this.head = null;
    }


    public void enqueue(int value) {
        Node newNode = new Node(value, null, null);

        if (head == null) {
            this.head = newNode;
        } else {
            Node pointer = FindLast();
            pointer.setNext(newNode);
            newNode.setPrev(pointer);
        }
    }

    private Node FindLast() {
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        return pointer;
    }

    public void print(){
        Node pointer = head;
        System.out.print("| ");
        while (pointer !=null){
            System.out.print(pointer.getData()+" ");
            pointer = pointer.getNext();
        }
        System.out.println(" |");
    }


    public void remove() {
        Node pointer = FindLast();
        if (pointer == head) {
            head = null;
        } else {
            pointer.getPrev().setNext(null);
            pointer = null;
        }
    }


    public int dequeue() {
        if(head == null){
            return -1;
        }
        int res = head.getData();
        head = head.getNext();
        head.getPrev().setNext(null);
        head.setPrev(null);
        return res;
    }


    public Node get() {
        return FindLast();
    }

    public int getValue() {
        return get().getData();
    }
}

package Task1;

public class Node {
    protected int data;
    protected Node next;
    protected Node prev;

    public Node(){
        this.next = null;
        this.prev = null;
    }

    public Node(int value){
        this.next = null;
        this.prev = null;
        this.data = value;
    }

    public Node(int value, Node next, Node prev){
        this.next = next;
        this.prev = prev;
        this.data = value;
    }

    public Node(Node next, Node prev){
        this.next = next;
        this.prev = prev;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

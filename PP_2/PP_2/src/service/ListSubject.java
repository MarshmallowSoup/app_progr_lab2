package service;

public class ListSubject {
    private class Node{
        private String name;
        private int rate;
        private Node next;
        private Node prev;

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

        public Node(String name, int rate) {
            this.name = name;
            this.rate = rate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }
    }

    private Node head;

    public ListSubject(){
        head = null;
    }

    public ListSubject(Node head){
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(String name, int rate){
        Node newNode = new Node(name, rate);
        if(head == null){
            head = newNode;
        }
        else{
            Node pointer = FindLast();
            pointer.next = newNode;
            newNode.prev = pointer;
        }
    }

    private Node FindLast() {
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        return pointer;
    }

    public void print () {
        Node pointer = head;
        //System.out.println("Subject: ");
        while (pointer != null) {
            if(pointer.rate == -1){
                System.out.print(" " + pointer.name + " N/A" );
            }
            else {
                System.out.print(" " + pointer.name + " " + pointer.rate);
            }
            pointer = pointer.getNext();
        }
        System.out.println();
    }

    public String getSubject(){
        return head.name;
    }

    public boolean search(String subject){
        Node pointer = head;
        while (pointer != null){
            if(pointer.name.equals(subject)){
                return true;

            }
            pointer = pointer.next;
        }
        return false;
    }

    public void changeRate(String subject, int rate){
        Node pointer = head;
        while (pointer != null) {
            if(pointer.name.equals(subject)){
                pointer.setRate(rate);
            }
            pointer = pointer.getNext();
        }
    }

    public boolean printSubject(String subject) {
        Node pointer = head;
        while (pointer != null) {
            if(pointer.name.equals(subject)){
                System.out.print(pointer.name+": "+pointer.rate+ "  ");
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

}

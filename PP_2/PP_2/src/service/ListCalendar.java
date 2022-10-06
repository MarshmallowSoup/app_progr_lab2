package service;


public class ListCalendar {
        private class Node{
        public Node next;
        public Node prev;
        public String name;
        public String date;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Node(){
            next = null;
            prev = null;
        }

        public Node(String name, String date){
            this.date = date;
            this.name = name;
        }
    }

    private Node head;

    public ListCalendar(){
        head = null;
    }

    public ListCalendar(Node head){
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(String name, String date){
        Node newNode = new Node(name, date);
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
        System.out.println("Info: ");
        System.out.println("-------------");
        while (pointer != null) {
            System.out.println("  "+pointer.name+" "+pointer.date);
            pointer = pointer.getNext();
        }
        System.out.println("-------------");
    }

}

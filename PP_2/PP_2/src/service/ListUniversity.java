package service;

public class ListUniversity {

    private class Node{
        private String name;
        private ListGroup groupHead;
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

        public Node(String name, ListGroup groupHead) {
            this.name = name;
            this.groupHead = groupHead;
        }

        public Node(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ListGroup getGroupHead() {
            return groupHead;
        }

        public void setGroupHead(ListGroup groupHead) {
            this.groupHead = groupHead;
        }
    }

    private Node head;

    public void add(String name, ListGroup listGroup){
        Node newNode = new Node(name, listGroup);
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

    public void print(){
        Node pointer = head;
        System.out.println("University "+ pointer.name+":");
        while (pointer != null){
            pointer.groupHead.print();
            pointer =pointer.next;
        }
    }

    public void printRate(){
        Node pointer = head;
        System.out.println("------------\nRate\n-------------");
        while (pointer != null){
            pointer.groupHead.printRate();
            pointer =pointer.next;
        }
    }

    public void changeRate(String name, String subject, int rate){
        head.groupHead.changeRate(name, subject, rate);
    }

    public void deleteRate(String name, String subject){
        head.groupHead.changeRate(name, subject, -1);
    }

    public void printStud(String name){
        head.groupHead.printStud(name);
    }

    public void printSubject(String subject){
        head.groupHead.printSubject(subject);
    }

    public void addSubject(String name, int num){
        head.groupHead.addSubject(name, num);
    }

    public void addInfo(String name, int group, String date){
        head.groupHead.addInfo(name, group, date);
    }

    public void sort(){
        head.groupHead.sort();
    }

    public void search(String name){
        head.groupHead.search(name);
    }
}

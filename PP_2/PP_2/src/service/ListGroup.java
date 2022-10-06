package service;

public class ListGroup {
    private class Node {
        private Node next;
        private Node prev;
        private ListCalendar infoHead;
        private ListStudent studHead;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public ListCalendar getInfoHead() {
            return infoHead;
        }

        public void setInfoHead(ListCalendar infoHead) {
            this.infoHead = infoHead;
        }

        public ListStudent getStudHead() {
            return studHead;
        }

        public void setStudHead(ListStudent studHead) {
            this.studHead = studHead;
        }

        public Node() {
            next = null;
            prev = null;
        }

        public Node(String name, ListStudent studHead, ListCalendar infoHead) {
            this.infoHead = infoHead;
            this.studHead = studHead;
            this.name = name;
        }
    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public ListGroup(Node head) {
        this.head = head;
    }

    public ListGroup() {

    }

    public void add(String name, ListStudent studHead, ListCalendar infoHead) {
        Node newNode = new Node(name, studHead, infoHead);
        if (head == null) {
            head = newNode;
        } else {
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

    public void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.println("Group " + pointer.name + ":");
            pointer.infoHead.print();
            pointer.studHead.print();
            pointer = pointer.next;
        }
    }

    public void printRate() {
        Node pointer = head;
        while (pointer != null) {
            System.out.println("Group " + pointer.name + ":");
            pointer.studHead.printRate();
            pointer = pointer.next;
        }
    }


    public void addSubject(String name, int num) {
        Node pointer = head;
        int counter = 1;
        while (pointer != null) {
            if (num == counter) {
                pointer.studHead.addSubject(name, num);
            }
            counter++;
            pointer = pointer.next;
        }
    }

    public void addInfo(String name, int num, String date) {
        Node pointer = head;
        int counter = 1;
        while (pointer != null) {
            if (num == counter) {
                pointer.infoHead.add(name, date);
            }
            counter++;
            pointer = pointer.next;
        }
    }

    public void sort() {
        Node pointer = new Node();
        pointer = head;
        while (pointer != null) {
            pointer.studHead.sort();
            pointer = pointer.next;
        }

    }

    public void search(String name) {
        Node pointer = new Node();
        pointer = head;
        System.out.println("Student with " + name + ": \n");
        while (pointer != null) {
            pointer.studHead.search(name);
            pointer = pointer.next;
        }
    }

    public void changeRate(String name, String subject, int num) {
        Node pointer = head;
        while (pointer != null) {
            pointer.studHead.changeRate(name, subject, num);
            pointer = pointer.next;
        }
    }

    public void printSubject(String subject) {
        Node pointer = head;
        System.out.println("Subject " + subject + "");
        while (pointer != null) {
            pointer.studHead.printSubject(subject);
            pointer = pointer.next;
        }
    }

    public void printStud(String name){
        Node pointer = head;
        while (pointer != null){
            pointer.studHead.printStud(name);
            pointer = pointer.next;
        }
    }

}

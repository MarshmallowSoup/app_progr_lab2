package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStudent {

    private class Node {
        private Node next;
        private Node prev;
        private String name;
        private ListSubject subjectHead;

        public Node(String name, ListSubject listSubject) {
            this.name = name;
            this.subjectHead = listSubject;
        }

        public ListSubject getSubjectHead() {
            return subjectHead;
        }

        public void setSubjectHead(ListSubject subjectHead) {
            this.subjectHead = subjectHead;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node() {
            next = null;
            prev = null;
        }

        public Node(String name, int rate) {
            this.name = name;
        }
    }

    private Node head;

    public ListStudent() {
        head = null;
    }

    public ListStudent(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(String name, ListSubject subjectHead) {
        Node newNode = new Node(name, subjectHead);
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
        System.out.println("Student: \n");
        while (pointer != null) {
            System.out.println(pointer.name);
            pointer.subjectHead.print();
            //System.out.println(pointer.name+" "+pointer.rate);
            pointer = pointer.getNext();
        }
    }

    public void printRate(){
        Node pointer = head;
        while (pointer != null){
            System.out.println(pointer.name+":");
            pointer.subjectHead.print();
            pointer =pointer.next;
        }
    }

    public void changeRate(String name, String Subject, int rate){
        Node pointer = head;
        while (pointer != null) {
            if(pointer.name.equals(name)){
            pointer.subjectHead.changeRate(Subject, rate);
            }
            pointer = pointer.next;
        }
    }

    public void addSubject(String name, int num) {
        Node pointer = head;
        while (pointer != null) {
            pointer.subjectHead.add(name, 0);
            pointer = pointer.next;
        }
    }

    public void sort() {
        List<String> list= new ArrayList<>();
        Node pointer = head;
        while (pointer != null){
            list.add(pointer.name);
            pointer = pointer.next;
        }
        Collections.sort(list);
        System.out.println(list);
    }

    private boolean big(String first, String second) {
        return first.charAt(0) < second.charAt(0)
                || (first.charAt(0) == second.charAt(0) && first.charAt(1) > second.charAt(1));
    }

    public void search(String subject) {
        Node pointer = head;

        while (pointer != null) {
            if(pointer.subjectHead.search(subject)){
                System.out.println(pointer.name);
            }
            pointer = pointer.getNext();
        }
    }

    public void printSubject( String subject) {
        Node pointer = head;
        while (pointer != null) {
            if(pointer.subjectHead.printSubject(subject)){
                System.out.println(pointer.name);
            }
            //pointer.subjectHead.printSubject(subject);

            pointer = pointer.next;
        }
    }

    public  void printStud(String name){
        Node pointer = head;
        while (pointer != null){
            if(pointer.name.equals(name)){
                System.out.println(name+":");
                pointer.subjectHead.print();
            }

            pointer = pointer.next;
        }
    }

}

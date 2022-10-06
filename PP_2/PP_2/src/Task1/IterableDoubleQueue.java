package Task1;

import java.util.Iterator;

public class IterableDoubleQueue extends DoubleLinkedlist implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer>{
        Node next = head;

        @Override
        public boolean hasNext() {
            if(next != null){
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Integer next() {
            int data = next.getData();
            next = next.getNext();
            return data;
        }
    }
}

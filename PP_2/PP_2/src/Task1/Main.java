package Task1;

public class Main {

    public static void main(String[] args) {
        IterableDoubleQueue queue = new IterableDoubleQueue();
        queue.enqueue(300);
        queue.enqueue(2);
        queue.enqueue(69);
        queue.enqueue(420);
        queue.enqueue(5);
        queue.remove();

        System.out.println(queue.dequeue());

        queue.print();

        for (Integer a : queue) {
            System.out.print(a+" ");
        }

    }
}

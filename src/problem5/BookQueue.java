package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> list = new LinkedList<>();

    public void enqueue(Book b) {
        list.addLast(b);
    }

    public Book dequeue() {
        return list.removeFirst();
    }

    public Book peek() {
        return list.getFirst();
    }

    public void printQueue() {
        for (Book b : list)
            System.out.println("- " + b);
    }
}

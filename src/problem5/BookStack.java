package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> list = new LinkedList<>();

    public void push(Book b) {
        list.addFirst(b);
    }

    public Book pop() {
        return list.removeFirst();
    }

    public Book peek() {
        return list.getFirst();
    }

    public void printStack() {
        for (Book b : list)
            System.out.println("- " + b);
    }
}


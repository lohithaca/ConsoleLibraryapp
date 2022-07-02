package Library;

public class Main {

    public static void main(String[] args) {
	Library Library1 = new Library("115 New Cavendish Street");

    Library1.addBooks(new Book("Introduction to Algorithms"));
    Library1.addBooks(new Book("Thinking in Java"));
    Library1.addBooks(new Book("Design Patterns"));
    Library1.addBooks(new Book("Programming C# 8.0"));

    System.out.println("Book Information");
    Library1.printInfo();

    System.out.println("Available Books");
    Library1.printAvailableBooks();

    System.out.println("Borrow a book - Introduction to Algorithms ");
    Library1.borrowBook("Introduction to Algorithms");
    Library1.printInfo();
    }
}

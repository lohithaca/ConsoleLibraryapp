package Library;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Library Library1 = new Library("115");
    Book b1 = new Book("Book one");
    Book b2 = new Book("Book Two");

    @org.junit.jupiter.api.Test
    void markAsBorrowed() {
        b1.markAsBorrowed();
        assertEquals(true,b1.isBorrowed());

    }

    @Test
    void markAsReturned() {
        b2.markAsBorrowed();
        b2.markAsReturned();
        assertEquals(false,b2.isBorrowed());
    }

    @Test
    void isBorrowed() {
        assertEquals(false,b1.isBorrowed());

    }

    @Test
    void getbTitle() {
        assertEquals("Book Two", b2.getbTitle());
    }
}
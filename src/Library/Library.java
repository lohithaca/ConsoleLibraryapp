package Library;

import java.util.ArrayList;

public class Library {
    private String address;
    private  String hours;
    private ArrayList<Book> booksList = new ArrayList<Book>();
    private int numberOfBooks;

    public Library(String address){
        this.address = address;
    }

    public void addBooks(Book book) {
        booksList.add(book);
    }

    public void printInfo() {
        for(int i=0;i<booksList.size();i++){
            System.out.println("Book Title : "+booksList.get(i).getbTitle()+" - Is Borrowed " +booksList.get(i).isBorrowed());
        }
    }

    public void printAvailableBooks(){
        for(int i=0;i<booksList.size();i++){
            if(!booksList.get(i).isBorrowed()) {
                System.out.println("Book Title : " + booksList.get(i).getbTitle());
            }else {
                System.out.println("Book Has already borrowed" );
            }
         }
    }

    public void borrowBook(String bName){
        for(int i = 0; i < booksList.size();i++){
            if(booksList.get(i).getbTitle().equals(bName)){
                booksList.get(i).markAsBorrowed();
                break;
            }
        }
    }

    public void returnBook(String bName){
        for(int i = 0; i < booksList.size();i++){
            if(booksList.get(i).getbTitle().equals(bName)){
                booksList.get(i).markAsReturned();
                break;
            }
        }
    }
}

package Library;

public class Book {
    private String bTitle;
    private boolean borrowed;

    public Book(String bTitle) {
        this.bTitle = bTitle;
        borrowed = false;
    }

    public void markAsBorrowed() {
        borrowed = true;
    }

    public void markAsReturned(){
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getbTitle(){
        return bTitle;
    }
}

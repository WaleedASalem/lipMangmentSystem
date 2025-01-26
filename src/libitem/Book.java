package libitem;

public class Book extends LibraryItem{
    private String author;
    private String ISBN;
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }


    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

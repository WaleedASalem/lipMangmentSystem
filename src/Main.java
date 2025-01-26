import libitem.Book;
import libitem.DVD;
import libitem.Magazine;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setISBN("54");
        book.setAuthor("waleed");
        book.setNumberOfPages(500);
        book.setAvailable(true);
        book.setTitle("sadad");
        book.setTotalCopies(25);
        book.setBorrowedCopies(2);
        book.borrowItem(1, book.getTotalCopies(), book.getTitle());
        book.returnItem(3, book.getTitle(), book.getTotalCopies());
        book.checkAvailability(book.getTotalCopies(), book.getBorrowedCopies());
        book.displayDetails();



        DVD dvd =new DVD();
        dvd.setTitle("s1");
        dvd.setDirector("kareem");
        dvd.setDuration(140);
        dvd.setAvailable(false);
        dvd.setTotalCopies(2);
        dvd.setBorrowedCopies(2);
        dvd.borrowItem(1, dvd.getTotalCopies(), dvd.getTitle());
        dvd.returnItem(3, dvd.getTitle(), dvd.getTotalCopies());
        dvd.checkAvailability(dvd.getTotalCopies(), dvd.getBorrowedCopies());


        Magazine magazine = new Magazine("salem","adas",true,3,2);

    }
}
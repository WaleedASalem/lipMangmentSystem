package libitem;

import java.util.Date;

public class Magazine extends LibraryItem {

    private String publisher;

    public Magazine(String publisher,String title,boolean isAvilable,int totalCopies,int borrowedCopies)  {
        this.publisher = publisher;
        this.title=title;
        this.isAvailable=isAvilable;
        this.totalCopies=totalCopies;
        this.borrowedCopies=borrowedCopies;

    }
}

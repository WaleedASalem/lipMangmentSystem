package libitem;

public class LibraryItem {
    protected int totalCopies;
    protected String title;
    protected int borrowedCopies;

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    protected boolean isAvailable;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(int borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    public  void displayDetails() {
        System.out.println("Total copies: " +totalCopies);
        System.out.println("Available copies: " +(totalCopies-borrowedCopies));
    }

    public  void borrowItem(int borrowedCopies,int totalCopies,String title) {
        if (borrowedCopies < totalCopies) {
            borrowedCopies++;
            this.borrowedCopies=borrowedCopies;
            totalCopies--;
            this.totalCopies=totalCopies;
            System.out.println("You have borrowed " + title);
        } else {
            System.out.println("Sorry, all copies of " + title + " are currently borrowed");

        }
    }

    public void returnItem(int borrowedCopies, String title,int totalCopies) {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            this.borrowedCopies=borrowedCopies;
            totalCopies++;
            this.totalCopies=totalCopies;
            System.out.println("You have returned " + title);
        } else {
            System.out.println("No borrowed copies to return for " + title);
        }
    }

    public void checkAvailability(int totalCopies,int borrowedCopies) {
        if (totalCopies - borrowedCopies > 0) {
            System.out.println(title + " is available for borrowing");
        } else {
            System.out.println(title + " is not available for borrowing");
        }
    }
}

package task1;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromOverduedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус перехода: " + book.getStatus());
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Статус перехода: " + book.getStatus());
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус перехода: " + book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус перехода: " + book.getStatus());
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Статус перехода: " + book.getStatus());
        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус перехода: " + book.getStatus());
    }
}
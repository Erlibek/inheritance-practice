package task1;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Переход книги из статуса 'X' в статус 'Y' невозможен";
        if (book.getStatus() != Status.BORROWED) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            case OVERDUED -> book.setStatus(Status.OVERDUED);
            default -> System.out.println(errorMessage);
        }
    }
}
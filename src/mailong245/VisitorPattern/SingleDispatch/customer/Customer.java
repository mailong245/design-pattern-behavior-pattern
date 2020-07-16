package mailong245.VisitorPattern.SingleDispatch.customer;

import mailong245.VisitorPattern.SingleDispatch.book.Book;
import mailong245.VisitorPattern.SingleDispatch.book.BusinessBook;
import mailong245.VisitorPattern.SingleDispatch.book.ProgramingBook;

public interface Customer {
    void buy(Book book);

    void buy(ProgramingBook programingBook);

    void buy(BusinessBook businessBook);
}

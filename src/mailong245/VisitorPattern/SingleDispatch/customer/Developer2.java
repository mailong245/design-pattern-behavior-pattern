package mailong245.VisitorPattern.SingleDispatch.customer;

import mailong245.VisitorPattern.SingleDispatch.book.Book;
import mailong245.VisitorPattern.SingleDispatch.book.BusinessBook;
import mailong245.VisitorPattern.SingleDispatch.book.ProgramingBook;

public class Developer2 implements Customer {
    @Override
    public void buy(Book book) {
        if (book instanceof ProgramingBook) {
            ProgramingBook programingBook = (ProgramingBook) book;
            buy(programingBook);
        } else if (book instanceof BusinessBook) {
            BusinessBook businessBook = (BusinessBook) book;
            buy(businessBook);
        } else {
            System.out.println("Developer buy a Book");
        }
    }

    @Override
    public void buy(ProgramingBook programingBook) {
        System.out.println("Developer buying Programing Book");
    }

    @Override
    public void buy(BusinessBook businessBook) {
        System.out.println("Developer buying Business Book");
    }
}

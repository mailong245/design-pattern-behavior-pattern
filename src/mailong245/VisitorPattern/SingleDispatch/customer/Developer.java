package mailong245.VisitorPattern.SingleDispatch.customer;

import mailong245.VisitorPattern.SingleDispatch.book.Book;
import mailong245.VisitorPattern.SingleDispatch.book.BusinessBook;
import mailong245.VisitorPattern.SingleDispatch.book.ProgramingBook;

public class Developer implements Customer {
    @Override
    public void buy(Book book) {
        System.out.println("Developer buying Book");
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

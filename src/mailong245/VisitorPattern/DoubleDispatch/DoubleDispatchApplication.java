package mailong245.VisitorPattern.DoubleDispatch;

import mailong245.VisitorPattern.DoubleDispatch.Book.Book;
import mailong245.VisitorPattern.DoubleDispatch.Book.BusinessBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.DesignPatternBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.JavaCoreBook;
import mailong245.VisitorPattern.DoubleDispatch.Visitor.Visitor;
import mailong245.VisitorPattern.DoubleDispatch.Visitor.VisitorImpl;

public class DoubleDispatchApplication {

    public static void main(String[] args) throws Exception {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();

        Visitor v = new VisitorImpl();
        book1.accept(v);
        book2.accept(v);
        book3.accept(v);
    }
}
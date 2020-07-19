package mailong245.VisitorPattern.DoubleDispatch.Visitor;

import mailong245.VisitorPattern.DoubleDispatch.Book.BusinessBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.DesignPatternBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.JavaCoreBook;

public interface Visitor {

    void visit(BusinessBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);
}

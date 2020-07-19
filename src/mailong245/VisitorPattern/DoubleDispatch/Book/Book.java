package mailong245.VisitorPattern.DoubleDispatch.Book;

import mailong245.VisitorPattern.DoubleDispatch.Visitor.Visitor;

public interface Book {
    void accept(Visitor v);
}

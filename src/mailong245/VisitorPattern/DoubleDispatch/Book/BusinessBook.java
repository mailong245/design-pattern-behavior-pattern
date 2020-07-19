package mailong245.VisitorPattern.DoubleDispatch.Book;

import mailong245.VisitorPattern.DoubleDispatch.Visitor.Visitor;

public class BusinessBook implements Book {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of business book";
    }
}
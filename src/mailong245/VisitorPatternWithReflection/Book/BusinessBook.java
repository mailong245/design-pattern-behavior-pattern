package mailong245.VisitorPatternWithReflection.Book;

import mailong245.VisitorPatternWithReflection.Visitor.Visitor;

public class BusinessBook implements Book {
    public void accept(Visitor v) {
        v.visita(this);
    }

    public String getPublisher() {
        return "The publisher of business book";
    }
}
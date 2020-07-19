package mailong245.VisitorPatternWithReflection.Book;

import mailong245.VisitorPatternWithReflection.Visitor.Visitor;

public interface Book {
    void accept(Visitor v);
}

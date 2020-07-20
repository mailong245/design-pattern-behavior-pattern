package mailong245.VisitorPatternWithReflection;

import mailong245.VisitorPatternWithReflection.Book.*;
import mailong245.VisitorPatternWithReflection.Visitor.Visitor;
import mailong245.VisitorPatternWithReflection.Visitor.VisitorImpl;

public class DoubleDispatchApplication {

    public static void main(String[] args) {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();
        Book book4 = new OtherBook();

        Visitor v = new VisitorImpl();
        book1.accept(v);
        book2.accept(v);
        book3.accept(v);
        book4.accept(v);

    }
}
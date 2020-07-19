package mailong245.VisitorPattern.DoubleDispatch.Visitor;

import mailong245.VisitorPattern.DoubleDispatch.Book.BusinessBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.DesignPatternBook;
import mailong245.VisitorPattern.DoubleDispatch.Book.JavaCoreBook;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(BusinessBook a) {
        System.out.println(a.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook g) {
        System.out.println(g.getFavouriteBook());
    }
}
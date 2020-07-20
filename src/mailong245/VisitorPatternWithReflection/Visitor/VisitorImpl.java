package mailong245.VisitorPatternWithReflection.Visitor;

import mailong245.VisitorPatternWithReflection.Book.Book;
import mailong245.VisitorPatternWithReflection.Book.BusinessBook;
import mailong245.VisitorPatternWithReflection.Book.DesignPatternBook;
import mailong245.VisitorPatternWithReflection.Book.JavaCoreBook;
import mailong245.VisitorPatternWithReflection.Temp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VisitorImpl extends Visitor {
    @Override
    public void visit(Book book) {
        Method downPolymorphic = getMethod(book.getClass());
        if (downPolymorphic == null) {
            defaultVisit(book);
        } else {
            try {
//                downPolymorphic.invoke(Temp.class.newInstance(), book);
                downPolymorphic.invoke(this, book);
//            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void visit(BusinessBook a) {
        System.out.println(a.getPublisher());
    }

    public void visit(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }

    public void visit(JavaCoreBook g) {
        System.out.println(g.getFavouriteBook());
    }

}
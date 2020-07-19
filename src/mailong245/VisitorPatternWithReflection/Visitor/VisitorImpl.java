package mailong245.VisitorPatternWithReflection.Visitor;

import mailong245.VisitorPatternWithReflection.Book.Book;
import mailong245.VisitorPatternWithReflection.Book.BusinessBook;
import mailong245.VisitorPatternWithReflection.Book.DesignPatternBook;
import mailong245.VisitorPatternWithReflection.Book.JavaCoreBook;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VisitorImpl extends Visitor {
    @Override
    public void visita(Book book) {
        Method downPolymorphic = getMethod(book.getClass());
        if (downPolymorphic == null) {
            defaultVisit(book);
        } else {
            try {
                downPolymorphic.invoke("visita", book);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void visita(BusinessBook a) {
        System.out.println(a.getPublisher());
    }

    public void visita(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }

    public void visita(JavaCoreBook g) {
        System.out.println(g.getFavouriteBook());
    }

}
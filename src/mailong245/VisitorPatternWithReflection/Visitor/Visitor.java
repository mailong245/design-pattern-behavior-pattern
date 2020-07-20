package mailong245.VisitorPatternWithReflection.Visitor;

import mailong245.VisitorPatternWithReflection.Book.Book;
import mailong245.VisitorPatternWithReflection.Book.BusinessBook;
import mailong245.VisitorPatternWithReflection.Book.DesignPatternBook;
import mailong245.VisitorPatternWithReflection.Book.JavaCoreBook;
import mailong245.VisitorPatternWithReflection.Temp;

import java.lang.reflect.Method;

public abstract class Visitor {
    public abstract void visit(Book book);

    protected Method getMethod(Class<?> clazz) {
        while (!clazz.equals(Object.class)) { // Check superclasses
            try {
                //Tìm method visit có param là kiểu dữ liệu của clazz
//                return Temp.class.getDeclaredMethod("tempMethod", clazz);
                return this.getClass().getDeclaredMethod("visit", clazz);
            } catch (NoSuchMethodException ex) {
                clazz = clazz.getSuperclass();
            }
        }
        Class<?>[] interfaces = clazz.getInterfaces(); // Check interfaces
        for (Class<?> anInterface : interfaces) {
            try {
                return this.getClass().getDeclaredMethod("visit", anInterface);
            } catch (NoSuchMethodException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    protected void defaultVisit(Book book) {
        System.out.println("A book");
    }

}

package mailong245.VisitorPatternWithReflection;

import mailong245.VisitorPatternWithReflection.Book.BusinessBook;

public class Temp {

    public void tempMethod(BusinessBook book) {

        System.out.println("temp: " + book.getPublisher());

    }

}

package mailong245.VisitorPatternWithReflection.Book;

import mailong245.VisitorPatternWithReflection.Visitor.Visitor;

public class OtherBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visita(this);
    }

    @Override
    public String getResource() {
        return "Undefined";
    }
}

package Visitor;

/**
 * Created by Justice on 2/29/2016.
 */
public class Monitor implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
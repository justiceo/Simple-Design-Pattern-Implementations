package Visitor;

/**
 * Created by Justice on 2/29/2016.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

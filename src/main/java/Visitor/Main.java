package Visitor;

/**
 * Created by Justice on 2/29/2016.
 */
public class Main {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

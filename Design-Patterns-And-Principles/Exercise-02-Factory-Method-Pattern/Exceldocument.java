package designpatternsandprinciple.exercise2;

public class Exceldocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
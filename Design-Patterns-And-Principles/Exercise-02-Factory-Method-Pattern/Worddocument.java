package designpatternsandprinciple.exercise2;


public class Worddocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}
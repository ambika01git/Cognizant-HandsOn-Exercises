package designpatternsandprinciple.exercise2;

public class Excelfactory extends Documentfactory {

    @Override
    public Document createDocument() {
        return new Exceldocument();
    }
}
package designpatternsandprinciple.exercise2;

public class Pdffactory extends Documentfactory {

    @Override
    public Document createDocument() {
        return new Pdfdocument();
    }
}
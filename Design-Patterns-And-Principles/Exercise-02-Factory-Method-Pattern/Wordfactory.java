package designpatternsandprinciple.exercise2;


public class Wordfactory extends Documentfactory {

    @Override
    public Document createDocument() {
        return new Worddocument();
    }
}
package designpatternsandprinciple.exercise2;


public class Factorytest {

    public static void main(String[] args) {

        Documentfactory wordFactory = new Wordfactory();
        Document word = wordFactory.createDocument();
        word.open();

        Documentfactory pdfFactory = new Pdffactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        Documentfactory excelFactory = new Excelfactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
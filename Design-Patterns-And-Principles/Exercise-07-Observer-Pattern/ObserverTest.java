package designpatternsandprinciple.ques7;



public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Ambika");
        Observer webUser = new WebApp("User1");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockData("TCS", 4200);

        stockMarket.setStockData("Infosys", 1800);
    }
}
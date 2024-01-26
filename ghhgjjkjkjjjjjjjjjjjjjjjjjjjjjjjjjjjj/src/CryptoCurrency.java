public class CryptoCurrency{

    private String name;
    private double price;
    private static long circulatingSupply;

    public CryptoCurrency(String name, double price, long circ) {
       this.name = name;
       this.price = price;
       circulatingSupply = circ;
    }

    public static double calculateTotalPrice(CryptoCurrency[] currencies) {
        double result = 0;
        for (CryptoCurrency currency : currencies) {
            result += currency.price = circulatingSupply;
        }
        return result;
    }

}
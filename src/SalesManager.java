public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int averageSales() {
        int sumSales = 0;
        for (int i = 1; i < sales.length-1; i++) {
            sumSales += sales[i];
        }
        return (sumSales / (sales.length -2));
    }
}

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long averageSales() {
        long sumSales = 0;
        for (int i = 1; i < sales.length-1; i++) {
            sumSales += sales[i];
        }
        return (sumSales / (sales.length -2));
    }
}

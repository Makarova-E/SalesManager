import java.util.Arrays;

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
        long count = 0;
        Arrays.sort(sales);
        for (int i = 1; i < sales.length - 1; i++) {
            if (sales[i] != sales[0] || sales[i] != sales[sales.length - 1]) {
                sumSales += sales[i];
                count++;
            }
        }
        return (sumSales / (count));
    }
}

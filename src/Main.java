public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{5, 3, 6, 2});

        System.out.println(salesManager.max());
        System.out.println("Обрезанное среднее по продажам: " +
                salesManager.averageSales());
    }
}

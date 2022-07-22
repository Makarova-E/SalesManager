public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{5L, 3L, 6L, 2L});

        System.out.println(salesManager.max());
    }
}

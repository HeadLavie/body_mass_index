public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate(1.6, 51.8);
        System.out.println("Индекс массы тела: " + index);
    }
}
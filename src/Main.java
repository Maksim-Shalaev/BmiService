public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m; // масса тела в кг
        double h; // рост тела в метрах
        double i = service.calculate(85, 1.70);
        int index = (int) i;
        System.out.println("Индекс массы тела составляет: " + index);
    }
}

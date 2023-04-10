public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massa; // масса тела в кг
        double high; // рост тела в метрах
        double ind = service.calculate(85, 1.70);
        int index = (int) ind;
        System.out.println("Индекс массы тела составляет: " + index);
    }
}

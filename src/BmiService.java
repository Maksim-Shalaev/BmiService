public class BmiService {

    public double calculate(double massa, double high) {
        double ind = massa / (high * high);
        return ind;
    }
}

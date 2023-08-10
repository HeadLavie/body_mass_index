public class BmiService {

    public double calculate(double hightMeter, double weightKilo) {
        double result;
        result = weightKilo / (hightMeter * hightMeter);

        return (int) result;
    }
}


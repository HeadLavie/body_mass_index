public class BmiService {

    public double calculate(double hight_meter, double weight_kilo) {
        double result;
        result = weight_kilo / (hight_meter * hight_meter);

        return(int)result;
    }
}


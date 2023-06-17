public class BmiService {
    public int calculate(double weight_kg, double height_mt) {
        double bmi = weight_kg / (height_mt * height_mt);
        return (int) bmi;
    }
}
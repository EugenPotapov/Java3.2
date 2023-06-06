public class BMIservice {
    public int calculate(int weight, float height) {
        int bmi1;
        bmi1 = (int)(weight / (height * height));
        return bmi1;
    }
}

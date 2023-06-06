public class Main {
    public static void main(String[] args) {
        int bmi;
        int weight;
        float height;
        weight = 98;
        height = 1.87F;

        BMIservice service = new BMIservice();
        bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}


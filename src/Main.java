public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.76;
        double weight = 70.00;
        double bodyMassIndex = service.calculate(height, weight);
        System.out.println(bodyMassIndex);
    }

}

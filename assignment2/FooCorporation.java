public class FooCorporation {
    public static void calSalary(double pay, int hour) {
        // Match teo errors
        if (pay < 8.0) {
            System.out.println("error");
        }
        double salary;
        if (hour > 60) {
            System.out.println("error");
        } else if (hour < 40) {
            salary = pay * (double)hour;
            System.out.println("Total pay: $" + salary);
        } else {
            salary = pay * 40.0;
            salary += pay * 1.5 * (hour - 40);
            System.out.println("Total pay: $" + salary);
        }
    }
    public static void main(String[] args) {
        calSalary(7.5, 35);
        calSalary(8.2, 47);
        calSalary(10, 73);
    }
}

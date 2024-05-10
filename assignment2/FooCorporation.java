public class FooCorporation {
    public static void calSalary(double pay, int hour) {
        // Match teo errors
        if (pay < 8.0 || hour > 60) {
            System.out.println("error");
        } else {
            double salary = 0.0;
            int overTime = 0;
            if (hour > 40) {
                overTime = hour - 40;
                hour = 40;
            }
            salary = pay * hour + 1.5 * pay * overTime;
            System.out.println("Pay this employee: $" + salary);
        }
    }
    public static void main(String[] args) {
        calSalary(7.5, 35);
        calSalary(8.2, 47);
        calSalary(10, 40);
        calSalary(12, 63);
    }
}

import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find average: \n");
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += sc.nextInt();

        }
        System.out.println(sum);
        System.out.println("Average of 3 nums is: " + (sum / 3) + " ");
    }
}
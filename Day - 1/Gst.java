import java.util.Scanner;

public class Gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter cost of 3 products");
        // float cost = 0.0f;

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Enter product cost " + i);
        // cost += sc.nextFloat();
        // }
        // System.out.println("Total bill with 18% GST is :" + (cost * (0.18) + cost));

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        int result = (int) ((f * b) + (i % c) - (d * s));
        System.out.println(result);
    }
}
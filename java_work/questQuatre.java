import java.util.Scanner;

class questQuatre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Only enter " + num.length + " numbers.");

        for (int e = 0; e < num.length; e++) {
            System.out.print("Enter a value for index " + e + ": ");
            num[e] = input.nextInt();
        }

        System.out.println("The elements you entered are:");
        for (int value : num) {
            System.out.print(value + " ");
        }
    }
}

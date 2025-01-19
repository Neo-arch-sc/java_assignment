import java.util.Scanner;

class questCinq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("Input value for row " + (j + 1) + " col " + (k + 1) + ": ");
                arr[j][k] = input.nextInt();
            }
        }

        System.out.println("The elements you entered are:");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

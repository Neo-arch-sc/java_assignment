import java.util.Scanner;

class questTrois {
    public static void main(String[] args) {
        double[] array = {2.0, 5.0, 5.0, 9.0, 4.0, 7.0, 0.0, 9.0, 6.0, 11.0, 12.0};

        double mean = Calmean(array);
        System.out.println("Mean: " + mean);

        double median = Calmedian(array);
        System.out.println("Median: " + median);

        double standardDeviation = CalstandardDev(array, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    public static double Calmean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double Calmedian(double[] array) {
        selectSort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }

    public static double CalstandardDev(double[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (double num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }

    public static void selectSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей" + "\n");

        //task 2
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей, максимальная сумма затрат за день составила " + max + " рублей" + "\n");

        //task 3
        int sumArray = 0;
        double averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArray += arr[i];
        }
        averageSum = sumArray / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей" + "\n");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //task 5
        int[] row = new int[3];
        int[] column = new int[3];
        for (int i = 0; i < row.length; i++) {
            for (int i1 = 0; i1 < column.length; i1++) {
                if ((i == 0 || i == row.length - 1) && (i1 == 0 || i1 == column.length - 1)) System.out.print(1);
                else if (i == 1 && i1 == 1) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
        System.out.println();

        //task 6
        int[] massiv = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(massiv));
        int[] mas = Arrays.stream(massiv).sorted().toArray();
        System.out.println(Arrays.toString(mas));
        System.out.println();

        //task 7
        int[] arr1 = {5, 8, 2, 3, 9};
        for (int i = 0; i < arr1.length / 2; i++){
            int tmp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        //task 8
        int[] mas1 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < mas1.length - 1; i++){
            for (int j = 1; j < mas1.length; j++){
                if (mas1[i] + mas1[j] == -2) System.out.println(mas1[i] + " + " + mas1[j] + " = -2");
            }
        }
        System.out.println();
     }

    public static int[] generateRandomArray() {   //генерация массива случайных чисел
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
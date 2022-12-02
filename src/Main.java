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

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i: arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        int iMin = 200_001;
        int iMax = 99_999;
        for (int i: arr) {
            if (i < iMin) {
                iMin = i;
            }
        }

        for (int i: arr) {
            if (i > iMax) {
                iMax = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + iMin + " рублей. Максимальная сумма трат за день составила " + iMax + " рублей.");


        double averageValue = (double) sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }

    }
}
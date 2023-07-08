public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.4, -2.8, -4.6, 6.8, 8.2, 2.6, 4.8, 8.6, 1.6, 8.2, 4.8, 8.2, 4.1, 6.4, 2.1};
        boolean negativeFound = false;
        double sum = 0;
        int count = 0;
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }
        double average = sum / count;
        System.out.println("Средне арифметической положителних чисел первого отрицателного; " + average);

    }
}
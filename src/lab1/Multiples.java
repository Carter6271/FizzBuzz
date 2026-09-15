package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    static int multiples(int n, int a, int b) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            boolean multipleOfThree = i % a == 0;
            boolean multipleOfFive = i % b == 0;

            if (multipleOfFive || multipleOfThree) {
                total++;
            }
        }
        return total;
    }
}

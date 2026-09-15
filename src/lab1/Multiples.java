package lab1;

public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multipleOfThree = i % 3 == 0;
            boolean multipleOfFive = i % 5 == 0;

            if (multipleOfFive || multipleOfThree) {
                total++;
            }
        }
        System.out.println(total);
    }
}

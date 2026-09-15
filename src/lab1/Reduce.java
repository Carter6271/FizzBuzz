package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(200);
        System.out.println(count);
    }

    static int reduce(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
        count++;
        }
        return count;
    }
}

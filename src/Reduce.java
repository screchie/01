public class Reduce {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                System.out.print(n+" (even, divide by 2) --> ");
                n /= 2;
            } else {
                System.out.print(n+" (odd, subtract 1) --> ");
                n -= 1;
            }
            count++;

        }
        System.out.print(n);
        System.out.println("\nAmount of steps = "+count);
    }
}
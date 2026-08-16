import java.util.*;

public class main {
    public static void solution(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to input: ");
        int n = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }

        solution(al);

        System.out.println("Modified list (without primes): " + al);
    }
}

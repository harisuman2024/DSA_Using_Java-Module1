// ✅ Lab13: Big-O Notation (Upper Bound Function)

public class Lab13 {
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) { // Runs n times
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}

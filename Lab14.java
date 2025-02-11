// ✅ Lab14: Omega Notation (Lower Bound Function)
public class Lab14 {
    public static int sum(int n) {
        System.out.println("Begin");
        int sum = 0;

        for (int i = 1; i <= n; i++) { 
            sum = sum + i;
        }

        System.out.println("End");
        return sum;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum: " + result);
    }
}

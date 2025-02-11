// ✅ Lab4: Finding Time Complexity (O(n))

public class Lab4 {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum); // O(n) - Linear time
    }
}
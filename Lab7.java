// ✅ Lab7: Finding Time Complexity (O(m + n))

public class Lab7 {
    public static void process(int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        process(5, 10);
    }
}

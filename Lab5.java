// ✅ Lab5: Finding Time Complexity (O(n²))

public class Lab5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
    }
}

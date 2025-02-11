// ✅ Lab9: Understanding Space Complexity (O(n))
public class Lab9 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n]; // O(n) - Linear space
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }
}
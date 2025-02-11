// ✅ Lab11: Best Case, Worst Case & Average Case Analysis

public class Lab11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]); // Best Case O(1)
        for (int num : arr) { // Average Case O(n)
            System.out.println(num);
        }
        for (int i = 0; i < arr.length; i++) { // Worst Case O(n)
            System.out.println(arr[i]);
        }
    }
}

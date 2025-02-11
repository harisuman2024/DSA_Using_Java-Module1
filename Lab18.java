// ✅ Lab18: Algorithm for Swapping Two Numbers

public class Lab18 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: " + a + ", " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: " + a + ", " + b);
    }
}
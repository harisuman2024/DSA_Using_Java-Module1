// ✅ Lab15: Theta Notation (Tight Bound Function)

public class Lab15 {
    public static void show(int n) {
        System.out.println("Begin");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("OK");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("End");
    }

    public static void main(String[] args) {
        show(5);
    }
}

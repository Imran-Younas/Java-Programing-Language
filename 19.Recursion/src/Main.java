public class Main {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        } else {
            return 0;
        }
    }
}

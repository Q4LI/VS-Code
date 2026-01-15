public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (mid <= x / mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Sqrt sqrtCalculator = new Sqrt();
        int x = 8; // Example input
        int result = sqrtCalculator.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}

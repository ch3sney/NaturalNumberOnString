/**
 * Simple HelloWorld program (clear of Checkstyle and FindBugs warnings).
 *
 * @author P. Bucci
 */
public final class AverageInt {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private AverageInt() {
        // no code needed here
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        int i = -3;
        System.out.println("i = " + i);
        int j = -5;
        System.out.println("j = " + j);
        System.out.println(average(i, j));
    }

    /**
     * Returns the integer average of two given {@code int}s.
     *
     * @param j
     *            the first of two integers to average
     * @param k
     *            the second of two integers to average
     * @return the integer average of j and k
     * @ensures average = (j+k)/2
     */
    public static int average(int j, int k) {
        int avg;
        if (oppSign(j, k)) {
            // If opposite signs, use original formula
            avg = (j + k) / 2;
            System.out.println("Opposite signs");
        } else {
            avg = (j / 2) + (k / 2);
            if (j > 0 && j % 2 != 0 && k % 2 != 0) {
                // If both positve and both odd, add 1
                avg += 1;
            } else if (j < 0 && (j % 2 != 0) && (k % 2 != 0)) {
                // If both negative and both odd, subtract 1
                avg -= 1;
            }
        }
        return avg;
    }

    /**
     * Returns whether two ints have opposite signs. According to equation given
     * by GeeksforGeeks.org.
     *
     * @param x
     *            the first of two integers to test
     * @param y
     *            the second of two integers to test
     * @return ints have opposite signs
     * @ensures oppSign = (x ^ y) < 0
     */
    public static boolean oppSign(int x, int y) {
        return ((x ^ y) < 0);
    }

}

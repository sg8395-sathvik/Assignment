/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() instead of
 * the + operator for string concatenation.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp1 {

    public static void main(String[] args) {

        System.out.println(String.join(" ", "  *  ", " ** ", " ** ", " *** "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *   * ", " *     "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *   * ", " *     "));
        System.out.println(String.join(" ", " *   * ", " ** ", " ** ", " *** "));
        System.out.println(String.join(" ", " *   * ", " *     ", "     * ", "     * "));
        System.out.println(String.join(" ", " *   * ", " *     ", "     * ", "     * "));
        System.out.println(String.join(" ", "  *  ", " *     ", " ** ", " ** "));
    }
}
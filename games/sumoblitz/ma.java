/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static String logInText;
    static String namesCannotContainConsecutiveText;
    static ta field_b;
    private static String field_z;

    public static void a(int param0) {
        if (param0 == 20283) {
          namesCannotContainConsecutiveText = null;
          logInText = null;
          field_b = null;
          return;
        }
        field_b = (ta) null;
        namesCannotContainConsecutiveText = null;
        logInText = null;
        field_b = null;
    }

    static {
        field_z = "ma.A(";
        logInText = "Log in";
        namesCannotContainConsecutiveText = "Names cannot contain consecutive spaces";
    }
}

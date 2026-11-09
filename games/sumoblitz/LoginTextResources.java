/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginTextResources {
    static String logInText;
    static String namesCannotContainConsecutiveText;
    static FontMetrics field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 == 20283) {
          namesCannotContainConsecutiveText = null;
          logInText = null;
          field_b = null;
          return;
        }
        field_b = (FontMetrics) null;
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

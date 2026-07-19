/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String[] field_b;
    static String field_a;
    private static String field_z;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            s.a(false);
        }
    }

    static {
        field_z = "s.A(";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_a = "Fullscreen";
    }
}

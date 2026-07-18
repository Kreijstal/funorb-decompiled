/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_b;
    static java.awt.Font field_a;

    final static java.applet.Applet b(int param0) {
        if (null != i.field_f) {
            return i.field_f;
        }
        if (param0 <= 63) {
            return null;
        }
        return (java.applet.Applet) (Object) wi.field_f;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unpacking graphics";
    }
}

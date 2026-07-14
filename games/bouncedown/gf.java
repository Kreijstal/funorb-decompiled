/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ai {
    static String field_h;
    static jf field_g;
    int field_i;

    final static int a(int param0, CharSequence param1) {
        if (param0 != 10) {
            return 107;
        }
        return kf.a(10, param1, true, 48);
    }

    public static void a(boolean param0) {
        field_g = null;
        field_h = null;
        if (param0) {
            field_h = null;
        }
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Please wait...";
    }
}

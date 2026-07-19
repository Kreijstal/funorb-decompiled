/*
 * Decompiled by CFR-JS 0.4.0.
 */
class of extends uh {
    static he field_x;
    static int[] field_w;
    static int field_v;
    static String field_u;

    final static long a(byte param0) {
        int var1 = -95 / ((param0 - 75) / 32);
        return -el.field_rb + la.a(false);
    }

    of() {
    }

    public static void g(int param0) {
        field_w = null;
        field_x = null;
        field_u = null;
        if (param0 != 1024) {
            of.g(47);
        }
    }

    static {
        field_w = new int[1024];
        field_u = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}

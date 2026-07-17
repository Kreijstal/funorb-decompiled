/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends java.awt.Canvas {
    static int field_b;
    static volatile int field_a;
    static int field_d;
    static boolean field_f;
    static hj[] field_c;
    static String field_h;
    private java.awt.Component field_e;
    static String field_g;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((mi) this).field_e.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mi.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(String param0, byte param1, String param2) {
        try {
            dj.a(false, param0, -106, param2);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mi.B(" + (param0 != null ? "{...}" : "null") + 44 + -60 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        if (param0 >= -56) {
            return;
        }
        field_h = null;
        field_g = null;
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((mi) this).field_e.update(param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mi.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    mi(java.awt.Component param0) {
        try {
            ((mi) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_g = "Please try again in a few minutes.";
        field_h = "Formula 1";
    }
}

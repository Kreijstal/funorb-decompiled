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
        ((mi) this).field_e.paint(param0);
    }

    final static void a(String param0, byte param1, String param2) {
        if (param1 > -19) {
            field_d = 24;
            dj.a(false, param0, -106, param2);
            return;
        }
        dj.a(false, param0, -106, param2);
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
        ((mi) this).field_e.update(param0);
    }

    mi(java.awt.Component param0) {
        ((mi) this).field_e = param0;
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

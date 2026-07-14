/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends java.awt.Canvas {
    private java.awt.Component field_d;
    static String field_c;
    static sh field_b;
    static boolean field_a;

    ie(java.awt.Component param0) {
        ((ie) this).field_d = param0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -56) {
            field_c = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((ie) this).field_d.update(param0);
    }

    public final void paint(java.awt.Graphics param0) {
        ((ie) this).field_d.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "EXT";
        field_a = false;
    }
}

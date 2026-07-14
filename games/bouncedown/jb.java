/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_f;
    static gk field_a;
    static String field_b;
    java.awt.Frame field_e;
    static lg field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((jb) this).field_f = true;
    }

    public final void update(java.awt.Graphics param0) {
    }

    final void a(byte param0, si param1) {
        ib.a(param1, ((jb) this).field_e, (byte) 110);
        if (param0 >= -106) {
            jb.a(true);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    jb() {
    }

    final static int a(int param0) {
        if (param0 != 31083) {
            field_c = null;
            return ak.field_y;
        }
        return ak.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your age in years";
        field_c = new lg();
        field_d = false;
    }
}

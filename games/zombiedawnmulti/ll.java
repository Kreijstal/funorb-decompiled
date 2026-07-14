/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_i;
    volatile boolean field_e;
    static lf field_j;
    static rp field_k;
    static mf field_a;
    static java.awt.Frame field_g;
    static int field_b;
    static String field_d;
    static boolean[] field_h;
    static int[] field_f;
    static boolean[] field_c;

    final void a(int param0, go param1) {
        sp.a(param1, param0 ^ 8193, ((ll) this).field_i);
        if (param0 != 8192) {
            Object var4 = null;
            ((ll) this).focusGained((java.awt.event.FocusEvent) null);
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_k = null;
        field_h = null;
        int var1 = 69 % ((45 - param0) / 62);
        field_c = null;
        field_a = null;
        field_g = null;
        field_j = null;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ll) this).field_e = true;
    }

    ll() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new lf();
        field_d = "Show chat";
        field_f = new int[8192];
    }
}

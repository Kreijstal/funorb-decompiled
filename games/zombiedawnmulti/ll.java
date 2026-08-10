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
        try {
            sp.a(param1, param0 ^ 8193, this.field_i);
            if (param0 != 8192) {
                java.awt.event.FocusEvent var4 = (java.awt.event.FocusEvent) null;
                this.focusGained((java.awt.event.FocusEvent) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ll.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        try {
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ll.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ll() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_j = new lf();
        field_d = "Show chat";
        field_f = new int[8192];
    }
}

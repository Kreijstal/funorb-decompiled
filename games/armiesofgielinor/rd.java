/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_a;
    volatile boolean field_k;
    static int field_d;
    static int field_b;
    static String field_g;
    static String field_h;
    static String field_f;
    static je field_e;
    java.awt.Frame field_c;
    static ic field_j;
    static long field_i;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_j = null;
        field_h = null;
        field_e = null;
        if (param0 != 20000000) {
            field_e = null;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((rd) this).field_k = true;
    }

    final static void b(int param0) {
        if (param0 != 8445) {
            rd.b(33);
            qj.field_C.setLength(0);
            rs.field_t = 0;
            return;
        }
        qj.field_C.setLength(0);
        rs.field_t = 0;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(int param0, hd param1) {
        fj.a(((rd) this).field_c, param1, param0 ^ 30916);
        if (param0 != -30918) {
            field_f = null;
        }
    }

    rd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Orb points: ";
        field_d = 0;
        field_f = "The game options are not all set.";
        field_a = "Spells to impose your will upon the world.";
        field_i = 20000000L;
        field_g = "Updates will sent to the email address you've given";
    }
}

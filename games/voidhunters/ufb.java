/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ufb extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_a;
    java.awt.Frame field_b;
    static String[] field_d;
    static String field_c;

    public final void update(java.awt.Graphics param0) {
    }

    final void a(eab param0, int param1) {
        if (param1 != -32335) {
            ufb.a(false);
            db.a(((ufb) this).field_b, param0, (byte) 126);
            return;
        }
        db.a(((ufb) this).field_b, param0, (byte) 126);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ufb) this).field_a = true;
    }

    ufb() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = "Wasp chassis";
    }
}

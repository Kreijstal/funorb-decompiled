/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends java.awt.Canvas {
    static int field_c;
    static ge field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        ((jc) this).field_a.paint(param0);
    }

    final static void a(byte param0) {
        uf.a(Lexicominos.field_H, 113, wa.field_k, true);
        lh.field_w = true;
        int var1 = -24 / ((param0 - 43) / 46);
    }

    public static void a(int param0) {
        if (param0 >= -14) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((jc) this).field_a.update(param0);
    }

    jc(java.awt.Component param0) {
        ((jc) this).field_a = param0;
    }

    static {
    }
}

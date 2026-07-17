/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends java.awt.Canvas {
    static int field_c;
    static ge field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((jc) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "jc.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        uf.a(Lexicominos.field_H, 113, wa.field_k, true);
        lh.field_w = true;
        int var1 = -24 / ((param0 - 43) / 46);
    }

    public static void a(int param0) {
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((jc) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "jc.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    jc(java.awt.Component param0) {
        try {
            ((jc) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "jc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}

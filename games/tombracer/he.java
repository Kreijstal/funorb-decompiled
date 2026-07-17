/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static ha field_c;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((he) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "he.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((he) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "he.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -24962) {
            he.a(-65);
            field_c = null;
            return;
        }
        field_c = null;
    }

    he(java.awt.Component param0) {
        try {
            ((he) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "he.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Game options changed (<%0>)";
        field_c = null;
    }
}

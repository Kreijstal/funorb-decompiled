/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends java.awt.Canvas {
    private java.awt.Component field_d;
    static String field_c;
    static sh field_b;
    static boolean field_a;

    ie(java.awt.Component param0) {
        try {
            ((ie) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((ie) this).field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ie.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((ie) this).field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ie.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "EXT";
        field_a = false;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends java.awt.Canvas {
    static String field_c;
    static String field_a;
    private java.awt.Component field_b;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((dc) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "dc.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((dc) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "dc.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
    }

    dc(java.awt.Component param0) {
        try {
            ((dc) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "dc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
        field_c = "Loading Volcano...";
    }
}

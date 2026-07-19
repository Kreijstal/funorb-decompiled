/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends java.awt.Canvas {
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pc.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    pc(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pc.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

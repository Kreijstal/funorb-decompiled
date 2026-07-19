/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends java.awt.Canvas {
    private java.awt.Component field_a;
    static le[] field_b;

    public static void a(int param0) {
        if (param0 >= -24) {
            ji.a(-117);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ji.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ji.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ji(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

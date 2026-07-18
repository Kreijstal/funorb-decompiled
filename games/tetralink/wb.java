/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends java.awt.Canvas {
    static hl field_a;
    static kd field_f;
    private java.awt.Component field_d;
    static String field_b;
    static int field_c;
    static hl field_e;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((wb) this).field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "wb.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((wb) this).field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "wb.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    wb(java.awt.Component param0) {
        try {
            ((wb) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "wb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        cd.field_d = new c(qe.field_g);
        cd.field_d.field_n = cd.field_d.field_n | param0;
        if (param1 != -7869) {
            return;
        }
        va.field_p = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Your rating is <%0>";
        field_c = 256;
    }
}

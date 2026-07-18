/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_a;
    static String field_b;
    static String field_f;
    java.awt.Frame field_c;
    volatile boolean field_e;
    static bl field_d;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        qe.field_W.c(-qe.field_W.field_x + param1, param3, 64);
        bi.g(param1, 0, param2 + param1, 480);
        if (param0) {
            return;
        }
        try {
            var4_int = param1;
            while (var4_int < param1 - -param2) {
                qp.field_h.c(var4_int, param3, 64);
                var4_int = var4_int + qp.field_h.field_x;
            }
            bi.a();
            ln.field_f.c(param2 + param1, param3, 64);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qi.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((qi) this).field_e = true;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qi.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    qi() {
    }

    final void a(jj param0, int param1) {
        if (param1 != 30210) {
            return;
        }
        try {
            br.a(((qi) this).field_c, param0, 8);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Music: ";
    }
}

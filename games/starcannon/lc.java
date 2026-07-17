/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends qj {
    static int field_gb;
    static String field_hb;
    static String field_fb;
    static String field_ib;

    final void c(int param0, uj param1) {
        try {
            super.c(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lc.GA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    lc(tc param0, uj param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(int param0) {
        field_fb = null;
        field_ib = null;
        field_hb = null;
    }

    final static void a(boolean param0, ue param1) {
        hl var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0) {
                field_ib = null;
            }
            var2 = new hl(param1.a("final_frame.jpg", (byte) -76, ""), (java.awt.Component) (Object) kj.field_E);
            var3 = var2.field_u;
            var4 = var2.field_v;
            wj.b(true);
            m.field_a = new hl(var3, var4 * 3 / 4);
            m.field_a.e();
            var2.d(0, 0);
            ai.field_g = new hl(var3, -m.field_a.field_v + var4);
            ai.field_g.e();
            var2.d(0, -m.field_a.field_v);
            ai.field_g.field_y = m.field_a.field_v;
            wf.a(-61);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lc.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_ib = "Waiting for sound effects";
    }
}

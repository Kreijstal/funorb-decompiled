/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class df {
    static String field_b;
    static na field_a;

    abstract qg a(byte param0);

    abstract void a(int param0, qc param1);

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) pg.field_c);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pg.field_c);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) pg.field_c);
            s.field_I = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "df.F(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ob b(byte param0) {
        if (param0 <= 11) {
            ob discarded$0 = df.b((byte) 74);
            return uf.field_e;
        }
        return uf.field_e;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "End Game";
    }
}

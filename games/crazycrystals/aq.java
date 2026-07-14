/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends wc {
    static boolean field_r;
    static volatile int field_s;
    static ko field_t;

    private aq(vc param0, int param1) {
        super(param0, param1);
    }

    aq(int param0) {
        this(ai.field_h, param0);
    }

    public static void b(int param0) {
        field_t = null;
        if (param0 >= -23) {
            aq.b(51);
        }
    }

    final String d(qm param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        return r.a(true, '*', param0.field_o.length());
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) tm.field_b);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tm.field_b);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) tm.field_b);
        if (param0 < 36) {
            Object var3 = null;
            aq.a((byte) -118, (java.awt.Component) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = false;
        field_s = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int field_b;
    static vg field_a;

    final static void a(java.awt.Component param0, boolean param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) tf.field_n);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) tf.field_n);
        if (param1) {
            return;
        }
        jd.field_J = -1;
    }

    final static qe a(int param0, String param1, int param2) {
        hf var3 = new hf();
        ((qe) (Object) var3).field_d = param0;
        ((qe) (Object) var3).field_c = param1;
        if (param2 != -1) {
            return null;
        }
        return (qe) (Object) var3;
    }

    final static void a(ib param0, int param1, java.awt.Component param2) {
        vl.field_d = new tf();
        vl.field_d.field_q.d(128, -13549, 9);
        vl.field_d.field_q.a(mk.field_e, false);
        vl.field_d.field_C.d(128, -13549, 9);
        vl.field_d.field_C.a(mk.field_e, false);
        int var3 = -54 % ((param1 - 11) / 55);
        wc.a((byte) -111, param0, param2, 22050, 1102, true, 22050, vl.field_d);
        ll.a(-114, 160);
        pc.field_h = 256;
        Object var4 = null;
        sa.a((ee) null, -15676);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -29) {
            lh.a((byte) 28);
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends q {
    int field_j;
    int field_s;
    int field_o;
    int field_m;
    static k field_r;
    static up field_q;
    static int field_p;
    int field_n;
    int field_k;
    static String[] field_l;

    public static void a(byte param0) {
        field_l = null;
        field_r = null;
        if (param0 < 79) {
            return;
        }
        field_q = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(ef.field_b);
            param1.removeMouseMotionListener(ef.field_b);
            param1.removeFocusListener(ef.field_b);
            rn.field_f = 0;
            if (param0 > -53) {
                field_r = (k) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "qk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, t[] param2, byte param3) {
        try {
            p.field_x = new fn(param2);
            if (param3 != -4) {
                field_l = (String[]) null;
            }
            dn.field_h = param0;
            wp.field_y = param1;
            w.c((byte) 109);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "qk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    qk(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_k = param0;
        this.field_j = param5;
        this.field_n = param2;
        this.field_s = param4;
        this.field_o = param1;
        this.field_m = param3;
    }

    static {
        field_p = 100;
        field_r = new k(11, 0, 1, 2);
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}

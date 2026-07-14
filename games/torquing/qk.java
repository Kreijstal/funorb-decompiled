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
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) ef.field_b);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ef.field_b);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ef.field_b);
        rn.field_f = 0;
        if (param0 > -53) {
            field_r = null;
        }
    }

    final static void a(int param0, int param1, t[] param2, byte param3) {
        p.field_x = new fn(param2);
        if (param3 != -4) {
          field_l = null;
          dn.field_h = param0;
          wp.field_y = param1;
          w.c((byte) 109);
          return;
        } else {
          dn.field_h = param0;
          wp.field_y = param1;
          w.c((byte) 109);
          return;
        }
    }

    qk(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((qk) this).field_k = param0;
        ((qk) this).field_j = param5;
        ((qk) this).field_n = param2;
        ((qk) this).field_s = param4;
        ((qk) this).field_o = param1;
        ((qk) this).field_m = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 100;
        field_r = new k(11, 0, 1, 2);
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}

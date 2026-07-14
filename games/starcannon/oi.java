/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends rf {
    int field_k;
    int field_g;
    static String field_n;
    static volatile int field_f;
    int field_m;
    static String field_i;
    int field_l;
    int field_h;
    static String field_j;
    oi field_o;

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2 = 0;
        if (11 == bl.field_a) {
          ab.g((byte) -114);
          var2 = -70 / ((-59 - param1) / 54);
          w.a(o.field_b, (byte) 86, kb.field_a, nb.field_a);
          dd.a(param0, 0, 0, -23466);
          return;
        } else {
          var2 = -70 / ((-59 - param1) / 54);
          w.a(o.field_b, (byte) 86, kb.field_a, nb.field_a);
          dd.a(param0, 0, 0, -23466);
          return;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        Object var3 = null;
        param0.addMouseListener((java.awt.event.MouseListener) (Object) rc.field_d);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) rc.field_d);
        if (param1 != 0) {
          var3 = null;
          oi.a((java.awt.Component) null, -115);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) rc.field_d);
          return;
        } else {
          param0.addFocusListener((java.awt.event.FocusListener) (Object) rc.field_d);
          return;
        }
    }

    oi(int param0, int param1, int param2, int param3, int param4) {
        ((oi) this).field_k = param3;
        ((oi) this).field_g = param1;
        ((oi) this).field_l = param4;
        ((oi) this).field_h = param2;
        ((oi) this).field_m = param0;
    }

    public static void a(boolean param0) {
        field_i = null;
        field_n = null;
        field_j = null;
        if (param0) {
            Object var2 = null;
            oi.a((java.awt.Component) null, 26);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_n = "Log in / Create account";
        field_i = "BACK GUNS - Installs spread weapons onto the Nova Ray, covering its sides.";
        field_j = "Members";
    }
}

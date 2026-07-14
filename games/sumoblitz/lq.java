/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String field_a;
    static int field_d;
    static int field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        Object var3 = null;
        param1.setFocusTraversalKeysEnabled(false);
        if (param0 != 0) {
          var3 = null;
          lq.a(-23, (java.awt.Component) null);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) wd.field_e);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) wd.field_e);
          return;
        } else {
          param1.addKeyListener((java.awt.event.KeyListener) (Object) wd.field_e);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) wd.field_e);
          return;
        }
    }

    final static void a(ki param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        wb var6 = null;
        var6 = new wb(param0.a("", "final_frame.jpg", -1), (java.awt.Component) (Object) qn.field_f);
        var3 = var6.field_x;
        var4 = var6.field_u;
        kc.j(103);
        if (param1 >= -62) {
          var5 = null;
          String discarded$1 = lq.a(-58, (String) null, (String) null, (ki) null);
          kh.field_a = new wb(var3, var4 * 3 / 4);
          kh.field_a.d();
          var6.c(0, 0);
          mq.field_a = new wb(var3, var4 + -kh.field_a.field_u);
          mq.field_a.d();
          var6.c(0, -kh.field_a.field_u);
          mq.field_a.field_A = kh.field_a.field_u;
          su.a((byte) 71);
          return;
        } else {
          kh.field_a = new wb(var3, var4 * 3 / 4);
          kh.field_a.d();
          var6.c(0, 0);
          mq.field_a = new wb(var3, var4 + -kh.field_a.field_u);
          mq.field_a.d();
          var6.c(0, -kh.field_a.field_u);
          mq.field_a.field_A = kh.field_a.field_u;
          su.a((byte) 71);
          return;
        }
    }

    final static String a(int param0, String param1, String param2, ki param3) {
        if (param0 < 100) {
            return null;
        }
        if (!(param3.b((byte) 127))) {
            return param2;
        }
        return param1 + " - " + param3.a(0) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "To server list";
    }
}

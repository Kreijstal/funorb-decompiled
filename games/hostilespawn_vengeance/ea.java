/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    static String[] field_f;
    static int field_c;
    static String[] field_a;
    static float field_d;
    static bd field_e;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        me.a((java.awt.Component) (Object) param0, 118);
        dc.a((java.awt.Component) (Object) param0, (byte) 48);
        if (null == h.field_b) {
          if (param1 != 0) {
            var3 = null;
            ea.a((java.awt.Canvas) null, 44);
            return;
          } else {
            return;
          }
        } else {
          h.field_b.a((java.awt.Component) (Object) param0, (byte) 86);
          if (param1 == 0) {
            return;
          } else {
            var3 = null;
            ea.a((java.awt.Canvas) null, 44);
            return;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        Object var3 = null;
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) nj.field_c);
        if (param0 != 1) {
          var3 = null;
          ea.a(-106, (java.awt.Component) null);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_c);
          uc.field_b = -1;
          return;
        } else {
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_c);
          uc.field_b = -1;
          return;
        }
    }

    final static void a(jd param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        en var7 = null;
        en var8 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var7 = s.field_b;
        var8 = var7;
        var8.i(19319, param1);
        var8.field_i = var8.field_i + 1;
        var4 = var8.field_i;
        var8.d(103, 1);
        var8.a((byte) -121, param0.field_u);
        var8.a((byte) -126, param0.field_t);
        var8.a((byte) -127, param0.field_j);
        var8.b(param0.field_r, 25251);
        var8.b(param0.field_n, 25251);
        var8.b(param0.field_p, 25251);
        var8.b(param0.field_m, 25251);
        var8.d(119, param0.field_w.length);
        var5 = 0;
        L0: while (true) {
          if (param0.field_w.length <= var5) {
            int discarded$7 = var8.f(var4, 108);
            if (param2 <= 33) {
              field_e = null;
              var8.a(var8.field_i - var4, -19720);
              return;
            } else {
              var8.a(var8.field_i - var4, -19720);
              return;
            }
          } else {
            var7.b(param0.field_w[var5], 25251);
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Get to the lift before the charges detonate!";
        field_d = 0.0f;
    }
}

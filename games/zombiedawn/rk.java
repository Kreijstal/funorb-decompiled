/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;
    static rb field_b;

    final static void a(boolean param0, ll param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        Object var8 = null;
        L0: {
          vj.field_t[0] = p.field_b.nextInt();
          vj.field_t[1] = p.field_b.nextInt();
          vj.field_t[3] = (int)dh.field_b;
          dh.field_e.field_j = 0;
          if (param3 == -27886) {
            break L0;
          } else {
            var8 = null;
            rk.a((byte) 84, (java.awt.Component) null);
            break L0;
          }
        }
        L1: {
          vj.field_t[2] = (int)(dh.field_b >> -1264159776);
          dh.field_e.h(-115, vj.field_t[0]);
          dh.field_e.h(30, vj.field_t[1]);
          dh.field_e.h(85, vj.field_t[2]);
          dh.field_e.h(80, vj.field_t[3]);
          cc.a(dh.field_e, 10);
          dh.field_e.a(param4, (byte) 105);
          param1.a(false, dh.field_e);
          dp.field_e.field_j = 0;
          if (!param2) {
            dp.field_e.i(16, -122);
            break L1;
          } else {
            dp.field_e.i(18, 110);
            break L1;
          }
        }
        L2: {
          dp.field_e.field_j = dp.field_e.field_j + 2;
          var5 = dp.field_e.field_j;
          dp.field_e.h(-108, h.field_b);
          dp.field_e.a(lg.field_u, -80);
          var6 = 0;
          if (ih.field_S) {
            var6 = var6 | 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!ni.field_a) {
            break L3;
          } else {
            var6 = var6 | 4;
            break L3;
          }
        }
        L4: {
          if (!param0) {
            break L4;
          } else {
            var6 = var6 | 8;
            break L4;
          }
        }
        L5: {
          if (ia.field_b == null) {
            break L5;
          } else {
            var6 = var6 | 16;
            break L5;
          }
        }
        L6: {
          dp.field_e.i(var6, param3 + 27799);
          var7 = ff.a(hc.a(0), (byte) 42);
          if (var7 == null) {
            var7 = "";
            break L6;
          } else {
            break L6;
          }
        }
        dp.field_e.a(param3 ^ -27758, var7);
        if (ia.field_b == null) {
          ab.a(dh.field_e, pm.field_c, (byte) -105, (de) (Object) dp.field_e, pj.field_p);
          dp.field_e.g(57, -var5 + dp.field_e.field_j);
          vl.a((byte) -46, -1);
          return;
        } else {
          dp.field_e.a((byte) -88, ia.field_b);
          ab.a(dh.field_e, pm.field_c, (byte) -105, (de) (Object) dp.field_e, pj.field_p);
          dp.field_e.g(57, -var5 + dp.field_e.field_j);
          vl.a((byte) -46, -1);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16) {
            Object var2 = null;
            rk.a((byte) -88, (java.awt.Component) null);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        Object var3 = null;
        if (param0 >= -13) {
          var3 = null;
          rk.a((byte) -12, (java.awt.Component) null);
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) ea.field_c);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) ea.field_c);
          return;
        } else {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) ea.field_c);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) ea.field_c);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        var3 = 117 % ((param0 - -35) / 33);
        if (10 <= we.field_c) {
          if (hl.a((byte) 27)) {
            if (rk.field_e != 0) {
              wb.a(param1, 0);
              return;
            } else {
              dl.a(param2, true, false);
              ll.a(0, 0, param1, -115);
              return;
            }
          } else {
            fn.d();
            jf.a(256, 320, 240);
            ll.a(0, 0, param1, -96);
            return;
          }
        } else {
          L0: {
            var4 = 0;
            if (!ve.field_f) {
              break L0;
            } else {
              var4 = 1;
              ve.field_f = false;
              break L0;
            }
          }
          vg.a(ul.k(0), var4 != 0, ib.a((byte) 109), m.field_k, false);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 != 1) {
          return 36;
        } else {
          var3 = 0;
          L0: while (true) {
            if (param1 <= 0) {
              return var3;
            } else {
              var3 = var3 << -780195071 | 1 & param2;
              param2 = param2 >>> 1;
              param1--;
              continue L0;
            }
          }
        }
    }

    static {
    }
}

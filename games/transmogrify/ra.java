/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static int field_a;

    final static void a(fe param0, java.awt.Frame param1, int param2) {
        ib var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(param1, 100);
          L1: while (true) {
            if (var3.field_c != 0) {
              if (1 != var3.field_c) {
                pg.a(100L, -116);
                continue L0;
              } else {
                L2: {
                  param1.setVisible(false);
                  if (param2 == 100) {
                    break L2;
                  } else {
                    var5 = null;
                    ra.a((fe) null, (java.awt.Frame) null, 29);
                    break L2;
                  }
                }
                param1.dispose();
                return;
              }
            } else {
              pg.a(10L, param2 + -225);
              continue L1;
            }
          }
        }
    }

    final static String a(byte param0) {
        if (!lk.field_c) {
            if (da.field_y >= bk.field_d) {
                if (da.field_y < ek.field_g + bk.field_d) {
                    return tj.field_v;
                }
            }
        }
        if (param0 >= 26) {
            return null;
        }
        field_a = -66;
        return null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        ti var1 = new ti(540, 140);
        oj.a(var1, 256);
        ka.c();
        sb.c();
        si.field_l = 0;
        f.a((byte) 16);
        ti var2 = var1.a();
        for (var3 = 0; var3 < 15; var3++) {
            var2.d(-2, -2, 16777215);
            sb.a(4, 4, 0, 0, 540, 140);
        }
        ac.field_m.e();
        var1.d(param0, 0);
        fi.c(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}

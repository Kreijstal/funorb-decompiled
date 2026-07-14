/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static he[] field_a;
    static he[] field_b;
    static java.security.SecureRandom field_c;

    final static void a(java.applet.Applet param0, int param1, int param2, int param3, String[] param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 == 2) {
            break L0;
          } else {
            wb.a(123);
            break L0;
          }
        }
        L1: {
          dc.field_f = param0.getParameter("overxgames");
          if (null != dc.field_f) {
            break L1;
          } else {
            dc.field_f = "0";
            break L1;
          }
        }
        L2: {
          fl.field_d = param0.getParameter("overxachievements");
          if (null == fl.field_d) {
            fl.field_d = "0";
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            var6 = param0.getParameter("currency");
            if (var6 == null) {
              break L4;
            } else {
              if (jf.a((CharSequence) (Object) var6, 7552)) {
                gd.field_a = hh.a(10, (CharSequence) (Object) var6);
                break L3;
              } else {
                break L4;
              }
            }
          }
          gd.field_a = 2;
          break L3;
        }
        em.field_d = param3;
        rh.field_e = param5;
        qf.field_d = param2;
        bh.field_c = new nh[param4.length];
        var7 = 0;
        L5: while (true) {
          if (var7 >= param4.length) {
            bc.field_b = param4;
            return;
          } else {
            bh.field_c[var7] = new nh(317, 34);
            var7++;
            continue L5;
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 34) {
            return;
        }
        hl.field_d = false;
        r.field_d = 8;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 34) {
            wb.a(84);
        }
    }

    final static void a(boolean param0, int param1, je param2) {
        aa.field_e.a((gi) (Object) param2, 255);
        if (!param0) {
            return;
        }
        hl.a(param2, 126, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new he[1];
    }
}

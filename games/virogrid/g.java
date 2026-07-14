/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static eh field_a;
    static tn field_b;
    static boolean field_c;
    static String field_d;

    final static void a(int param0) {
        if (param0 != 13984) {
            field_c = false;
            qc.field_h = true;
            sd.field_e = 0;
            return;
        }
        qc.field_h = true;
        sd.field_e = 0;
    }

    final static void a(byte param0, u param1) {
        if (param0 < 60) {
          return;
        } else {
          param1.field_w = new int[]{-1};
          param1.field_r = new char[]{(char)63};
          return;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 > -18) {
            Object var2 = null;
            g.a((byte) 15, (u) null);
        }
    }

    final static void a(byte param0) {
        kf.a(4, -1);
        if (param0 != -33) {
            g.b((byte) 71);
        }
    }

    final static String a(String param0, int param1, int param2) {
        int var4 = 0;
        hg var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param0;
        if (dm.a(var6, -1478)) {
          if (param1 <= -127) {
            if (jc.a(param0, true)) {
              return ql.field_k;
            } else {
              if ((oa.field_q ^ -1) == -3) {
                if (!fm.a(param0, -1369854352)) {
                  if ((mj.field_z ^ -1) > -101) {
                    if (ch.a(param0, (byte) -73)) {
                      return oi.a(new String[1], o.field_c, 2);
                    } else {
                      var5 = gk.field_g;
                      var5.g(param2, 8);
                      var5.field_l = var5.field_l + 1;
                      var4 = var5.field_l;
                      var5.a(2, 76);
                      var5.a(param0, (byte) -96);
                      var5.b(var5.field_l - var4, -1);
                      return null;
                    }
                  } else {
                    return ig.field_a;
                  }
                } else {
                  return oi.a(new String[1], lc.field_d, 2);
                }
              } else {
                return sa.field_p;
              }
            }
          } else {
            return null;
          }
        } else {
          return sa.field_l;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new tn(1);
        field_d = "This game option is not available in rated games.";
        field_c = false;
    }
}

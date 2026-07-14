/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    int field_d;
    byte[] field_c;
    int field_e;
    int field_b;
    static sc field_a;
    int field_l;
    int field_h;
    int field_k;
    byte[] field_g;
    static int field_i;
    int field_j;
    static long field_f;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var3 = 0;
        if (param1 == 29532) {
          var4 = rf.field_c;
          L0: while (true) {
            if (ee.field_g.length > var3) {
              var5 = ni.field_a[var3];
              if (var5 >= 0) {
                var6 = ii.a(ee.field_g[var3], true, 0);
                var4 = var4 + we.field_l;
                var7 = -(var6 >> 870040769) + uh.field_D;
                if (sj.a(param2, (oh.field_b << -603556095) + fb.field_g, var4, var6 + (jh.field_e << -960709887), param0, true, -jh.field_e + var7)) {
                  return var5;
                } else {
                  var4 = var4 + (fb.field_g + (oh.field_b << 1762055041) + we.field_l);
                  var3++;
                  var3++;
                  continue L0;
                }
              } else {
                var4 = var4 + hc.field_fb;
                var3++;
                var3++;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          field_a = null;
          var4 = rf.field_c;
          if (ee.field_g.length > var3) {
            L1: {
              var5 = ni.field_a[var3];
              if (var5 >= 0) {
                var6 = ii.a(ee.field_g[var3], true, 0);
                var4 = var4 + we.field_l;
                var7 = -(var6 >> 870040769) + uh.field_D;
                if (sj.a(param2, (oh.field_b << -603556095) + fb.field_g, var4, var6 + (jh.field_e << -960709887), param0, true, -jh.field_e + var7)) {
                  return var5;
                } else {
                  var4 = var4 + (fb.field_g + (oh.field_b << 1762055041) + we.field_l);
                  break L1;
                }
              } else {
                var4 = var4 + hc.field_fb;
                var3++;
                break L1;
              }
            }
            var3++;
            var3++;
            var3++;
            return -1;
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 870040769) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new sc();
    }
}

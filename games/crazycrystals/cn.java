/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static sj field_b;
    static int field_a;
    static dl[] field_c;
    static am field_e;
    static double[] field_d;

    final static boolean b(int param0) {
        pi var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pi var5 = null;
        var4 = CrazyCrystals.field_B;
        var5 = (pi) (Object) hc.field_b.g(32073);
        var1 = var5;
        if (var1 != null) {
          var2 = -85 % ((param0 - 23) / 39);
          var3 = 0;
          L0: while (true) {
            if (var1.field_i > var3) {
              L1: {
                if (var5.field_k[var3] == null) {
                  break L1;
                } else {
                  if (var5.field_k[var3].field_a != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              if (null == var5.field_m[var3]) {
                var3++;
                var3++;
                var3++;
                continue L0;
              } else {
                if (var5.field_m[var3].field_a == 0) {
                  return false;
                } else {
                  var3++;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 < 9) {
            field_c = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sj(14, 0, 4, 1);
    }
}

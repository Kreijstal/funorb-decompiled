/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int[] field_a;

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param0 < param2.length) {
          var3 = param2[param0];
          if (var3 != 0) {
            var4 = ul.field_b;
            var5 = ul.field_i;
            var6 = ul.field_d;
            var7 = ul.field_e - var5;
            var8 = ul.field_a - var6;
            var9 = ul.field_f - var7;
            var10 = var5 + var6 * ul.field_f;
            var11 = var6 - 1 << 2;
            var12 = ul.field_e;
            var13 = -var8;
            L0: while (true) {
              if (var13 >= 0) {
                return;
              } else {
                var11 = var11 + 4 & 12;
                var14 = -var7;
                L1: while (true) {
                  if (var14 >= 0) {
                    var10 = var10 + var9;
                    var13++;
                    continue L0;
                  } else {
                    var15 = 1 << var11 + (var12 + var14 & 3);
                    if ((var3 & var15) == 0) {
                      var10++;
                      var14++;
                      continue L1;
                    } else {
                      var10++;
                      var4[var10] = param1;
                      var14++;
                      continue L1;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          ul.h(0, 0, ul.field_f, ul.field_l, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 32800, 41120, 41380, 42405, 46565, 62965, 65015};
    }
}

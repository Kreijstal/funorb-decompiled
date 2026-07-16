/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
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
            var4 = df.field_d;
            var5 = df.field_i;
            var6 = df.field_g;
            var7 = df.field_k - var5;
            var8 = df.field_h - var6;
            var9 = df.field_e - var7;
            var10 = var5 + var6 * df.field_e;
            var11 = var6 - 1 << 2;
            var12 = df.field_k;
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
                      int incrementValue$81 = var10;
                      var10++;
                      var4[incrementValue$81] = param1;
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
          df.b(0, 0, df.field_e, df.field_f, param1);
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

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static bd[][] field_c;
    static String field_b;
    static re field_h;
    static int[] field_g;
    static nc field_e;
    static bd[] field_d;
    static int field_a;
    static int[][] field_f;

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        int var2 = -46 / ((-47 - param0) / 34);
        if (4096 > param1) {
            return param1 < 2048 ? vd.field_B[-param1 + 2048] : -vd.field_B[param1 - 2048];
        }
        return param1 < 6144 ? -vd.field_B[-param1 + 6144] : vd.field_B[-6144 + param1];
    }

    public static void a() {
        field_f = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_g = new int[256];
        field_b = "The direction towards your current objective. You can view your objectives on the pause console.";
        field_a = 0;
        field_d = null;
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_g[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) == 1) {
                  var0 = var0 >>> 1 ^ -306674912;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}

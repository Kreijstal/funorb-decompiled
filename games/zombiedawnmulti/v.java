/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_g;
    static ri field_e;
    static int field_f;
    static int[] field_b;
    private static long[] field_d;
    static String field_a;
    static String field_c;

    final static void a(int param0) {
        int var1 = (kp.field_l - 640) / 2;
        int var2 = b.field_d * b.field_d;
        int var3 = var2 + -(mh.field_h * mh.field_h);
        qe.field_k.a(-4 + (-120 + oo.field_l) - 90, 90, 199, -(var3 * param0 / var2) + var1, -3344);
        cm.field_a.a(-120 + (oo.field_l + -4), 0, 438, var1 - -202 - -(var3 * 438 / var2), -3344);
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_g = null;
        field_c = null;
        if (!param0) {
            v.a(-99);
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_g = "Quick Chat game";
        field_d = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 <= -257) {
            field_c = "To <%0>: ";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L != (1L & var0)) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> -2052733439;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 110 / ((-2 - param0) / 55);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        gn.field_y.a(true);
        var1 = param0;
        L0: while (true) {
          if (32 <= var1) {
            var1 = 0;
            L1: while (true) {
              if (32 <= var1) {
                id.field_b = 0;
                return;
              } else {
                gf.field_a[var1] = 0L;
                var1++;
                continue L1;
              }
            }
          } else {
            rh.field_x[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hide private chat and appear offline to friends";
    }
}

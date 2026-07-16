/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int[] field_b;
    static kc[] field_d;
    static af field_a;
    static int field_c;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        int var1 = -35 % ((77 - param0) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_z = "pc.A(";
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (1 & var0)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 1567166081;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}

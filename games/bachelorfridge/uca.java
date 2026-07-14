/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uca {
    static du field_b;
    static int[] field_d;
    static String field_c;
    static qia field_a;

    final static void a(int param0, byte param1) {
        if (!(af.field_a)) {
            return;
        }
        bf.field_h[wca.field_n].a(param0, (byte) 73);
        int var2 = 56 / ((param1 - 49) / 47);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_b = new du(6, 0, 4, 2);
        field_c = "From only <%0>/month";
        field_d = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 <= -257) {
            field_a = new qia();
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 <= var2) {
                field_d[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 == (1 & var0)) {
                  var0 = var0 >>> 402872513 ^ -306674912;
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

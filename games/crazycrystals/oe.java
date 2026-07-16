/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int[] field_b;
    static String[] field_d;
    static int[] field_c;
    static fq[] field_a;

    final static si a(boolean param0, byte param1) {
        si var2 = new si(true);
        var2.field_f = param0 ? true : false;
        if (param1 <= 93) {
            return null;
        }
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 >= -97) {
            oe.a(50);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_d = new String[]{"fgtiles_brick", "fgtiles_hedge", "fgtiles_steel", "fgtiles_concrete"};
            field_c = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 8, 8, 0, 0, 0, 0, 0, 0, 4, 0};
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0 ^ -1) == -2) {
                  var0 = var0 >>> -1065330367 ^ -306674912;
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

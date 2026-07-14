/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    int field_c;
    static int field_a;
    int field_d;
    static String field_e;
    int field_b;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 75) {
            ea.a((byte) 30);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Confined.field_J ? 1 : 0;
          fn.b(param2, param1, param4 + 1, 10000536);
          fn.b(param2, param3 + param1, param4 - -1, 12105912);
          var5 = 1;
          if (fn.field_b <= var5 + param1) {
            break L0;
          } else {
            var5 = fn.field_b + -param1;
            break L0;
          }
        }
        L1: {
          var6 = param3;
          if (fn.field_j < param1 + var6) {
            var6 = fn.field_j - param1;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param0) {
          field_a = 105;
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = var7 * 48 / param3 + 152;
              var9 = var8 << -1512370776 | var8 << -2000090640 | var8;
              fn.field_h[(var7 + param1) * fn.field_g + param2] = var9;
              fn.field_h[param4 + param2 + (var7 + param1) * fn.field_g] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          var7 = var5;
          L3: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = var7 * 48 / param3 + 152;
              var9 = var8 << -1512370776 | var8 << -2000090640 | var8;
              fn.field_h[(var7 + param1) * fn.field_g + param2] = var9;
              fn.field_h[param4 + param2 + (var7 + param1) * fn.field_g] = var9;
              var7++;
              continue L3;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Watch Introduction";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            var11 = cr.a(an.field_q, param5, ha.field_n, 0);
            var12 = cr.a(an.field_q, param4, ha.field_n, 0);
            var13 = cr.a(eo.field_l, param2, pw.field_x, 0);
            var14 = cr.a(eo.field_l, param1, pw.field_x, 0);
            var7_int = cr.a(an.field_q, param5 + param6, ha.field_n, 0);
            var8 = cr.a(an.field_q, param4 + -param6, ha.field_n, 0);
            var15 = var11;
            L1: while (true) {
              if (var15 >= var7_int) {
                var15 = var12;
                L2: while (true) {
                  if (var15 <= var8) {
                    var9 = cr.a(eo.field_l, param6 + param2, pw.field_x, 0);
                    var10 = cr.a(eo.field_l, -param6 + param1, pw.field_x, 0);
                    var15 = var7_int;
                    L3: while (true) {
                      if (var15 > var8) {
                        break L0;
                      } else {
                        var21 = tj.field_b[var15];
                        hba.a(param0, var13, var21, 7, var9);
                        hba.a(param0, var10, var21, 7, var14);
                        var15++;
                        continue L3;
                      }
                    }
                  } else {
                    hba.a(param0, var13, tj.field_b[var15], 7, var14);
                    var15--;
                    continue L2;
                  }
                }
              } else {
                hba.a(param0, var13, tj.field_b[var15], 7, var14);
                var15++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var7, "faa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 14040 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a() {
        field_a = null;
        int var1 = -5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add <%0> to friend list";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int[] field_c;
    static String field_e;
    static double field_d;
    static String field_f;
    static int[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    final static void a(jp param0, int param1, int param2, pb param3, int param4, int param5, jp param6) {
        fc.a(-72, param3.field_p);
        lb.g(0, 0, param3.field_i, param3.field_q, um.field_u[param5], 928072);
        og.a(-124, 128, 8, param0, 16777215, (-param0.field_x + param3.field_i) / 2, 85 + (param1 + -param0.field_z));
        try {
            og.a(-113, 8, 128, param6, 16777215, (param3.field_i + -param0.field_x) / 2, 480 + param1 + (-param0.field_z - -(60 / param2)));
            sc.b(-90);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + -8562 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (1 != param0) {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = param2 * var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                L2: {
                  if (0 == (param0 & 1)) {
                    break L2;
                  } else {
                    var3_int = var3_int * param2;
                    break L2;
                  }
                }
                param2 = param2 * param2;
                param0 = param0 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "hh.A(" + param0 + ',' + 29605 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "+<%0>";
        field_f = "Yes";
        field_c = new int[]{12658477, 3952770, 16494651, 26679, 16711935};
        field_d = Math.atan2(1.0, 0.0);
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = new int[2];
    }
}

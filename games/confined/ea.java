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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              fn.b(param2, param1, param4 + 1, 10000536);
              fn.b(param2, param3 + param1, param4 - -1, 12105912);
              var5_int = 1;
              if (fn.field_b <= var5_int + param1) {
                break L1;
              } else {
                var5_int = fn.field_b + -param1;
                break L1;
              }
            }
            L2: {
              var6 = param3;
              if (fn.field_j < param1 + var6) {
                var6 = fn.field_j - param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                field_a = 105;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = var7 * 48 / param3 + 152;
                var9 = var8 << -1512370776 | var8 << -2000090640 | var8;
                fn.field_h[(var7 + param1) * fn.field_g + param2] = var9;
                fn.field_h[param4 + param2 + (var7 + param1) * fn.field_g] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "ea.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_e = "Watch Introduction";
    }
}

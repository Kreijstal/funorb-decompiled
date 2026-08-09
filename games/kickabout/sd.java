/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_e;
    static hd field_a;
    static int field_b;
    static r field_d;
    static String field_c;

    public static void a(int param0) {
        if (param0 != -1) {
          field_e = (String) null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(ut param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.field_y.length <= var2_int) {
                param0.field_y[0] = 0;
                if (param1 == -51) {
                  param0.field_y[-1 + param0.field_o] = 0;
                  param0.field_y[(-1 + param0.field_v) * param0.field_o] = 0;
                  param0.field_y[-1 + param0.field_y.length] = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if ((param0.field_y[var2_int] ^ -1) != -1) {
                    break L2;
                  } else {
                    param0.field_y[var2_int] = 65793;
                    break L2;
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("sd.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_e = "buyout can't go below starting price";
        field_c = "Only show lobby chat from my friends";
        field_b = 370;
        field_d = new r();
    }
}

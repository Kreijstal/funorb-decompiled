/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static er[] field_b;
    static nj field_a;
    static int field_c;

    final static void a(byte param0) {
        if (param0 >= -36) {
          field_b = null;
          ql.i(34);
          al.a((byte) -41);
          up.field_z = null;
          bm.g(0);
          return;
        } else {
          ql.i(34);
          al.a((byte) -41);
          up.field_z = null;
          bm.g(0);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            param1--;
            param3--;
            var5_int = -7 + param3;
            L1: while (true) {
              if (var5_int <= param1) {
                L2: while (true) {
                  if (param1 >= param3) {
                    if (param0 <= -73) {
                      break L0;
                    } else {
                      field_c = -5;
                      return;
                    }
                  } else {
                    param1++;
                    param2[param1] = param4;
                    continue L2;
                  }
                }
              } else {
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                param1++;
                param2[param1] = param4;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ki.A(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nj();
    }
}

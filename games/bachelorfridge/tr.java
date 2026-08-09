/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    final static void a(int param0) {
        wi.a(true, sc.field_n, wj.field_i, (byte) -68);
        int var1 = -114 % ((-65 - param0) / 32);
        sna.field_s = true;
    }

    final static void a(int param0, kv param1, int param2, int param3, kv param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            var8_int = 0;
            L1: while (true) {
              if (param1.field_v.length <= var8_int) {
                if (param6 == -26512) {
                  break L0;
                } else {
                  tr.a(-31);
                  return;
                }
              } else {
                L2: {
                  var9 = var8_int % param1.field_q;
                  var10 = var8_int / param1.field_q;
                  if (16777215 != (-16777216 & param1.field_v[var8_int] ^ -1)) {
                    break L2;
                  } else {
                    rba.a(param2, param0 - -var10, var9 + param7, -1, param4.field_v[param3 + (var9 + (var10 + param5) * param4.field_q)]);
                    break L2;
                  }
                }
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("tr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}

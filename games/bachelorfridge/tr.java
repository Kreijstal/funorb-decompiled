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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          for (var8_int = 0; param1.field_v.length > var8_int; var8_int++) {
            var9 = var8_int % param1.field_q;
            var10 = var8_int / param1.field_q;
            if ((-16777216 & param1.field_v[var8_int]) == -16777216) {
              rba.a(param2, param0 + var10, var9 + param7, -1, param4.field_v[param3 + (var9 + (var10 + param5) * param4.field_q)]);
            }
          }
          if (param6 == -26512) {
            return;
          }
          tr.a(-31);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("tr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
    }
}

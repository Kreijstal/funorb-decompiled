/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ao extends kda {
    static d field_d;
    static String field_c;

    ao() {
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 113 % ((param0 - 21) / 43);
        field_d = null;
    }

    final static void a(int param0, kv[] param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        try {
          if (param1 != null &&
            param2 > 0) {
            var5_int = param1[0].field_n;
            var6 = param1[2].field_n;
            if (param3 != -128) {
              return;
            }
            var7 = param1[1].field_n;
            param1[0].e(param0, param4);
            param1[2].e(param0 + param2 - var6, param4);
            dg.a(eha.field_q);
            dg.c(param0 + var5_int, param4, -var6 + param0 + param2, param4 + param1[1].field_o);
            var8 = param0 + var5_int;
            var9 = -var6 + param2 + param0;
            for (param0 = var8; var9 > param0; param0 = param0 + var7) {
              param1[1].e(param0, param4);
            }
            dg.b(eha.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ao.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = "Month";
    }
}

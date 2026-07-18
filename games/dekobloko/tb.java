/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static nm field_b;
    static w field_c;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param5 > param0) {
          if (param1 <= param5) {
            if (param0 < param1) {
              ib.a(param2, param1, param4, param5, param3, (byte) 117, param7, param0, hk.field_l);
              return;
            } else {
              ib.a(param7, param0, param4, param5, param3, (byte) 117, param2, param1, hk.field_l);
              return;
            }
          } else {
            ib.a(param2, param5, param7, param1, param3, (byte) 117, param4, param0, hk.field_l);
            return;
          }
        } else {
          if (param0 >= param1) {
            if (param1 > param5) {
              ib.a(param4, param1, param2, param0, param3, (byte) 117, param7, param5, hk.field_l);
              return;
            } else {
              ib.a(param7, param5, param2, param0, param3, (byte) 117, param4, param1, hk.field_l);
              return;
            }
          } else {
            ib.a(param4, param0, param7, param1, param3, (byte) 117, param2, param5, hk.field_l);
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        af.field_f = param0;
        kk.field_e = param2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, ck param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          uh.a(-9074);
          hk.a(param1.field_D, param1.field_K, param1.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tb.D(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "NEW THEME<br>UNLOCKED!";
    }
}

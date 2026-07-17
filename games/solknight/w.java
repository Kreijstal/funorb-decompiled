/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static nc field_a;
    static String[] field_c;
    static o[] field_b;
    static String field_d;

    final static Object a(byte[] param0) {
        f var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        f stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        f stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0.length <= 136) {
                stackOut_8_0 = na.a(123, param0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var3 = new f();
                ((rk) (Object) var3).a(0, param0);
                stackOut_6_0 = (f) var3;
                stackIn_7_0 = stackOut_6_0;
                return (Object) (Object) stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("w.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 7 + 44 + 0 + 41);
        }
        return (Object) (Object) stackIn_9_0;
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = SolKnight.field_L ? 1 : 0;
        if (param0 < param13) {
          if (param13 >= param15) {
            if (param0 < param15) {
              hf.a(param9, param5, param7, param12, param0, param8, 1517200784, param14, param13, param1, param4, param10, mi.field_f, param2, param3, param11, param15);
              return;
            } else {
              hf.a(param1, param2, param8, param12, param15, param7, 1517200784, param3, param13, param9, param4, param10, mi.field_f, param5, param14, param11, param0);
              return;
            }
          } else {
            hf.a(param9, param5, param7, param8, param0, param12, 1517200784, param11, param15, param4, param1, param2, mi.field_f, param10, param3, param14, param13);
            return;
          }
        } else {
          if (param15 <= param0) {
            if (param13 >= param15) {
              hf.a(param1, param2, param8, param7, param15, param12, 1517200784, param11, param0, param4, param9, param5, mi.field_f, param10, param14, param3, param13);
              return;
            } else {
              hf.a(param4, param10, param12, param7, param13, param8, 1517200784, param14, param0, param1, param9, param5, mi.field_f, param2, param11, param3, param15);
              return;
            }
          } else {
            hf.a(param4, param10, param12, param8, param13, param7, 1517200784, param3, param15, param9, param1, param2, mi.field_f, param5, param11, param14, param0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nc();
        field_c = new String[16];
        field_d = "VICTORY<br>BONUS";
    }
}

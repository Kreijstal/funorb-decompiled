/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static nc field_a;
    static String[] field_c;
    static o[] field_b;
    static String field_d;

    final static Object a(byte[] param0, byte param1, boolean param2) {
        f var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        f stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        f stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 == 7) {
              if (param0 != null) {
                if (param0.length <= 136) {
                  stackOut_9_0 = na.a(123, param0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var3 = new f();
                  ((rk) (Object) var3).a(0, param0);
                  stackOut_7_0 = (f) var3;
                  stackIn_8_0 = stackOut_7_0;
                  return (Object) (Object) stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("w.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + 0 + 41);
        }
        return (Object) (Object) stackIn_10_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 53) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = SolKnight.field_L ? 1 : 0;
        if (param0 < param13) {
          if (param13 >= param15) {
            if (param0 >= param15) {
              hf.a(param1, param2, param8, param12, param15, param7, 1517200784, param3, param13, param9, param4, param10, mi.field_f, param5, param14, param11, param0);
              if (param6 > -13) {
                w.a((byte) 9);
                return;
              } else {
                return;
              }
            } else {
              hf.a(param9, param5, param7, param12, param0, param8, 1517200784, param14, param13, param1, param4, param10, mi.field_f, param2, param3, param11, param15);
              if (param6 > -13) {
                w.a((byte) 9);
                return;
              } else {
                return;
              }
            }
          } else {
            hf.a(param9, param5, param7, param8, param0, param12, 1517200784, param11, param15, param4, param1, param2, mi.field_f, param10, param3, param14, param13);
            if (param6 > -13) {
              w.a((byte) 9);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param15 <= param0) {
            if (param13 < param15) {
              hf.a(param4, param10, param12, param7, param13, param8, 1517200784, param14, param0, param1, param9, param5, mi.field_f, param2, param11, param3, param15);
              if (param6 <= -13) {
                return;
              } else {
                w.a((byte) 9);
                return;
              }
            } else {
              hf.a(param1, param2, param8, param7, param15, param12, 1517200784, param11, param0, param4, param9, param5, mi.field_f, param10, param14, param3, param13);
              if (param6 <= -13) {
                return;
              } else {
                w.a((byte) 9);
                return;
              }
            }
          } else {
            hf.a(param4, param10, param12, param8, param13, param7, 1517200784, param3, param15, param9, param1, param2, mi.field_f, param5, param11, param14, param0);
            if (param6 > -13) {
              w.a((byte) 9);
              return;
            } else {
              return;
            }
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

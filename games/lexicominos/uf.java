/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uf extends tj {
    static String field_o;
    static dg field_m;
    static String field_l;
    static int field_n;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Lexicominos.field_L ? 1 : 0;
        if (param9 < param6) {
          if (param15 <= param6) {
            if (param15 <= param9) {
              ul.a(param7, param6, param13, param15, lf.field_b, param2, param9, param14, param5, param1, param11, param0, -1464114640, param4, param10, param12, param8);
              return;
            } else {
              ul.a(param7, param6, param13, param9, lf.field_b, param11, param15, param10, param5, param4, param2, param12, -1464114640, param1, param14, param0, param8);
              return;
            }
          } else {
            ul.a(param2, param15, param0, param9, lf.field_b, param11, param6, param10, param14, param8, param7, param12, -1464114640, param1, param5, param13, param4);
            return;
          }
        } else {
          if (param15 <= param9) {
            if (param6 >= param15) {
              ul.a(param11, param9, param12, param15, lf.field_b, param2, param6, param14, param10, param8, param7, param0, -1464114640, param4, param5, param13, param1);
              return;
            } else {
              ul.a(param11, param9, param12, param6, lf.field_b, param7, param15, param5, param10, param4, param2, param13, -1464114640, param8, param14, param0, param1);
              return;
            }
          } else {
            ul.a(param2, param15, param0, param6, lf.field_b, param7, param9, param5, param14, param1, param11, param13, -1464114640, param8, param10, param12, param4);
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_l = null;
        field_o = null;
        field_m = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((uf) this).a(param0 ^ -126, param1) != ni.field_b) {
              if (param0 != -126) {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = ok.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("uf.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return (String) (Object) stackIn_6_0;
    }

    uf(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        sc stackIn_4_0 = null;
        sc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_8_0 = null;
        sc stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param1;
            if (bc.a(false, var4)) {
              L2: {
                var5 = (CharSequence) (Object) param1;
                var3_int = si.a((byte) 123, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (130 < var3_int) {
                    break L2;
                  } else {
                    return rh.field_p;
                  }
                }
              }
              stackOut_8_0 = ni.field_b;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_3_0 = ni.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("uf.H(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(String param0, int param1, String param2, boolean param3) {
        try {
            dd.field_d = param0;
            rf.field_b = param2;
            m.a(ca.field_o, -118, param3);
            int var4_int = -15 % ((param1 - 43) / 40);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Age:";
        field_l = "This password contains your Player Name, and would be easy to guess";
        field_n = -1;
    }
}

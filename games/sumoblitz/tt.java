/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tt extends ms {
    static String field_k;
    static int field_l;

    final static wb[] a(byte param0, int param1, ki param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        wb[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        wb[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!k.a(param2, param1, param3, -23046)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (wb[]) (Object) stackIn_4_0;
            } else {
              if (param0 <= -79) {
                stackOut_8_0 = ul.a(255);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (wb[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("tt.J(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 30692) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            ki.field_f = c.field_u[0];
            iv.field_i = c.field_u[1];
            hc.field_f = c.field_u[2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "tt.K(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        try {
            field_k = null;
            if (!param0) {
                field_k = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "tt.H(" + param0 + ')');
        }
    }

    tt(int param0, boolean param1) {
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -127) {
                break L1;
              } else {
                field_l = -86;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var3 = param1;
                  if (var3 == 6) {
                    break L4;
                  } else {
                    if (var3 != 7) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var2_int = dp.a(-26346, 0);
                if (!Sumoblitz.field_L) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var2_int = dp.a(-26346, param1);
              break L2;
            }
            stackOut_11_0 = ((8388607 ^ var2_int >> 564229153) & 8355711) + var2_int;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "tt.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "DEFEAT.";
        field_l = 256;
    }
}

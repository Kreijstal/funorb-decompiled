/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_b;
    static boolean field_a;

    final static int a(of param0, int param1, id param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_m == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param0.field_p != param2.field_l) {
                      break L1;
                    } else {
                      var4_int = param2.field_q.length;
                      var5 = param0.field_m[param3].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var5 <= var6) {
                          stackOut_19_0 = -1;
                          stackIn_20_0 = stackOut_19_0;
                          break L0;
                        } else {
                          L3: {
                            if (param0.field_r[param3][var6] != param2.field_s) {
                              break L3;
                            } else {
                              int discarded$12 = -25;
                              if (!ea.a(param0.field_o[param3][var6])) {
                                break L3;
                              } else {
                                var7 = 0;
                                L4: while (true) {
                                  if (var4_int <= var7) {
                                    stackOut_16_0 = var6;
                                    stackIn_17_0 = stackOut_16_0;
                                    return stackIn_17_0;
                                  } else {
                                    if (param2.field_q[var7] != param0.field_m[param3][var6 * var4_int + var7]) {
                                      break L3;
                                    } else {
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("kp.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(-1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    public static void a() {
        field_b = null;
    }

    final static void a(int param0, id param1) {
        try {
            ow.field_f.a((ms) (Object) param1, (byte) 39);
            km.a((byte) 69, 3, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "kp.A(" + 3 + 44 + (param1 != null ? "{...}" : "null") + 44 + 79 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Classic";
        field_a = false;
    }
}

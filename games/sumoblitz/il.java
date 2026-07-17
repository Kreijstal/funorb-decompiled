/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static hr field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dk a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        dk var5 = null;
        dk stackIn_4_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_10_0 = null;
        dk stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_11_0 = null;
        dk stackOut_9_0 = null;
        dk stackOut_6_0 = null;
        dk stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = g.a((byte) -126, var3);
                    if (var5 == null) {
                      stackOut_11_0 = lh.a(var4, -1);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (dk) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = qo.field_a;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = en.field_j;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("il.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 38 + 41);
        }
        return stackIn_12_0;
    }

    final static boolean a(boolean param0, ki param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 9) {
                if (!param0) {
                  var4 = 0;
                  var2_int = var4;
                  L2: while (true) {
                    if (var4 >= 9) {
                      qr.field_b.field_x.a((byte) 28);
                      qr.field_b.field_r.a((byte) 28);
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      L3: {
                        if (nt.field_m[var4] == null) {
                          break L3;
                        } else {
                          if (!qr.field_b.field_r.a(eb.field_b, nt.field_m[var4], -1, param1, 176400)) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            return stackIn_18_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                L4: {
                  if (null == nt.field_m[var2_int]) {
                    break L4;
                  } else {
                    if (!qr.field_b.field_x.a(eb.field_b, nt.field_m[var2_int], -1, param1, 176400)) {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("il.B(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26238) {
            field_a = 82;
        }
    }

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + aw.a("%0a", param1, "\n", true));
        if (param0 < 4) {
            il.a(81);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}

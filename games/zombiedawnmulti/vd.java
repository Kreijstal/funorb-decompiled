/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_d;
    static String field_b;
    static cj field_a;
    static int field_c;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      int discarded$1 = 0;
                      var4 = tg.a(param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            var5 = 76 % ((25 - param2) / 53);
                            if (eb.a((byte) 56, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (eb.a((byte) 84, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  if (param1.length() <= var7) {
                                    if (0 >= var6) {
                                      stackOut_33_0 = 1;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L0;
                                    } else {
                                      stackOut_31_0 = 0;
                                      stackIn_32_0 = stackOut_31_0;
                                      return stackIn_32_0 != 0;
                                    }
                                  } else {
                                    L5: {
                                      var8 = param1.charAt(var7);
                                      if (eb.a((byte) -75, (char) var8)) {
                                        var6++;
                                        break L5;
                                      } else {
                                        var6 = 0;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6 < 2) {
                                        break L6;
                                      } else {
                                        if (!param0) {
                                          stackOut_27_0 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          return stackIn_28_0 != 0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var7++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param2 + ')');
        }
        return stackIn_34_0 != 0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, long param1) {
        if (param1 <= 0L) {
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_b = "Wise";
    }
}

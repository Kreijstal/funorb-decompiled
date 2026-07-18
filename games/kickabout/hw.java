/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends gn {
    static double field_f;
    static int field_i;
    static boolean field_k;
    byte[] field_g;
    private static int[] field_h;
    private static int[] field_e;
    static float field_j;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = mo.a(0, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (1 > var4.length()) {
                          break L2;
                        } else {
                          if (ca.a(false, var4.charAt(0))) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            return stackIn_18_0 != 0;
                          } else {
                            if (!ca.a(false, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param0.length() <= var6) {
                                  if (0 < var5) {
                                    stackOut_32_0 = 0;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!ca.a(false, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (param2) {
                                        break L5;
                                      } else {
                                        stackOut_27_0 = 0;
                                        stackIn_28_0 = stackOut_27_0;
                                        return stackIn_28_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              return false;
                            }
                          }
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
          L6: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("hw.B(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + -26200 + ',' + param2 + ')');
        }
        return stackIn_33_0 != 0;
    }

    final static ki a(int param0, int param1, int param2, byte param3, byte param4) {
        int var5 = -103 / ((-46 - param2) / 36);
        return new ki(2, param0, param1, param4, param3);
    }

    hw(byte[] param0) {
        try {
            ((hw) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "hw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = 16384.0;
        field_i = (int)field_f >> 3;
        field_h = new int[255];
        for (var0 = 0; 255 > var0; var0++) {
            field_h[var0] = hf.a(var0 << 16, var0 << 8);
        }
        field_e = new int[255];
        for (var0 = 0; var0 < 255; var0++) {
            field_e[var0] = hf.a(var0 << 16, var0);
        }
    }
}

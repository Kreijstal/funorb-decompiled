/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static hh field_d;
    static om field_b;
    static lm field_a;
    static String[] field_c;
    static String field_f;
    static String[] field_e;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 != 63) {
            co.a((byte) -70);
        }
    }

    final static char a(ih param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        char[] var4_ref_char__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var12 = null;
        char[] var14 = null;
        char[] var16 = null;
        char[] var17 = null;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = 119;
            var3 = param0.a((char) var2_int);
            var16 = tc.field_k[0];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var9 = var10;
            var4_ref_char__ = var9;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var16.length) {
                var17 = tc.field_k[1];
                var5 = 0;
                L2: while (true) {
                  if (var17.length <= var5) {
                    L3: {
                      var4 = vk.a((byte) -89, bb.field_R[0], param0, uj.field_f[0]);
                      var5 = param0.a((char) var4);
                      if (var5 > var3) {
                        var3 = var5;
                        var2_int = var4;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      var4 = vk.a((byte) -63, bb.field_R[1], param0, uj.field_f[1]);
                      var5 = param0.a((char) var4);
                      if (var5 <= var3) {
                        break L4;
                      } else {
                        var3 = var5;
                        var2_int = var4;
                        break L4;
                      }
                    }
                    stackOut_21_0 = var2_int;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    var6 = var17[var5];
                    var7 = param0.a((char) var6);
                    if (ml.a((char) var6, 21654)) {
                      L5: {
                        if (var7 <= var3) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                L6: {
                  var6 = var16[var5];
                  if (!ml.a((char) var6, 21654)) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("co.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + -127 + ')');
        }
        return (char) stackIn_22_0;
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        tk stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_9_0 = wh.field_p;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (48 <= var4) {
                  if (57 >= var4) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (tk) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("co.C(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 0 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Type your email address again to make sure it's correct";
        field_b = new om(0, 2, 2, 1);
        field_e = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.", "We are now heading for the centre of the system, where <photo>a moon orbiting a sun-baked planet holds more of our technology.<br><br>This seems to be an important centre for the aliens. <photo>There are several fuel depots. Your ship has been converted to run on alien fuel if necessary.", "Watch out for these items. Land next to them to upgrade your ship.", "Be warned that these caves are defended. These dangerous red cylinders will pull your ship in like a magnet if you get too close."};
    }
}

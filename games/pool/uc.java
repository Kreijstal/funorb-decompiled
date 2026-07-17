/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static vh field_b;
    static vh field_a;

    public static void b() {
        field_b = null;
        field_a = null;
    }

    final static boolean a(char param0) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!td.a(param0, (byte) 5)) {
            L0: {
              if (param0 == 45) {
                break L0;
              } else {
                if (param0 == 160) {
                  break L0;
                } else {
                  if (param0 == 32) {
                    break L0;
                  } else {
                    if (95 != param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 > -95) {
            return false;
        }
        return true;
    }

    final static void a(byte param0) {
        tn var1 = (tn) (Object) cb.field_e.b(-1);
        int var2 = 34 % ((-56 - param0) / 50);
        if (var1 == null) {
            var1 = new tn();
        }
        var1.a(qh.field_l, qh.field_f, qh.field_b, qh.field_g, -95, qh.field_j, qh.field_d, qh.field_c);
        nf.field_S.b((byte) 83, (ma) (Object) var1);
    }

    final static double[][] a(boolean param0, double[][][] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        double[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double[][] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[][] stackOut_9_0 = null;
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
            var2_int = 0;
            var3_int = 0;
            L1: while (true) {
              if (param1.length <= var3_int) {
                var3 = new double[var2_int][6];
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (param1.length <= var5) {
                    stackOut_9_0 = (double[][]) var3;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param1[var5].length) {
                        var5++;
                        continue L2;
                      } else {
                        int incrementValue$2 = var4;
                        var4++;
                        var3[incrementValue$2] = param1[var5][var6];
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var2_int = var2_int + param1[var3_int].length;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("uc.D(").append(1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    static {
    }
}

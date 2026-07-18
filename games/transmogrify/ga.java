/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static volatile int field_b;
    static rj field_a;

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length() <= var2_int) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  int discarded$14 = -37;
                  if (k.a((char) var3)) {
                    break L2;
                  } else {
                    int discarded$15 = 1;
                    if (!dj.a((char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
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
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ga.E(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 3336 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static kh a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        kh[] var3 = null;
        int var4 = 0;
        kh var5 = null;
        int var6 = 0;
        kh stackIn_6_0 = null;
        kh stackIn_12_0 = null;
        kh stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_5_0 = null;
        kh stackOut_14_0 = null;
        kh stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2 = lj.a(true, "jagex-last-login-method", param1);
            if (var2 == null) {
              stackOut_5_0 = qe.field_x;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              int discarded$2 = 87;
              var3 = hd.b();
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_14_0 = qe.field_x;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 0)) {
                    stackOut_11_0 = (kh) var5;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("ga.B(").append(125).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    final static void a() {
        if (si.field_l != -tf.field_a) {
          if (si.field_l == 250 - tf.field_a) {
            si.field_l = si.field_l + 1;
            return;
          } else {
            si.field_l = si.field_l + 1;
            return;
          }
        } else {
          si.field_l = si.field_l + 1;
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -35) {
            field_a = null;
            if (!(param0 != 16711935)) {
                return 0;
            }
            return ((param0 & 240) >> 4) + ((61440 & param0) >> 8);
        }
        if (!(param0 != 16711935)) {
            return 0;
        }
        return ((param0 & 240) >> 4) + ((61440 & param0) >> 8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}

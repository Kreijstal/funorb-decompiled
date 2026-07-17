/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends wl {
    int field_k;
    static oi field_l;
    byte[] field_i;
    static int field_j;

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (param0 < -11) {
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ki.field_G[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          field_j = 101;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L1: {
                  var3 = ki.field_G[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!(aa.field_lb == null)) {
            aa.field_lb.l(-27697);
        }
        ik.field_G = new tb();
        td.field_f.c((ub) (Object) ik.field_G, -128);
    }

    public static void c(int param0) {
        field_l = null;
    }

    final static ca[] a(int param0, mg param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ca[] var4 = null;
        int var5 = 0;
        ca var6_ref_ca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ca[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca[] stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param1.g(8, -11719);
            if (var2_int <= 0) {
              var3 = param1.g(param0, -11719);
              var4 = new ca[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (ca[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (!oe.a((byte) -55, param1)) {
                      var6 = param1.g(da.a(var5 + -1, true), -11719);
                      var4[var5] = var4[var6];
                      var5++;
                      break L2;
                    } else {
                      var6_ref_ca = new ca();
                      int discarded$126 = param1.g(24, -11719);
                      int discarded$127 = param1.g(24, -11719);
                      var6_ref_ca.field_b = param1.g(24, param0 + -11731);
                      int discarded$128 = param1.g(9, -11719);
                      int discarded$129 = param1.g(12, -11719);
                      int discarded$130 = param1.g(12, param0 ^ -11723);
                      int discarded$131 = param1.g(12, -11719);
                      var4[var5] = var6_ref_ca;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ca[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("ie.A(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    private ie() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new oi();
    }
}

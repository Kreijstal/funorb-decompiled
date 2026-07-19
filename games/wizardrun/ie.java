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
              if (-161 >= (var2 ^ -1)) {
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
              if (-161 >= (var2 ^ -1)) {
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
        if (param0 != -3870) {
          L0: {
            field_l = (oi) null;
            if (aa.field_lb != null) {
              aa.field_lb.l(-27697);
              break L0;
            } else {
              break L0;
            }
          }
          ik.field_G = new tb();
          td.field_f.c(ik.field_G, -128);
          return;
        } else {
          L1: {
            if (aa.field_lb != null) {
              aa.field_lb.l(-27697);
              break L1;
            } else {
              break L1;
            }
          }
          ik.field_G = new tb();
          td.field_f.c(ik.field_G, -128);
          return;
        }
    }

    public static void c(int param0) {
        ca[] discarded$0 = null;
        if (param0 != -1) {
            mg var2 = (mg) null;
            discarded$0 = ie.a(35, (mg) null);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static ca[] a(int param0, mg param1) {
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ca[] var4 = null;
        int var5 = 0;
        ca var6_ref_ca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ca[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ca[] stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                  stackOut_11_0 = (ca[]) (var4);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!oe.a((byte) -55, param1)) {
                      var6 = param1.g(da.a(var5 + -1, true), -11719);
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_ca = new ca();
                      discarded$30 = param1.g(24, -11719);
                      discarded$31 = param1.g(24, -11719);
                      var6_ref_ca.field_b = param1.g(24, param0 + -11731);
                      discarded$32 = param1.g(9, -11719);
                      discarded$33 = param1.g(12, -11719);
                      discarded$34 = param1.g(12, param0 ^ -11723);
                      discarded$35 = param1.g(12, -11719);
                      var4[var5] = var6_ref_ca;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ie.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_12_0;
        }
    }

    private ie() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new oi();
    }
}

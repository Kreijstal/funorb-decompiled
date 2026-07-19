/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lkb {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 199) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 >= -100) {
          lkb.a(92);
          var2 = (-640 + gp.field_p) / 2;
          var3 = ldb.field_o * ldb.field_o;
          var4 = var3 + -(param0 * param0);
          rga.field_g.a(var2 + -(199 * var4 / var3), 122, 199, 90, -94 + (-120 + dma.field_j));
          vva.field_r.a(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + dma.field_j);
          return;
        } else {
          var2 = (-640 + gp.field_p) / 2;
          var3 = ldb.field_o * ldb.field_o;
          var4 = var3 + -(param0 * param0);
          rga.field_g.a(var2 + -(199 * var4 / var3), 122, 199, 90, -94 + (-120 + dma.field_j));
          vva.field_r.a(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + dma.field_j);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static lkb a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lkb var5 = null;
        lkb stackIn_6_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_13_0 = null;
        lkb stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lkb stackOut_9_0 = null;
        lkb stackOut_14_0 = null;
        lkb stackOut_12_0 = null;
        lkb stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -68) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (-1 == (param0.length() ^ -1)) {
                  break L2;
                } else {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_9_0 = br.field_f;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = hca.a((byte) 108, var3);
                    if (var5 == null) {
                      stackOut_14_0 = ofb.a(0, var4);
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_12_0 = (lkb) (var5);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_5_0 = gca.field_r;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("lkb.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    static {
        field_a = new int[1];
    }
}

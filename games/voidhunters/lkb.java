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

    final static lkb a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lkb var5 = null;
        lkb stackIn_4_0 = null;
        lkb stackIn_8_0 = null;
        lkb stackIn_11_0 = null;
        lkb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lkb stackOut_7_0 = null;
        lkb stackOut_12_0 = null;
        lkb stackOut_10_0 = null;
        lkb stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_7_0 = br.field_f;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = hca.a((byte) 108, var3);
                    if (var5 == null) {
                      stackOut_12_0 = ofb.a(0, var4);
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_10_0 = (lkb) var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = gca.field_r;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("lkb.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -116 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[1];
    }
}

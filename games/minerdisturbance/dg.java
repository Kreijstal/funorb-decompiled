/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_b;
    static bg field_a;

    final static void a() {
        vl.h(-1);
        wi.field_C = true;
        gd.field_B = true;
        mb.field_b.n(21974);
        int discarded$0 = 0;
        t.a(false, vb.field_a);
    }

    final static gj a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        gj var5 = null;
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_12_0 = null;
        gj stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_7_0 = null;
        gj stackOut_11_0 = null;
        gj stackOut_13_0 = null;
        gj stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = dh.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = ha.a(92, var3);
                    if (var5 != null) {
                      stackOut_11_0 = (gj) var5;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      int discarded$2 = 1;
                      stackOut_13_0 = hm.a(var4);
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = bj.field_h;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("dg.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + -115 + ')');
        }
        return stackIn_14_0;
    }

    public static void b() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = new bg(14, 0, 4, 1);
    }
}

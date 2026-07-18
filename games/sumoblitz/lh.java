/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ms {
    static il field_n;
    byte[] field_m;
    static ri field_k;
    boolean field_o;
    static ji field_l;
    static String field_p;

    public static void a() {
        field_k = null;
        field_l = null;
        field_n = null;
        field_p = null;
        int var1 = 90;
    }

    final static dk a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        dk var7 = null;
        int var8 = 0;
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        dk stackIn_17_0 = null;
        dk stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_6_0 = null;
        dk stackOut_10_0 = null;
        dk stackOut_19_0 = null;
        dk stackOut_16_0 = null;
        dk stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = cn.field_ib;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                int discarded$4 = -27224;
                var3 = cn.a('.', param0);
                if (var3.length < 2) {
                  stackOut_10_0 = qo.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_19_0 = cp.a(25, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      int discarded$5 = -1;
                      var7 = fh.a(var6);
                      if (var7 != null) {
                        stackOut_16_0 = (dk) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = qo.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("lh.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + -1 + ')');
        }
        return stackIn_20_0;
    }

    lh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new il();
        field_l = new ji();
        field_p = "reset stats";
    }
}

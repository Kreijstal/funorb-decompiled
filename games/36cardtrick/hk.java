/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static String field_c;
    static java.awt.Font field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static ha[] a(int param0, w param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ha[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ha var7_ref_ha = null;
        int var8 = 0;
        ha[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ha[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            var2_int = param1.g(8, -1);
            if (var2_int <= 0) {
              var3 = param1.g(12, -1);
              var4 = new ha[var3];
              var5 = 0;
              var6 = -40 % ((12 - param0) / 38);
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (ha[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (!di.a((byte) -78, param1)) {
                      var7 = param1.g(hj.b(-27571, -1 + var5), -1);
                      var4[var5] = var4[var7];
                      var5++;
                      break L2;
                    } else {
                      var7_ref_ha = new ha();
                      int discarded$6 = param1.g(24, -1);
                      int discarded$7 = param1.g(24, -1);
                      var7_ref_ha.field_b = param1.g(24, -1);
                      int discarded$8 = param1.g(9, -1);
                      int discarded$9 = param1.g(12, -1);
                      int discarded$10 = param1.g(12, -1);
                      int discarded$11 = param1.g(12, -1);
                      var4[var5] = var7_ref_ha;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(byte param0, int param1, int param2) {
        gl.a(param2, jd.field_c[param1], ca.field_c[param1], 804);
        if (param0 <= 121) {
            Object var4 = null;
            ha[] discarded$0 = hk.a(-7, (w) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
    }
}

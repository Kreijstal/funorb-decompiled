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
        if (param0 < 107) {
            hk.a((byte) 65, -66, -69);
        }
    }

    final static ha[] a(int param0, w param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ha[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ha var7_ref_ha = null;
        int var8 = 0;
        ha[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ha[] stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            var2_int = param1.g(8, -1);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param1.g(12, -1);
              var4 = new ha[var3];
              var5 = 0;
              var6 = -40 % ((12 - param0) / 38);
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_11_0 = (ha[]) (var4);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    if (!di.a((byte) -78, param1)) {
                      var7 = param1.g(hj.b(-27571, -1 + var5), -1);
                      var4[var5] = var4[var7];
                      break L2;
                    } else {
                      var7_ref_ha = new ha();
                      discarded$6 = param1.g(24, -1);
                      discarded$7 = param1.g(24, -1);
                      var7_ref_ha.field_b = param1.g(24, -1);
                      discarded$8 = param1.g(9, -1);
                      discarded$9 = param1.g(12, -1);
                      discarded$10 = param1.g(12, -1);
                      discarded$11 = param1.g(12, -1);
                      var4[var5] = var7_ref_ha;
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
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(byte param0, int param1, int param2) {
        ha[] discarded$0 = null;
        gl.a(param2, jd.field_c[param1], ca.field_c[param1], 804);
        if (param0 <= 121) {
            w var4 = (w) null;
            discarded$0 = hk.a(-7, (w) null);
        }
    }

    static {
        field_c = "Confirm Password: ";
    }
}

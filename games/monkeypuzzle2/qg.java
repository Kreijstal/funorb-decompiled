/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int field_c;
    static long field_d;
    static ic field_a;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param1 == 0) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (param1 > 65535) {
                var2 += 16;
                param1 = param1 >> 16;
            }
            if (param1 > 255) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (!(param1 <= 15)) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (param1 > 3) {
                var2 += 2;
                param1 = param1 >> 2;
            }
            if (!(param1 <= 1)) {
                var2++;
                param1 = param1 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param1 < -65536) {
            param1 = param1 >> 16;
            var2 += 16;
        }
        if (param1 < -256) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (param1 < -16) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 >= -4)) {
            var2 += 2;
            param1 = param1 >> 2;
        }
        if (!(param1 >= -2)) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static r a(int param0, int param1, int param2, md param3) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        r var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        r stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        r stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            int discarded$4 = 480;
            var8 = pd.a(0, 0, param3, 640, 0);
            var6 = var8;
            if (var8 != null) {
              var7 = new r();
              var7.field_c = var8;
              java.awt.Component discarded$5 = var7.field_c.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, 640, 480);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (r) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (r) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("qg.B(").append(640).append(44).append(480).append(44).append(0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -73 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "OFF";
    }
}

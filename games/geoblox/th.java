/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends lf {
    static int[] field_h;
    static String field_g;
    static na field_f;

    th(long param0, String param1) {
        super(param0, param1);
    }

    final static od a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        od[] var3 = null;
        int var4 = 0;
        od var5 = null;
        int var6 = 0;
        od stackIn_3_0 = null;
        od stackIn_9_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_11_0 = null;
        od stackOut_8_0 = null;
        od stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            int discarded$4 = -114;
            var2 = qi.a("jagex-last-login-method", param0);
            if (var2 != null) {
              int discarded$5 = 0;
              var3 = ak.a();
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_11_0 = td.field_I;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(115, var2)) {
                    stackOut_8_0 = (od) var5;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = td.field_I;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("th.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 200 + ')');
        }
        return stackIn_12_0;
    }

    public static void d() {
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final qg a(byte param0) {
        if (param0 != -32) {
            qg discarded$0 = ((th) this).a((byte) 104);
            return vh.field_D;
        }
        return vh.field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        field_g = "Player";
    }
}

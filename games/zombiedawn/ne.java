/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int field_b;
    static no field_c;
    static String field_a;

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final static sn a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn stackIn_4_0 = null;
        sn stackIn_10_0 = null;
        sn stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        sn stackOut_3_0 = null;
        sn stackOut_12_0 = null;
        sn stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var2 = hf.a(true, param0, "jagex-last-login-method");
            if (var2 == null) {
              stackOut_3_0 = u.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              int discarded$2 = 31114;
              var3 = cn.b();
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_12_0 = u.field_e;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, (byte) -22)) {
                    stackOut_9_0 = (sn) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("ne.A(");
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
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This entry doesn't match";
    }
}

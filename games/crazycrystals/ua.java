/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static am field_a;

    final static mb a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mb[] var3 = null;
        int var4 = 0;
        mb var5 = null;
        int var6 = 0;
        mb stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        mb stackIn_11_0 = null;
        mb stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_13_0 = null;
        mb stackOut_10_0 = null;
        Object stackOut_5_0 = null;
        mb stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var2 = ah.a(true, param1, "jagex-last-login-method");
            if (var2 != null) {
              if (param0 == -11662) {
                var3 = vm.a((byte) 120);
                var4 = 0;
                L1: while (true) {
                  if (var4 >= var3.length) {
                    stackOut_13_0 = je.field_b;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (!var5.a(1, var2)) {
                      var4++;
                      continue L1;
                    } else {
                      stackOut_10_0 = (mb) var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (mb) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = je.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("ua.A(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int field_b;
    static no field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 != 83) {
            field_b = -18;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static sn a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn stackIn_4_0 = null;
        sn stackIn_10_0 = null;
        sn stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var2 = hf.a(true, param0, "jagex-last-login-method");
            if (var2 == null) {
              stackIn_4_0 = u.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = cn.b(31114);
              var4 = param1;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackIn_13_0 = u.field_e;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, (byte) -22)) {
                    stackIn_10_0 = (sn) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("ne.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_a = "This entry doesn't match";
    }
}

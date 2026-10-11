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
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        sn[] var3 = null;
        sn var5 = null;
        int var6 = 0;
        sn stackIn_4_0 = null;
        sn stackIn_10_0 = null;
        sn stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var2 = hf.a(true, param0, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = u.field_e;
            return stackIn_4_0;
          }
          var3 = cn.b(31114);
          for (var4 = param1; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, (byte) -22)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          stackIn_13_0 = u.field_e;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("ne.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "This entry doesn't match";
    }
}

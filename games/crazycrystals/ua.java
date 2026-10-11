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
        mb stackIn_6_0 = null;
        mb stackIn_11_0 = null;
        mb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          var2 = ah.a(true, param1, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_3_0 = je.field_b;
            return stackIn_3_0;
          }
          if (param0 != -11662) {
            stackIn_6_0 = (mb) null;
            return stackIn_6_0;
          }
          var3 = vm.a((byte) 120);
          var4 = 0;
          while (true) {
            if (var4 >= var3.length) {
              stackIn_14_0 = je.field_b;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(1, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("ua.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_a = (am) null;
        }
    }

    static {
    }
}

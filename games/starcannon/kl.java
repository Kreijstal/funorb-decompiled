/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static int[] field_c;
    static int field_d;
    static ue field_b;
    int field_e;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21367) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        try {
          lj.field_c = param0;
          if (param1 != 8192) {
            field_d = -99;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static mj a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mj[] var3 = null;
        int var4 = 0;
        mj var5 = null;
        java.applet.Applet var6 = null;
        mj stackIn_2_0 = null;
        mj stackIn_9_0 = null;
        mj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = fh.a("jagex-last-login-method", param0, (byte) 120);
          if (var2 == null) {
            stackIn_2_0 = ih.field_c;
            return stackIn_2_0;
          }
          if (param1 != 84) {
            var6 = (java.applet.Applet) null;
            kl.a((java.applet.Applet) null, (byte) -97);
          }
          var3 = ge.b((byte) 35);
          var4 = 0;
          while (true) {
            if (var4 >= var3.length) {
              stackIn_12_0 = ih.field_c;
              return stackIn_12_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, -124)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("kl.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
    }
}

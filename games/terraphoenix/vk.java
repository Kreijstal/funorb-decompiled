/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String field_a;
    static int field_c;
    static java.security.SecureRandom field_b;
    static ci field_d;

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Terraphoenix.field_V;
        try {
          if (!si.o(param0 + 8187)) {
            if (null != a.field_b &&
              a.field_b.field_d) {
              ga.b((byte) 82);
              cl.field_J.a((gl) (new hi(cl.field_J, ql.field_e)), (byte) -1);
            }
            return;
          }
          cl.field_J.a(true, q.field_Hb, dm.field_g, 120);
          if (param0 != -8177) {
            vk.a(87);
          }
          cl.field_J.i((byte) 126);
          while (fd.d(1)) {
            cl.field_J.a(lf.field_c, ua.field_g, (byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
    }

    final static kf a(boolean param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        kf[] var3 = null;
        kf var5 = null;
        int var6 = 0;
        kf stackIn_4_0 = null;
        kf stackIn_10_0 = null;
        kf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          var2 = tb.a(-119, "jagex-last-login-method", param1);
          if (var2 == null) {
            stackIn_4_0 = gm.field_j;
            return stackIn_4_0;
          }
          var3 = fm.a(param0);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a((byte) -126, var2)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          stackIn_13_0 = gm.field_j;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("vk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 == 10417) {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
        field_b = (java.security.SecureRandom) null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_a = "UFO preparing to launch";
        field_c = 640;
    }
}

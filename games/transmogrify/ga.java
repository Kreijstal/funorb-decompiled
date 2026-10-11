/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static volatile int field_b;
    static rj field_a;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 3336) {
            field_a = (rj) null;
          }
          for (var2_int = 0; param0.length() > var2_int; var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!k.a((char) var3, -37) &&
              !dj.a((char) var3, true)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ga.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kh a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        kh[] var3 = null;
        kh var5 = null;
        int var6 = 0;
        kh stackIn_3_0 = null;
        kh stackIn_7_0 = null;
        kh stackIn_13_0 = null;
        kh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 <= 58) {
            stackIn_3_0 = (kh) null;
            return stackIn_3_0;
          }
          var2 = lj.a(true, "jagex-last-login-method", param1);
          if (var2 == null) {
            stackIn_7_0 = qe.field_x;
            return stackIn_7_0;
          }
          var3 = hd.b((byte) 87);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, 0)) {
              stackIn_13_0 = var5;
              return stackIn_13_0;
            }
          }
          stackIn_16_0 = qe.field_x;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = -87;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        java.applet.Applet var2 = null;
        java.applet.Applet var2Lifetime1;
        java.applet.Applet var2Lifetime2;
        if (si.field_l == 0 - tf.field_a) {
          if (param0 == 94) {
            si.field_l = si.field_l + 1;
            return;
          }
          var2 = (java.applet.Applet) null;
          ga.a(49, (java.applet.Applet) null);
          si.field_l = si.field_l + 1;
          return;
        }
        if (si.field_l == 250 - tf.field_a) {
          if (param0 == 94) {
            si.field_l = si.field_l + 1;
            return;
          }
          var2Lifetime1 = (java.applet.Applet) null;
          ga.a(49, (java.applet.Applet) null);
          si.field_l = si.field_l + 1;
          return;
        }
        if (param0 == 94) {
          si.field_l = si.field_l + 1;
          return;
        }
        var2Lifetime2 = (java.applet.Applet) null;
        ga.a(49, (java.applet.Applet) null);
        si.field_l = si.field_l + 1;
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -35) {
          field_a = (rj) null;
          if (param0 == 16711935) {
            return 0;
          }
          return ((param0 & 240) >> 4) + ((61440 & param0) >> 8);
        }
        if (param0 == 16711935) {
          return 0;
        }
        return ((param0 & 240) >> 4) + ((61440 & param0) >> 8);
    }

    static {
        field_b = 0;
    }
}

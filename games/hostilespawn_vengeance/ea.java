/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    static String[] field_f;
    static int field_c;
    static String[] field_a;
    static float field_d;
    static bd field_e;

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              me.a((java.awt.Component) (Object) param0, 118);
              dc.a((java.awt.Component) (Object) param0, (byte) 48);
              if (null == h.field_b) {
                break L1;
              } else {
                h.field_b.a((java.awt.Component) (Object) param0, (byte) 86);
                break L1;
              }
            }
            if (param1 == 0) {
              break L0;
            } else {
              var3 = null;
              ea.a((java.awt.Canvas) null, 44);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ea.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) nj.field_c);
            if (param0 != 1) {
                Object var3 = null;
                ea.a(-106, (java.awt.Component) null);
            }
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_c);
            uc.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ea.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jd param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        en var7 = null;
        en var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var7 = s.field_b;
            var8 = var7;
            var8.i(19319, 3);
            var8.field_i = var8.field_i + 1;
            var4 = var8.field_i;
            var8.d(103, 1);
            var8.a((byte) -121, param0.field_u);
            var8.a((byte) -126, param0.field_t);
            var8.a((byte) -127, param0.field_j);
            var8.b(param0.field_r, 25251);
            var8.b(param0.field_n, 25251);
            var8.b(param0.field_p, 25251);
            var8.b(param0.field_m, 25251);
            var8.d(119, param0.field_w.length);
            var5 = 0;
            L1: while (true) {
              if (param0.field_w.length <= var5) {
                L2: {
                  int discarded$1 = var8.f(var4, 108);
                  if (param2 > 33) {
                    break L2;
                  } else {
                    field_e = null;
                    break L2;
                  }
                }
                var8.a(var8.field_i - var4, -19720);
                break L0;
              } else {
                var7.b(param0.field_w[var5], 25251);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ea.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 3 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Get to the lift before the charges detonate!";
        field_d = 0.0f;
    }
}
